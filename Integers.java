public class Integers {
	
	private int number;
	private Integers nextNumber;
	
	public Integers(int number) {
		this.number = number;
	}
	
	public Integers getNext() {
		return nextNumber;
	}
	
	public void setNext(Integers nextNumber) {
		this.nextNumber = nextNumber;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void printNumber() {
		System.out.println(this.number);
	}

}