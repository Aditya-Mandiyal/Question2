package com.godigit.ques2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	Training t1=(Training)context.getBean("training");
	t1.showTrainingDetails();
}
}
