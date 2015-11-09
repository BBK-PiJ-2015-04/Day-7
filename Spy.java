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