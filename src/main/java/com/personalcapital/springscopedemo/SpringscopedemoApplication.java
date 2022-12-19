package com.personalcapital.springscopedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringscopedemoApplication
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(
				SpringscopedemoApplication.class, args);
		EmpowerHardDeleteRecordsCommand beanA = context.getBean(
				EmpowerHardDeleteRecordsCommand.class);
		SyncEmpowerAccountCommand beanB = context.getBean(SyncEmpowerAccountCommand.class);
		UserLoginScenario beanC = context.getBean(UserLoginScenario.class);

		beanC.callAPI();
		beanA.callAPI();
		beanB.callAPI();

		beanC.callAPI();
	}

}
