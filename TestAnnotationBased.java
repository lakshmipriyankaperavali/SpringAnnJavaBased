package com.annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationBased {

	public static void main(String[] args)
	{
	ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
	Student st=ap.getBean("obj",Student.class);
	System.out.println(st.getId()+":" +st.getName());

	}
	}

