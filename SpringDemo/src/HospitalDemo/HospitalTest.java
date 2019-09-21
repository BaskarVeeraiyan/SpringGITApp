package HospitalDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HospitalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "resource/context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		int num = context.getBeanDefinitionCount();
		Hospital h = context.getBean(Hospital.class);
		System.out.println(num);
		System.out.println(h.getName());
		System.out.println(h.getNumber());
		
	}

}
