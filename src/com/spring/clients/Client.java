package com.spring.clients;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("app.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		System.out.println("xml document valid");
		
	}

}
