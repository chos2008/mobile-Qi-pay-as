/*
 * @(#)MerchandiseServiceImpl.java	1.0 2015-3-4 下午02:03:25
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
package com.qidea.tgou.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qidea.tgou.Merchandise;
import com.qidea.tgou.service.MerchandiseService;

/**
 * 
 * 
 * 
 * @author luoxiaoyong
 * @version 1.0  2015-3-4 下午02:03:25
 * @since 1.0
 */
@Service(value = "merchandiseService")
public class MerchandiseServiceImpl implements MerchandiseService {

	@Autowired()
	private SqlSessionTemplate template;
	
	public List<Merchandise> list(long firstResult, int maxResultSize) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("firstResult", firstResult);
		param.put("maxResultSize", maxResultSize);
		return template.selectList("p-list", param);
	}
}
