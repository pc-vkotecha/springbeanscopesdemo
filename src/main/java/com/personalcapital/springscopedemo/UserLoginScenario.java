package com.personalcapital.springscopedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginScenario
{
	@Autowired
	private EmpowerApiClient empowerApiClient;

	public void callAPI()
	{
		empowerApiClient.callAPI();
	}

}
