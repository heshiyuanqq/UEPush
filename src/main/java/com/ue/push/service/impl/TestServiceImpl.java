package com.ue.push.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.ue.uecommon.serviceInterface.TestService;


@Service()
public class TestServiceImpl implements TestService{

	public String hello(String name) {
		return "hello "+name+"!";
	}

}
