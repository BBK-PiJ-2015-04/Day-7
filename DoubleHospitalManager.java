// UNDER CONSTRUCTION !!!


public class DoubleHospitalManager {

	private DoublePatient startList = null;
	
	public DoubleHospitalManager() {
		this.startList = null;
	}

	public void addPatient(DoublePatient newPatient) {
		if(startList == null) {
			this.startList = newPatient;
		}
		else {
			DoublePatient current = startList;
			while (current.getNext() !=null) {
				current = current.getNext();
			}
			current.setNext(newPatient);
		}
	}

	public void deletePatient(String oldPatient) {
		if(startList == null) {
			return;
		}
		if(startList.getName().equals(oldPatient)) {
			startList = startList.getNext();
		}
		else {
			DoublePatient current = startList;
			while (!current.getNext().getName().equals(oldPatient)) {
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
		}
	}
	
	public int listLength() {
		if(startList == null) {
			return 0;
		}
		if(startList.getNext() == null) {
			return 1;
		}
		int counter = 1;
		DoublePatient current = startList;
		while(current.getNext() != null) {
			counter++;
			current = current.getNext();
		}
		return counter;
	}
	
	public void prettyPrint() {
		DoublePatient current = startList;
		System.out.println();
		System.out.println("PATIENT LIST - Total of " + listLength() + " patients.");
		System.out.println();
		System.out.println("Name Age Ilness");
		while (current != null) {
			System.out.println(current.getName() + " " + current.getAge() + " " + current.getIllness());
			current = current.getNext();
		}
		System.out.println();
	}
	
}
