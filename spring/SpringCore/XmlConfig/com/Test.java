package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
	ApplicationContext factory = new ClassPathXmlApplicationContext("SpringConfig.xml");	
		
//		Resource resource = new ClassPathResource("SpringConfig.xml");
//		
//		BeanFactory factory  = new XmlBeanFactory(resource);
		
		
		System.out.println(factory.getBean("emp"));
	}
		
	}


