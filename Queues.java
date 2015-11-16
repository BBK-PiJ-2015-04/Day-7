public class Queues {
	
	public static void main(String[] args) {
		
		IntegerQueue queue = new IntegerQueue();
		
		int numberToAdd = 0;
		String str;
		
		while(true) {
			System.out.print("Enter numbers to add to the queue (-1 to end): ");
			str = System.console().readLine();
			numberToAdd = Integer.parseInt(str);
			if(numberToAdd == -1) {
				break;
			}
			Integers numby = new Integers(numberToAdd);
			queue.insert(numby);
		}

		queue.prettyPrint();
		
		System.out.print("How many numbers do you want to retrieve? : ");
		str = System.console().readLine();
		numberToAdd = Integer.parseInt(str);
		
		for(int i = 0; i < numberToAdd; i++) {
			System.out.println("Here is a retrieved number: " + queue.retrieve());
		}
		
		queue.prettyPrint();
	}

}
