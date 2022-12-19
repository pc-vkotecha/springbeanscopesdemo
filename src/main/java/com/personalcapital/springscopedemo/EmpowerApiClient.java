package com.personalcapital.springscopedemo;

import org.springframework.stereotype.Component;

@Component
public class EmpowerApiClient
{
	private String callerType;

	public void callAPI(){
		System.out.println("Calling Empower API with callerType ......" +callerType);
	}

	public String getCallerType()
	{
		return callerType;
	}

	public void setCallerType(String callerType)
	{
		this.callerType = callerType;
	}
}
