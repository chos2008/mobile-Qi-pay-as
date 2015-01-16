/*
 * PaymentController.java, 2011-10-11 ÏÂÎç05:44:19 xyluo
 * 
 * Copyright (c) 2011 Shanghai Qi(dea) Information Technology Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Qi(dea) or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package com.qidea.payment.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qidea.payment.Service;
import com.qidea.payment.Ta;
import com.qidea.payment.ThirdPaymentService;

/**
 * 
 * 
 * @author xiaoyong
 * @version 1.0, 2011-10-11 
 * @since 1.0
 */
@Controller(value = "PaymentController")
//@RequestMapping(value = "/rest")
public class PaymentController {

	@Autowired()
	private ThirdPaymentService thirdPaymentService;
	
	/**
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/pay/center")
	public String pay(HttpServletRequest request, HttpServletResponse response, Model model) {
		List<Ta> tas = thirdPaymentService.list();
		model.addAttribute("tas", tas);
		return "pc";
	}
	
	/**
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/p")
	public String p(HttpServletRequest request, HttpServletResponse response, Model model) {
		Service service = new Service("https://wappaygw.alipay.com/service/rest.htm");
		
		Map<String, String> list = new HashMap<String, String>();
		list.put("service", "alipay.wap.trade.create.direct");
		service.setRequestParameterDomainList(list);
		
		model.addAttribute("service", service);
		return "f";
	}
	
	/**
	 * 
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "/pay/notify")
	public String notify(HttpServletRequest request, HttpServletResponse response) {
		return "ta/notify";
	}
}