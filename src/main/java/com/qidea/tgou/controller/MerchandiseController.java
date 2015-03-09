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

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qidea.tgou.Merchandise;
import com.qidea.tgou.service.MerchandiseService;

/**
 * 
 * 
 * 
 * @author luoxiaoyong
 * @version 1.0  2015-3-4 下午02:01:11
 * @since 1.0
 */
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
}
