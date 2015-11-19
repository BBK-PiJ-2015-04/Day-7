public class Queues {
	
	private static IntegerQueue queue = new IntegerQueue();
	
	public static void main(String[] args) {
		
		String str = "0";
		
		while(!str.equals("3")) {
			System.out.println();
			System.out.println("Please choose from the following:");
			System.out.println();
			System.out.println("(1) Add numbers to the queue.");
			System.out.println("(2) Retrieve numbers from the queue.");
			System.out.println("(3) Quit this program.");
			System.out.println();
			System.out.print("Your choice: ");
			str = System.console().readLine();
			if(str.equals("1")) {
				addToQueue();
			}
			else if(str.equals("2")) {
				retrieveFromQueue();
			}
			else {
			}
		}
	}

	private static void addToQueue() {
		
		while(true) {
			System.out.println();
			System.out.print("Enter numbers to add to the queue (-1 to end): ");
			String str = System.console().readLine();
			int numberToAdd = Integer.parseInt(str);
			if(numberToAdd == -1) {
				break;
			}
			Integers numby = new Integers(numberToAdd);
			queue.insert(numby);
		}

		queue.prettyPrint();

	}
	
	private static void retrieveFromQueue() {
		
		System.out.println();
		System.out.print("How many numbers do you want to retrieve? : ");
		String str = System.console().readLine();
		int numbers = Integer.parseInt(str);
		
		if(numbers > queue.size()) {
			System.out.println();
			System.out.println("That's more than there are in the queue!");
		}
		else {
			for(int i = 0; i < numbers; i++) {
				System.out.println();
				System.out.println("Here is a retrieved number: " + queue.retrieve());
			}
		}
		
		queue.prettyPrint();
		
	}
	
}
