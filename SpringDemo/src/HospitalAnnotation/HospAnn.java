package HospitalAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HospAnn {
	
	
	
	String name;
	long number;
	public HospAnn () {
		System.out.println("Default Cons.....");
	}
	
	public HospAnn(@Value("7878787")long number) {
		this.number = number;
	}
	
	public HospAnn(@Value("ghdeghxe")String name,long number) {
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	@Value("vhvs")
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public void call () {
		System.out.println("Calling method....");
		
	}

}
