package Question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Q2.xml");
		
		inject Inject = (inject) context.getBean("Question");
		Inject.displaylist();
		
		System.out.println("============================================");
		inject Inject1 = (inject) context.getBean("Question1");
		Inject1.displayset();
		
		System.out.println("============================================");
		inject Inject2 = (inject) context.getBean("Question2");
		Inject2.displaymap();
	}

}
