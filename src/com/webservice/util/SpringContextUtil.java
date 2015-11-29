package com.webservice.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextUtil   implements ApplicationContextAware{

	
	//Sring应用上下文
	private static ApplicationContext applicationContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub
		SpringContextUtil.applicationContext=applicationContext;
		
	}
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
  public static Object getBean(String name){
	 if(applicationContext==null){
		  applicationContext = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});   
	 }
		 
	  return applicationContext.getBean(name);
	  
  }
}
