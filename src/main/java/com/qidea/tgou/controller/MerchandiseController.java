/*
 * @(#)MerchandiseController.java	1.0 2015-3-4 下午02:01:11
 *
 * Copyright 2008 WWW.YHD.COM. All rights reserved.
 *      YIHAODIAN PROPRIETARY/CONFIDENTIAL. 
 *       Use is subject to license terms.
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the WWW.YHD.COM License is distributed on an "AS 
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either ex-
 * press or implied. See the License for the specific language govern-
 * ing permissions and limitations under the License.
 */
package com.qidea.tgou.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.httpclient.HttpException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qidea.tgou.HttpTemplate;
import com.qidea.tgou.JsonStream;
import com.qidea.tgou.MD5;
import com.qidea.tgou.Merchandise;
import com.qidea.tgou.RequestTokenResponse;
import com.qidea.tgou.SerializationException;
import com.qidea.tgou.SignatureException;
import com.qidea.tgou.service.MerchandiseService;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

/**
 * 
 * 
 * 
 * @author luoxiaoyong
 * @version 1.0  2015-3-4 下午02:01:11
 * @since 1.0
 */
@Controller
public class MerchandiseController {

	@Autowired
	private MerchandiseService merchandiseService;
	
	@RequestMapping(value = "/tgou/index")
	public String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		long firstResult = 0;
		int maxResultSize = 50;
		List<Merchandise> results = merchandiseService.list(firstResult, maxResultSize);
		model.addAttribute("merchandises", results);
		return "tgou/index";
	}
	
	private List<Map.Entry<String, String>> sort(Map<String, String> paramMap) {
		List<Map.Entry<String, String>> asList = new ArrayList<Map.Entry<String, String>>(paramMap.entrySet());
		Collections.sort(asList, new Comparator<Map.Entry<String, String>>(){
			public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2){
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		return asList;
	}
	
	public RequestTokenResponse getRequestToken() {
		HttpTemplate template = new HttpTemplate();
		
		Map<String, String> param = new HashMap<String, String>();
		param.put("oauth_consumer_key", "");
		param.put("oauth_signature_method", "md5");
		param.put("oauth_timestamp", "123456");
		param.put("oauth_nonce", "abcdef");
		
		List<Map.Entry<String, String>> sortlist = sort(param);
		
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, String> entry : sortlist) {
			if (! "oauth_signature".equals(entry.getKey())) {
				sb.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
			}
		}
		System.out.println("sign(sort): " + sb.toString());
		
//		sb.deleteCharAt(sb.length() - 1);
		sb.append("oauth_token_secret").append("=").append("");
		String sign = sb.toString();
		System.out.println("sign(sort + secret): " + sign);
		
		String _signature = null;
		try {
			_signature = MD5.sign(sign);
		} catch (SignatureException e) {
			e.printStackTrace();
		}
		System.out.println("_signature: " + _signature);
		param.put("oauth_signature", _signature);
		
		String resp = null;
		try {
			resp = template.post("https://passport.yhd.com/oauth/request_token.do", param);
		} catch (HttpException e) {
			e.printStackTrace();
		}
		System.out.println("response: " + resp);
		
		JsonStream jsonStream = new JsonStream(new JettisonMappedXmlDriver());
		RequestTokenResponse data = null;
		try {
			data = (RequestTokenResponse) jsonStream.deserialize(resp, "response", RequestTokenResponse.class);
			System.out.println("response data: " + data);
		} catch (SerializationException e) {
			return null;
		}
		return data;
	}

	@RequestMapping(value = "/tgou/merchandise/{id}")
	public String m(@PathVariable int id, HttpServletRequest request, HttpServletResponse response, Model model) {
		String url = request.getParameter("link");
		
		
		RequestTokenResponse token = getRequestToken();
		HttpTemplate template = new HttpTemplate();
		
		Map<String, String> param = new HashMap<String, String>();
		param = new HashMap<String, String>();
		param.put("method", "direct");
		param.put("user_id", "123456");
		param.put("oauth_token", token.getOauth_token());
		param.put("oauth_callback", "http://www.yhd.com");
		
		model.addAttribute("method", "direct");
		model.addAttribute("user_id", "123456");
		model.addAttribute("oauth_token", token.getOauth_token());
		model.addAttribute("oauth_callback", url);
		model.addAttribute("authorize_url", "https://passport.yhd.com/oauth/authorize.do");
		return "tgou/merchandise-adapter";
	}
}
