import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;
    private static int attempts = 0;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
		Scanner scanner = new Scanner(System.in);
        attempts++;


        if(scanner.hasNextDouble()){
            double input = scanner.nextDouble();
                if(input == rnd_number){
                    System.out.println("Succes");
                    System.out.println("You used: " + attempts + " attempts.");
                }else{
                    System.out.println("Wrong. Try again.");
                    
                    if(input > rnd_number){
                        System.out.println("Your guess was too high, try again.");
                        makeAGuess();
                    }else{
                        System.out.println("Your guess was too low, try again.");
                        makeAGuess();
                    }
                    }
            }else {        
        System.out.println("You must type in a number. Try again.");
        makeAGuess(); }


        // Create a Scanner object   	 
    	// Read user input
    	
        //use hasNextDouble to check if input is numeric, 
        // if so...
        //   Compare it with the random number
        //   Let the user know the result of the comparison
        //   Let the user try again by calling this method recursively
        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively

    }
   

}