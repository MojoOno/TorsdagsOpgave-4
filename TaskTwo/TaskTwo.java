import java.util.Scanner;

public class TaskTwo{
	
	public static void main(String[] args){		//Vores main class
		String greeting = "Hello there, ";		//En variabel med vores hardcode message
		String ageStatement = "Your age is: ";	//Det samme gør vi her
		String retirementStatement = "You can retire in ";

		System.out.println("Please type your name.");
		Scanner scanner = new Scanner(System.in);		//Her declarerer vi vores scanner som vi har importeret oppe i global, og bruger den til at få input fra brugeren i terminalen

		String name = scanner.nextLine();				//Her bruger vi vores scanner til at scanne næste String input

		System.out.println(greeting + name + ". Please type your age.");

		int age = scanner.nextInt();					//Her bruger vi vores scanner til at scanne næste Integer input
		System.out.println(ageStatement + age);

		int yearsUntilRetire = 67 - age;
		System.out.println(retirementStatement + yearsUntilRetire + " years.");
	}
}