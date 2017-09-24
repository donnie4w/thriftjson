package com.bln.main;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.thrift.TBase;
import org.apache.thrift.TServiceClient;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TIOStreamTransport;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;

/**
 * @File:blnapp: com.bln.controller :SJson2TJsonUtil.java
 * @Date:2017年9月5日
 * @Copyright (c) 2017, donnie4w@gmail.com All Rights Reserved.
 * @Author: dong
 * @Desc:
 */
public class SJson2TJsonUtil {
	public static void closeStream(Closeable io) {
		try {
			if (io != null) {
				io.close();
			}
		} catch (Exception e) {
		}
	}

	public static String sjson2tjson(InputStream is, String method, Class<?> clazz) {
		String ret = null;
		try {
			ByteArrayOutputStream isr = new ByteArrayOutputStream();
			int i = 0;
			byte[] bb = new byte[256];
			while ((i = is.read(bb)) != -1) {
				isr.write(bb, 0, i);
			}
			String reqStr = new String(isr.toByteArray(), "utf-8");
			closeStream(isr);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			TIOStreamTransport tiost = new TIOStreamTransport(baos);
			TProtocol protocol = new TJSONProtocol(tiost);
			Constructor<?> cons = clazz.getDeclaredConstructor(TProtocol.class);
			TServiceClient client = (TServiceClient) cons.newInstance(protocol);
			Method m = null;
			for (Method me : clazz.getMethods()) {
				if (me.getName().equals("send_" + method)) {
					m = me;
					break;
				}
			}
			if (m == null) {
				throw new Exception("mehtod err. " + method);
			}
			m.invoke(client, JSON.parseObject(reqStr, m.getParameterTypes()[0]));
			ret = new String(baos.toByteArray());
			closeStream(baos);
		} catch (Exception e) {
		}
		return ret;
	}

	public static int parseInt(String s) {
		try {
			if (s != null) {
				return Integer.parseInt(s);
			}
		} catch (Exception e) {
		}
		return 0;
	}

	@SuppressWarnings("rawtypes")
	public static String tjson2sjson(byte[] result, String method, Class clazz) throws Exception {
		Class innerClazz[] = clazz.getDeclaredClasses();
		TBase r = null;
		for (Class cls : innerClazz) {
			if (cls.getSimpleName().equals(method + "_result")) {
				r = (TBase) cls.newInstance();
				break;
			}
		}
		if (r == null) {
			throw new Exception("method err. " + method);
		}
		ByteArrayInputStream bais = new ByteArrayInputStream(result);
		TProtocol inProtocol2 = new TJSONProtocol(new TIOStreamTransport(bais));
		inProtocol2.readMessageBegin();
		r.read(inProtocol2);
		inProtocol2.readMessageEnd();
		String s = new Gson().toJson(r).replaceAll(",\"__isset_bitfield\":[0-9]", "");
		return JSON.parseObject(s).getJSONObject("success").toString();
	}

}
