package HospitalAnnotation;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/context.xml");
		int i = context.getBeanDefinitionCount();
		String[] d=context.getBeanDefinitionNames();
		HospAnn h = context.getBean(HospAnn.class);
		System.out.println(i);
		System.out.println(h);
		System.out.println(Arrays.toString(d));
	}

}
