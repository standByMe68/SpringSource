package com.Test;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.GregorianCalendar;
import java.util.Locale;

public class MassageTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext cxc = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

		/**
		 * 设置是否允许bean覆盖
		 *//*
		cxc.setAllowBeanDefinitionOverriding(false);
		*//**
		 * 设置是否允许循环依赖
		 *//*
		cxc.setAllowCircularReferences(false);*/


		MessageSource massageSouce= (MessageSource) cxc.getBean("myMessage");
		Object[] param = {"test", new GregorianCalendar().getTime()};
		System.out.println("success for test");
	}


}



