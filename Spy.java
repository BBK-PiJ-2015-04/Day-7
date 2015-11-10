/*

Complete the example given in the notes with a class called Spy. Your class
must have:

	• one and only one static variable, and int called spyCount.

	• an instance variable of type int for the spy’s ID.

	• a constructor method that receives the ID of the spy as an argument,
	  increases spyCount(int) by one, and prints on the screen the ID of this
	  spy plus the total number of spies so far.

	• a die() method that prints on the screen “Spy XX has been detected and
	  eliminated” (where XX is the spy’s ID), decrements the spy counter and
	  prints on the screen the total number of spies so far.

	• a main method in which several objects of class Spy are created and some
	  of them killed (their method die() is called).

Observe how the static variable is accessed by different objects both to
increment and to decrement it.

*/

public class Spy {
	
	public static int spyCount = 0;
	
	private int spyID;
	
	public Spy (int spyID) {
		spyCount++;
		this.spyID = spyID;
		System.out.println();
		System.out.println("Spy with the identification number " + spyID + " has been created.");
		System.out.println("There are now " + spyCount + " spies.");
		System.out.println();
	}
	
	public void die() {
		System.out.println();
		System.out.println("Spy " + spyID + " has been detected and eliminated.");
		spyCount--;
		System.out.println("There are now " + spyCount + " spies left.");
		System.out.println();
	}
	
	public static void main(String[] Args) {
		
		// We create a few spies...
		
		Spy spy1 = new Spy(101);
		Spy spy2 = new Spy(555);
		Spy spy3 = new Spy(77);
		Spy spy4 = new Spy(999);
		Spy spy5 = new Spy(911);
		
		// Now let's kill some!
		
		spy3.die();
		spy1.die();
		spy5.die();
		
		// Finally, we create two more...
		
		Spy spy6 = new Spy(123);
		Spy spy7 = new Spy(777);		
	}
}
