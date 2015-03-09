/*
 * @(#)RequestTokenResponse.java	1.0 2015-3-3 下午05:32:17
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
package com.qidea.tgou;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 
 * 
 * 
 * @author luoxiaoyong
 * @version 1.0  2015-3-3 下午05:32:17
 * @since 1.0
 */
public class RequestTokenResponse {

	private boolean oauth_callback_confirmed;
	
	private String oauth_token;
	
	private String oauth_token_secret;
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}


	/**
	 * @return the oauth_callback_confirmed
	 */
	public boolean isOauth_callback_confirmed() {
		return oauth_callback_confirmed;
	}


	/**
	 * @param oauth_callback_confirmed the oauth_callback_confirmed to set
	 */
	public void setOauth_callback_confirmed(boolean oauth_callback_confirmed) {
		this.oauth_callback_confirmed = oauth_callback_confirmed;
	}


	/**
	 * @return the oauth_token
	 */
	public String getOauth_token() {
		return oauth_token;
	}

	/**
	 * @param oauth_token the oauth_token to set
	 */
	public void setOauth_token(String oauth_token) {
		this.oauth_token = oauth_token;
	}

	/**
	 * @return the oauth_token_secret
	 */
	public String getOauth_token_secret() {
		return oauth_token_secret;
	}

	/**
	 * @param oauth_token_secret the oauth_token_secret to set
	 */
	public void setOauth_token_secret(String oauth_token_secret) {
		this.oauth_token_secret = oauth_token_secret;
	}
	
	
}
