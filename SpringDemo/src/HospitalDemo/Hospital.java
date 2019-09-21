package HospitalDemo;

public class Hospital {
	String name;
	long number;
	public Hospital () {
		System.out.println("Default Cons.....");
	}
	
	/*public Hospital(String name) {
		this.name = name;
	}*/
	
	public Hospital(String name, long number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}
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
