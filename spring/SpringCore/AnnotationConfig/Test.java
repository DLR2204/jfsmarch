package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com")

public class Test {
	
	public static void main(String[] args) {
		
//	ApplicationContext factory = new AnnotationConfigApplicationContext(Test.class);	
		
		
		BeanFactory factory  = new AnnotationConfigApplicationContext(Test.class);
		
		
		System.out.println(factory.getBean("emp"));
		
		System.out.println(factory.getBean("add"));
	}
		
	}


