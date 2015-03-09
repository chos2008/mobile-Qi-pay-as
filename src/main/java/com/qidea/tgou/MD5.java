/*
 * @(#)MD5.java	1.0 2015-2-15 下午06:16:30
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

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 
 * 
 * 
 * @author luoxiaoyong
 * @version 1.0  2015-2-15 下午06:16:30
 * @since 1.0
 */
public class MD5 {

	public static String sign(String signature) throws SignatureException {
		byte[] btInput = signature.getBytes();
        MessageDigest mdInst = null;
		try {
			mdInst = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			throw new SignatureException(e);
		}
		mdInst.update(btInput);
		byte[] md = mdInst.digest();
		return Base64.byteArrayToBase64(md);
	}
	
	public static String sign1(String signature) throws SignatureException {
		byte[] btInput = signature.getBytes();
        MessageDigest mdInst = null;
		try {
			mdInst = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			throw new SignatureException(e);
		}
		mdInst.update(btInput);
		byte[] md = mdInst.digest();
		
		org.apache.commons.codec.binary.Base64 base64 = new  org.apache.commons.codec.binary.Base64();
		
		return new String(base64.encode(md));
	}
}
