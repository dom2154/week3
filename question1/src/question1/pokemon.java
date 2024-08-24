package question1;
import java.util.Scanner;
public class pokemon {

	
	    public static void main(String[] args) {
	        // Initialize Scanner
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user the question
	        System.out.print("Want a nostalgia trip? (yes/no): ");
	        String answer = scanner.nextLine();

	        // Check the user's input and respond accordingly
	        if (answer.equals("yes")) {
	            System.out.println("Then go watch Pokemon Indigo League. You'll feel like a kid again.");
	        } else if (answer.equals("no")) {
	            System.out.println("Then I'm not entirely sure why you ran this program.");
	        } else {
	            System.out.println("Please answer with 'yes' or 'no'. this program aint so smart.");
	        }

	        // Close the scanner
	        scanner.close();
	    
	}
}
