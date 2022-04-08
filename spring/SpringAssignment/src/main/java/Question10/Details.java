package Question10;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Details implements ApplicationContextAware{

	private ApplicationContext context= null;
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.context=applicationContext;
	}
	
	public void details() {
		PeopleService peopleService = (PeopleService) context.getBean("peopledetails");
		
		System.out.println("1st person name :"+peopleService.Person1.getName()+"Contact number"+peopleService.Person1.getContact());
		System.out.println("2nd person name :"+peopleService.Person2.getName()+"Contact number"+peopleService.Person2.getContact());
	}

}
