public class Testing {
	
	public static void changeIt(Patient xyz) {
		
		System.out.println("Change It");
		Patient abc123 = new Patient("John", 5, "Fuck");
		abc123 = xyz;
		abc123.setAge(500);
	}	
	
}
