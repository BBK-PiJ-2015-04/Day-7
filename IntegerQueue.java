public class IntegerQueue {
	
	private Integers startList = null;
	
	public IntegerQueue() {
		this.startList = null;
	}

	public void insert(Integers newNumber) {
		if(startList == null) {
			startList = newNumber;
		}
		else {
			Integers temp = new Integers(0);
			temp.setNext(startList);
			temp.setNumber(newNumber.getNumber());
			startList = temp;
		}
		return;
	}

	public int retrieve() {
		if(startList == null) {
			return -1;
		}
		int counter = 1;
		Integers current = startList;
		while(current.getNext() != null) {
			current = current.getNext();
			counter++;
		}
		int temp = current.getNumber();
		current = startList;
		for(int i = 2; i < counter; i++) {
			current = current.getNext();
		}
		current.setNext(null);
		return temp;
	}
	
	public int size() {
		if(startList == null) {
			return 0;
		}
		if(startList.getNext() == null) {
			return 1;
		}
		int counter = 1;
		Integers current = startList;
		while(current.getNext() != null) {
			counter++;
			current = current.getNext();
		}
		return counter;
	}
	
	public void prettyPrint() {
		Integers current = startList;
		System.out.println();
		System.out.println("NUMBERS QUEUE - Total of " + size() + " numbers.");
		System.out.println();
		while(current != null) {
			System.out.println(current.getNumber());
			current = current.getNext();
		}
		System.out.println();
	}

}
