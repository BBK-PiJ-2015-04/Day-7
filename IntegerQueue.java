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
		if(size() == 1) {
			int temp = startList.getNumber();
			startList = null;
			return temp; 
		}
		Integers current = startList;
		for(int i = 1; i < size(); i++) {
			current = current.getNext();
			
		}
		int temp = current.getNumber();
		current = startList;
		for(int i = 1; i < (size() - 1); i++) {
			current = current.getNext();
			
		}
		current.setNext(null);
		return temp;
	}
	
	public int size() {
		if(startList == null) {
			return 0;
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
		if(size() == 0) {
			System.out.println("NUMBERS QUEUE - Empty!");
			System.out.println();
		}
		else {
			System.out.println("NUMBERS QUEUE - Total of " + size() + " numbers.");
			System.out.println();
			for(int i = size(); i > 0; i--) {
				System.out.println("Queue postion number " + i + " : " + current.getNumber());
				current = current.getNext();
			}
		}
	}

}
