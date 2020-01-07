package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import annotation.Customer;

public class CutomerApp {
	public static void main(String args[]){
		

		ApplicationContext ctx= new ClassPathXmlApplicationContext("annotation/SpringAnnotation.xml");
		Customer c= ctx.getBean("cust" ,Customer.class);
		
		System.out.println(c.getCode()+" "+c.getName());
	}

}
