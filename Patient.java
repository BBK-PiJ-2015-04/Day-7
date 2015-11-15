public class Patient {

	private String name;
	private int age;
	private String illness;
	private Patient next;

	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
	}

	public Patient getNext() {
		return next;
	}
	
	public void setNext(Patient nextPatient) {
		this.next = nextPatient;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIllness() {
		return illness;
	}
	
	public void setIllness(String illness) {
		this.illness = illness;
	}
	
	public void printPatient() {
		System.out.println("Patient Name: " + name);
		System.out.println("Patient Age: " + age);
		System.out.println("Patient Illness: " + illness);
		if (next != null) {
			System.out.println("Next Patient's Name: " + next.name);
			System.out.println();
		}
		else {
			System.out.println("No Next Patient!");
			System.out.println();
		}
	}

}
