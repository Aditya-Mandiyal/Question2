package com.godigit.package1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import package1.Bank;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Bank b1=(Bank)context.getBean("bank");
		b1.welcomeNote();

	}

}
