/*
 * @(#)SignatureException.java	1.0 2015-2-15 下午06:19:36
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

/**
 * 
 * 
 * 
 * @author luoxiaoyong
 * @version 1.0  2015-2-15 下午06:19:36
 * @since 1.0
 */
public class SignatureException extends Exception {

	private static final long serialVersionUID = 4743279928584691887L;

	/**
	 * 
	 */
	public SignatureException() {
		super();
	}

	/**
	 * @param message
	 */
	public SignatureException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public SignatureException(Throwable cause) {
		super(cause);
	}

	
}
