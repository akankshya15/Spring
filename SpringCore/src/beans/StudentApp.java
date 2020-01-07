package beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class StudentApp {

	public static void main(String args[]){
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans/SpringAddress.xml");
		Student s= (Student) ctx.getBean("std");
		//s.setRegno(123);
		//s.setName("Akankshya");
		System.out.println(s.getRegno()+" "+s.getName()+" "
		+s.getAddr().getStreet()+" "+s.getAddr().getCity());
	}
}
