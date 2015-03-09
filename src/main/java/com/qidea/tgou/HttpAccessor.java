/*
 * HttpAccessor.java
 * 
 * 
 * @author luoxiaoyong@yhd.com
 * @version 1.0
 */
package com.qidea.tgou;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.httpclient.ConnectTimeoutException;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;


/**
 *
 */
public class HttpAccessor {
	
	/**
	 * @param url
	 * @param param
	 * @return
	 * @throws HttpException
	 */
	public String get(String url, Map<String, String> param) throws HttpException {
		return get(url, param, 3000, 3000);
	}
	
	/**
	 * @param url
	 * @param param
	 * @param connectionTimeout
	 * @param soTimeout
	 * @return
	 * @throws HttpException
	 */
	public String get(String url, Map<String, String> param, int connectionTimeout, int soTimeout) throws HttpException {
		HttpClient client = new HttpClient();

		// 请求超时时间
		client.getParams().setIntParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, connectionTimeout);
		// 响应超时时间
		client.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, soTimeout);

		StringBuilder sb = new StringBuilder(url);
		if (! param.isEmpty()) {
			sb.append("?");
			for (Entry<String, String> entry : param.entrySet()) {
				sb.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
			}
			url = sb.toString();
			url = url.substring(0, url.length() - 1);
		}
		GetMethod get = new GetMethod(url);
		get.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "utf-8");
		get.addRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");

		String resp = null;

		try {
			client.executeMethod(get);
			byte[] responseBody = get.getResponseBodyAsString().getBytes(get.getResponseCharSet());

			// 在返回响应消息使用编码(utf-8)
			resp = new String(responseBody, "utf-8");
		} catch (IOException e) {
			throw new HttpException(new StringBuilder("POST ").append(url).append(" ")
					.append(get.getStatusText()).append("(").append(get.getStatusCode()).append("").toString(), e);
		} finally {
			if (get != null) {
				get.releaseConnection();
			}
		}
		return resp;
	}
	
	/**
	 * @param service
	 * @param param
	 * @return
	 * @throws HttpException
	 */
	public String post(String service, Map<String, String> param) throws HttpException {
		return post(service, param, 3000, 3000);
	}
	
	/**
	 * @param url
	 * @param param
	 * @param connectionTimeout
	 * @param soTimeout
	 * @return
	 * @throws HttpException
	 */
	public String post(String url, Map<String, String> param, int connectionTimeout, int soTimeout) throws HttpException {
		Protocol protocol = new Protocol("https", new MySecureProtocolSocketFactory(), 443);
		Protocol.registerProtocol("https", protocol); // 忽略证书有效性检查

		HttpClient client = new HttpClient();
		
//		org.apache.http.client.HttpClient http = new DefaultHttpClient();
//		HttpUriRequest httpurirequest = new HttpPost("");
//		httpurirequest.setParams(null);
//		http.execute(httpurirequest);
		// 请求超时时间
		client.getParams().setIntParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, connectionTimeout);
		// 响应超时时间
		client.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, soTimeout);

		PostMethod post = new PostMethod(url);
		for(Entry<String, String> entry : param.entrySet()) {
			post.setParameter(entry.getKey(), entry.getValue());
		}

//		HttpClientContext context = HttpClientContext.create();
		
		String resp = null;
		try {
			client.executeMethod(post);
			int status = post.getStatusCode();
			if (status == 200) {
				resp = post.getResponseBodyAsString();
			} else if (status >= 300 && status <= 399) {
				Header locationHeader = post.getResponseHeader("location");
				String location = locationHeader.getValue();
				return post(location, new HashMap<String, String>());
			}
		} catch (IOException e) {
			throw new HttpException(new StringBuilder("POST ").append(url).append(" fail.").toString(), e);
		} finally {
			if (post != null) {
				post.releaseConnection();
			}
		}

		return resp;
	}
}
