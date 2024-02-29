import java.util.ArrayList;

public class TaskFour{
	
	public static void main(String[] args){

		ArrayList<String> actionsList = new ArrayList<>();
		actionsList.add("1) Start game");
		actionsList.add("2) Resume game");
		actionsList.add("3) Pause game");
		actionsList.add("4) End game");

		//System.out.println(actions.get(2));			//Tester om det virker
		GameMenu menu = new GameMenu(actionsList);

		//menu.displayMenu(actionsList);			//Denne her bruger vi i TaskFour

		int userChoice = menu.getAction(actionsList);
		doAction(userChoice);

	}

	public static void doAction(int action){
		
		switch(action){
		case 1:
			System.out.println("Starting the game now");
			break;
		case 2:
			System.out.println("Fetching previously saved game data");
			break;
		case 3:
			System.out.println("Game paused");
			break;
		case 4:
			System.out.println("Ending game");
			break; 
		default:
			System.out.println("Option not available");
			String[] args = new String[1];
			main(args);

		}

	}
}