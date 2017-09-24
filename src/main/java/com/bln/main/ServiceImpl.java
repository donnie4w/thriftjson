package com.bln.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.thrift.TException;

import com.bln.tf.protocol.BlnAckBean;
import com.bln.tf.protocol.BlnPageBean;
import com.bln.tf.protocol.BlnTestBeanReq;
import com.bln.tf.protocol.BlnTestResult;
import com.bln.tf.protocol.IBlnServices;

public class ServiceImpl implements IBlnServices.Iface {

	@Override
	public BlnTestResult blntest(BlnTestBeanReq btb) throws TException {
		System.out.println("blntest>>>>>" + btb);
		BlnTestResult btr = new BlnTestResult();
		Map<String, String> map = new HashMap<String, String>();
		map.put("wu", "123456");
		btr.setAck(new BlnAckBean().setPage(new BlnPageBean().setLastFlagInt(100)).setStatus(200).setAckCode("1000")
				.setAckDesc("ack描述").setExtramap(map)).setS("test").setI(0);
		List<String> list = new ArrayList<>();
		list.add("listTest");
		list.add("listTest2");
		btr.setLs(list);
		return btr;
	}
}
