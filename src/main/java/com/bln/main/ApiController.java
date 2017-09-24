package com.bln.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bln.tf.protocol.IBlnServices;

/**
 * @File:blnapp: com.bln.controller :ApiController.java
 * @Date:2017年9月4日
 * @Copyright (c) 2017, donnie4w@gmail.com All Rights Reserved.
 * @Author: dong
 * @Desc:
 */

@Controller
public class ApiController {

	@RequestMapping("/apic.do")
	public void routeCompact(HttpServletRequest request, HttpServletResponse response) {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		IBlnServices.Processor processor = new IBlnServices.Processor(new ServiceImpl());
		new ApiControllerUtil(processor, IBlnServices.class, IBlnServices.Client.class).routeCompact(request, response);
	}

	@RequestMapping("/apij2j.do")
	public void routeJson2Json(HttpServletRequest request, HttpServletResponse response) {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		IBlnServices.Processor processor = new IBlnServices.Processor(new ServiceImpl());
		new ApiControllerUtil(processor, IBlnServices.class, IBlnServices.Client.class).routeJson2Json(request,
				response);
	}

}