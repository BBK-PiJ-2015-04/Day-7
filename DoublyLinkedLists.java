// UNDER CONSTRUCTION !!!

public class DoublyLinkedLists {

	public static void main(String[] args) {
		
		DoubleHospitalManager patientList = new DoubleHospitalManager();
		
		String str;
		String name;
		int age;
		String illness;
		
		System.out.println();
		System.out.println("Let's add patients to our list.");
		System.out.println();
		
		while(true) {
			System.out.print("Enter the name of the patient (end with 0): ");
			name = System.console().readLine();
			if(name.equals("0")) {
				break;
			}
			System.out.print("Enter the age of the patient: ");
			str = System.console().readLine();
			age = Integer.parseInt(str);
			System.out.print("Enter the illness of the patient: ");
			illness = System.console().readLine();
			DoublePatient newGuy = new DoublePatient(name, age, illness);
			patientList.addPatient(newGuy);
			patientList.prettyPrint();
		}
		
		System.out.println();
		System.out.println("Let's delete patients from our list.");
		System.out.println();
		
		while(true) {
			System.out.print("Enter the name of the patient (end with 0): ");
			name = System.console().readLine();
			if(name.equals("0")) {
				break;
			}
			patientList.deletePatient(name);
			patientList.prettyPrint();
		}
	}
	
}
