/*

Make a class that implements a method that reads a list of marks between 0 and
100 from the user, one per line, and stops when the user introduces a -1. The
program should output at the end (and only at the end) how many marks there
were in total, how many were distinctions (70–100), how many were passes
(50–69), how many failed (0–49), and how many were invalid (e.g. 150 or -3).
Use readLine() exactly once. The output may look similar to this example:

Input a mark: 13
Input a mark: 45
Input a mark: 63
Input a mark: 73
Input a mark: 101
Input a mark: 45
Input a mark: 18
Input a mark: 92
Input a mark: -1
There are 7 students: 2 distinctions, 1 pass, 4 fails (plus 1 invalid).

*/

public class DoWhile {
	
	public static void main(String[] Args) {
	
		String marks;
		int marksNum;
		int invalid = 0;
		int distinction = 0;
		int passes = 0;
		int fails = 0;
	
		do {
			System.out.println("Enter the marks. Finish by entering -1");
			marks = System.console().readLine();
			marksNum = Integer.parseInt(marks);
			if(marksNum > 100 || marksNum < -1) {
				invalid++;
			}
			else if(marksNum > 69) {
				distinction++;
			}
			else if(marksNum > 49) {
				passes++;
			}
			else {
				if(marksNum != -1) {
					fails++;
				}
			}
		}
		while (marksNum != -1);
		
		System.out.println("There are " + (invalid + distinction + passes + fails) +
		" students: " + distinction + " distinctions, " + passes + " passes, " +
		fails + " fails (plus " + invalid + " invalid).");
		
	}
	
}