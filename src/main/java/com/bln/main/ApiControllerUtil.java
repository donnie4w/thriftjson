package com.bln.main;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.TIOStreamTransport;
import org.apache.thrift.transport.TTransport;

import java.io.ByteArrayInputStream;

/**
 * @File:blnapp: com.bln.controller :ApiController.java
 * @Date:2017年9月4日
 * @Copyright (c) 2017, donnie4w@gmail.com All Rights Reserved.
 * @Author: dong
 * @Desc:
 */

public class ApiControllerUtil {
	protected static TProtocolFactory inProtocolFactoryTCompact = new TCompactProtocol.Factory();
	protected static TProtocolFactory outProtocolFactoryTCompact = new TCompactProtocol.Factory();
	protected static TProtocolFactory inProtocolFactoryJSon = new TJSONProtocol.Factory();
	protected static TProtocolFactory outProtocolFactoryJSon = new TJSONProtocol.Factory();
	private TProcessor processor;
	private Class<?> serviceClass;
	private Class<?> clientClass;

	public ApiControllerUtil(TProcessor processor, Class<?> serviceClass, Class<?> clientClass) {
		this.processor = processor;
		this.serviceClass = serviceClass;
		this.clientClass = clientClass;
	}

	public void routeCompact(HttpServletRequest request, HttpServletResponse response) {
		OutputStream out = null;
		InputStream in = null;
		TTransport inTransport = null;
		TTransport outTransport = null;
		try {
			in = request.getInputStream();
			out = response.getOutputStream();
			TTransport transport = new TIOStreamTransport(in, out);
			inTransport = transport;
			outTransport = transport;
			TProtocol inProtocol = inProtocolFactoryTCompact.getProtocol(inTransport);
			TProtocol outProtocol = outProtocolFactoryTCompact.getProtocol(outTransport);
			processor.process(inProtocol, outProtocol);
			transport.flush();
		} catch (Exception te) {
		} finally {
			closeStream(in);
			closeStream(out);
		}
	}

	public void routeJson2Json(HttpServletRequest request, HttpServletResponse response) {
		TTransport inTransport = null;
		TTransport outTransport = null;
		String method = request.getHeader("method");
		try {
			String json = SJson2TJsonUtil.sjson2tjson(request.getInputStream(), method, clientClass);
			ByteArrayInputStream in = new ByteArrayInputStream(json.getBytes());
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			TTransport transport = new TIOStreamTransport(in, baos);
			inTransport = transport;
			outTransport = transport;
			TProtocol inProtocol = inProtocolFactoryJSon.getProtocol(inTransport);
			TProtocol outProtocol = outProtocolFactoryJSon.getProtocol(outTransport);
			processor.process(inProtocol, outProtocol);
			transport.flush();
			String result = SJson2TJsonUtil.tjson2sjson(baos.toByteArray(), method, serviceClass);
			response.getOutputStream().write(result.getBytes("utf-8"));
		} catch (Exception te) {
		} finally {
		}
	}

	public static void closeStream(Closeable io) {
		try {
			if (io != null) {
				io.close();
			}
		} catch (Exception e) {
		}
	}
}