import java.util.Scanner;

public class ErrorHandler {
	
	public static Scanner in = new Scanner(System.in);
	public static String[] words = new String[] {"zero", "one", "two", "three", "four", "five"};
	
	public static void main(String[] args) {
		
		getIt();
		
	}
	
	public static void getIt() {
		
		System.out.println();
		System.out.print("Choose an element: ");
		
		try {
		
		int index = in.nextInt();
		System.out.println("You have chosen element: " + words[index]);

		} catch (Exception e) {
			
			System.out.println("Whoopsie!");
		
		} finally {
			
			getIt();
			
		}
		
	}
	
}


	
