import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu{
	private ArrayList<String> actionsList = new ArrayList<>();


	public GameMenu(ArrayList<String> actionsList){
		this.actionsList = actionsList;
	}

	public void displayMenu(ArrayList<String> actionsList){
		this.actionsList = actionsList;
		for(String option : actionsList){		//For each option in the actionsList print option.
		System.out.println(option);
		}
		
	}

	public int getAction(ArrayList<String> actionsList){
	this.actionsList = actionsList;
	Scanner scanner = new Scanner(System.in);


	System.out.println("Type a number to choose an action");
	displayMenu(actionsList);

	if(scanner.hasNextInt()){
		int choice = scanner.nextInt();
		return choice;
	}
	return 0;
	
	
}


}