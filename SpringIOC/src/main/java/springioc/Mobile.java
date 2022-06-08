package springioc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext C=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded...!");
		Airtel a=(Airtel)C.getBean("airtel");
		a.Calling();
		a.data();
		
		Sim s=C.getBean("sim",Sim.class);
		s.Calling();
		s.data();
	}

}
