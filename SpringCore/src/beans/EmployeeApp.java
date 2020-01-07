package beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class EmployeeApp {

	public static void main(String args[]){
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans/SpringAddress.xml");
		Employee s= ctx.getBean("emp", Employee.class);
		s.setEname("abcd");
		System.out.println(s.getEmpno()+" "+s.getEname()+" "+s.getJob());
		Employee e1=ctx.getBean("emp",Employee.class);
		System.out.println(e1.getEmpno()+" "+e1.getEname()+" "+e1.getJob()+" "+e1.getSkills());
	}
}
