package com.personalcapital.springscopedemo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@Scope("prototype")
public class EmpowerHardDeleteRecordsCommand
{

	@Autowired
	private EmpowerApiClient empowerApiClient;

	public void callAPI(){
		empowerApiClient.setCallerType("BATCH");
		empowerApiClient.callAPI();
	}


}
