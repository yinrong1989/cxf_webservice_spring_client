package com.test;
import com.webservice.ws.SayHello;
import com.webservice.ws.SayHelloWS;
import com.webservice.ws.Student;
import com.webservice.util.*;
public class SpringUtilTest {
public static void main(String[] args) {
	SayHelloWS sayHelloService  =	(SayHelloWS) SpringContextUtil.getBean("sayHelloWS");
	String str1=sayHelloService.sayHello();
	String str2=sayHelloService.yinrongSayHello("yinrong");
	Student student=sayHelloService.getStudentById("2");
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(student.getName());
	

}
}
