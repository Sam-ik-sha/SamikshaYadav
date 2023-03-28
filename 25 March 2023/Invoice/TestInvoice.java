package com.Lowes;
import org.springframework.beans.factory.BeanFactory; 
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestInvoice {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("applicationContext2.xml"); 
		BeanFactory fac = new XmlBeanFactory(r); 
		Invoice i  =(Invoice) fac.getBean("iBean");
		i.disp();

	}
}
