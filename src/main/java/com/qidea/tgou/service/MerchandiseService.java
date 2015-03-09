/*
 * @(#)MerchandiseService.java	1.0 2015-3-4 下午02:03:10
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
package com.qidea.tgou.service;

import java.util.List;

import com.qidea.tgou.Merchandise;

/**
 * 
 * 
 * 
 * @author luoxiaoyong
 * @version 1.0  2015-3-4 下午02:03:10
 * @since 1.0
 */
public interface MerchandiseService {

	public List<Merchandise> list(long firstResult, int maxResultSize);
	
}
