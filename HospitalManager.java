public class HospitalManager {

	private Patient start = null;
	
	public HospitalManager() {
		this.start = null;
	}

	public void addPatient(Patient newPatient) {
		if(start == null) {
			this.start = newPatient;
		}
		else {
			Patient current = start;
			while (current.getNext() !=null) {
				current = current.getNext();
			}
			current.setNext(newPatient);
		}
	}

	public void deletePatient(String oldPatient) {
		//System.out.println(start.getName());
		if(start == null) {
			return;
		}
		if(start.getName().equals(oldPatient)) {
			start = start.getNext();
		}
		else {
			Patient current = start;
			while (!current.getNext().getName().equals(oldPatient)) {
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
		}
	}
	
	
	public void prettyPrint() {
		Patient current = start;
		while (current != null) {
			System.out.println(current.getName() + " " + current.getAge() + " " + current.getIllness());
			current = current.getNext();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		HospitalManager patientList = new HospitalManager();
		String str;
		String name;
		int age;
		String illness;
		do {
			System.out.print("Enter the name of the patient (end with 0): ");
			name = System.console().readLine();
			System.out.print("Enter the age of the patient: ");
			str = System.console().readLine();
			age = Integer.parseInt(str);
			System.out.print("Enter the illness of the patient: ");
			illness = System.console().readLine();
			Patient newGuy = new Patient(name, age, illness);
			patientList.addPatient(newGuy);
		}
		while (!(name.equals("0")));
		patientList.prettyPrint();
		System.out.print("Enter the name of the patient to delete: ");
		name = System.console().readLine();
		patientList.deletePatient(name);
		patientList.prettyPrint();
	}
}
