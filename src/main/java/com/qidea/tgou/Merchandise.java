/*
 * @(#)Merchandise.java	1.0 2015-3-4 下午02:05:41
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

import java.util.Date;

/**
 * 
 * 
 * 
 * @author luoxiaoyong
 * @version 1.0  2015-3-4 下午02:05:41
 * @since 1.0
 */
public class Merchandise {

	private long id;
	
	private String name;
	
	private int provider;
	
	private int providerCategory;
	
	private String url;
	
	private String image;
	
	private String category;
	
	private Date creation;
	
	private Date updation;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the provider
	 */
	public int getProvider() {
		return provider;
	}

	/**
	 * @param provider the provider to set
	 */
	public void setProvider(int provider) {
		this.provider = provider;
	}

	/**
	 * @return the providerCategory
	 */
	public int getProviderCategory() {
		return providerCategory;
	}

	/**
	 * @param providerCategory the providerCategory to set
	 */
	public void setProviderCategory(int providerCategory) {
		this.providerCategory = providerCategory;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the creation
	 */
	public Date getCreation() {
		return creation;
	}

	/**
	 * @param creation the creation to set
	 */
	public void setCreation(Date creation) {
		this.creation = creation;
	}

	/**
	 * @return the updation
	 */
	public Date getUpdation() {
		return updation;
	}

	/**
	 * @param updation the updation to set
	 */
	public void setUpdation(Date updation) {
		this.updation = updation;
	}
	
}
