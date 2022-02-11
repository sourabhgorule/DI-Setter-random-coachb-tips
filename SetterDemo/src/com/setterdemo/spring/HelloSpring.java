package com.setterdemo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach=context.getBean("thecoach",Coach.class);
		
		System.out.println("Today tip: "+coach.getdailyWorkout());
		System.out.println("Motivation: "+coach.getDailyMotivation());
		
		context.close();
		
	}

}
