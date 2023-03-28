package com.Lowes;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Testbank {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("/com/Lowes/applicationContext.xml");
		//specifying package name where xml is present
		BeanFactory fac = new XmlBeanFactory(r);
		Bank i = (Bank) fac.getBean("bnkBean");
		i.disp();
		}
	}
