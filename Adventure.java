import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		
		//Declare variables
		String name;
		String yes;
		String answer;
		String weapon;
		String color;
		String option; 
		String zombie; 
		
		//Create scanner 
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome! What is your name (enter your name): ");
		name = input.next();
		
		//Ask user do they want to play the game
		System.out.println("Would you like to play a game? (enter 'yes' or 'no'): ");
		
		yes = input.next();
			if (yes.equalsIgnoreCase("yes")){

				System.out.println("Excellent! You are walking in the stairwell of Grand Circus and you encounter a coding zombie!");
				System.out.println("What would you do? (enter 'face the zombie' or 'run away fast'): ");
	
				answer = input.nextLine();
				input.nextLine();		
	
				switch(answer){
				case "face the zombie":
					answer = "face the zombie";
					break;
					
				case  "run away fast":
					answer  = "run away fast"; 
					break;	
				}
			
				System.out.println("You approach the zombie. You see that he has a missing arm. (enter '1' or '2' or '3'): ");
				option = input.nextLine();	
				
				switch(option){
				case "1":
					System.out.println("No one has ever faced a 1-headed, missing arm, zombie before!");
					break;
					
				case "2":
					System.out.println("No one has ever faced a 2-headed, missing arm, zombie before!");
					break;
		
				case "3":
					System.out.println("No one has ever faced a 3-headed, missing arm, zombie before!");
					break;
				}
				
				//Prompts user to enter weapon type
				System.out.println("Choose your weapon. (enter 'gun' or 'sword' or 'bow and arrow'):");
				weapon = input.nextLine();	
				
				switch(weapon){
				case "gun":
					System.out.println("Armed with your gun, you approach the zombie. You can feel its fiery breath as you get closer. It stares at you with its one eye (enter 'red' or 'blue': )");
					break;
					
				case "sword":
					System.out.println("Armed with your sword, you approach the dragon. You can feel its fiery breath as you get closer. It stares at you with its one eye (enter 'red' or 'blue': )");
					break;
					
				case "bow and arrow":
					System.out.println("Armed with your bow and arrow, you approach the dragon. You can feel its fiery breath as you get closer. It stares at you with its eyes (enter 'red' or 'blue': )");
					break;
				}

				color = input.nextLine();
	
				switch(color){
				case "red":
					color = "red";
					System.out.println("Oh thank goodness! Red-eyed zombies are friendly. You pet it and become friends.");
					break;
				
				case "blue":
					color = "blue";
					System.out.println("Oh no! Blue-eyed zombies are mean. You will not become friends.");
					break;
				}
				
				System.out.println("You name the zombie (enter a name:) ");
				zombie = input.nextLine();
				switch(zombie){
				
				case "zombie":
					break;
				}
				
				System.out.println(name+" "+ "" +"and "  +zombie +" live happily ever after.");
		 }		
	}
}
		

	
