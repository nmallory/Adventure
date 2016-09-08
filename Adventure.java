import java.util.Scanner;

public class Adventure {

	

	public static void main(String[] args) {
		
		String name = "";
		String yes = "Yes";
		String answer = "";
		String weapon = "";
		String color = "";
		int option = 0; 
	
		
		//Create scanner 
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome! What is your name (enter your name): ");
		name = input.next();
		
	
		System.out.println("Would you like to play a game? (enter 'yes' or 'no'): ");
		yes = input.next();
			if (yes.equalsIgnoreCase("yes")){

				System.out.println("Excellent! You are walking across a field and you encounter a fire-breathing dragon!");
				System.out.println("What would you do? (enter 'face the beast' or 'run away'): ");
				
			
				answer = input.nextLine();
				input.nextLine();		
	
				
				switch(answer){
				case "face the beast":
					answer = "face the beast";
					break;
				
	
				case  "run away":
					answer  = "run away"; //Figure out how to terminate program if user enters run away
						break;
						
				}
			
				System.out.println("You approach the dragon. You see that he has heads. (enter '1' or '2' or '3'): ");
				option = input.nextInt();	
				
				switch(option){
				case 1:
					System.out.println("No one has ever faced a 1-headed dragon before! Choose your weapon. (enter 'slingshot' or 'sword' or 'bow and arrow')");
					break;
					
				case 2:
					System.out.println("No one has ever faced a 2-headed dragon before! Choose your weapon. (enter 'slingshot' or 'sword' or 'bow and arrow')");
					break;
					
				case 3:
					System.out.println("No one has ever faced a 3-headed dragon before! Choose your weapon. (enter 'slingshot' or 'sword' or 'bow and arrow')");
					break;
				
				}
				
				weapon = input.nextLine();
				input.nextLine();		
				
				switch(weapon){
				case "slingshot":
					
					System.out.println("No one has ever faced a 1-headed dragon before! Choose your weapon. (enter 'slingshot' or 'sword' or 'bow and arrow'");
					break;
					
				case "sword":
					
					System.out.println("No one has ever faced a 1-headed dragon before! Choose your weapon. (enter 'slingshot' or 'sword' or 'bow and arrow'");
					break;
					
				case "bow and arrow":
					System.out.println("No one has ever faced a 1-headed dragon before! Choose your weapon. (enter 'slingshot' or 'sword' or 'bow and arrow'");
					break;
				
				}
					
				System.out.println("Armed with your bow and arrow, you approach the dragon. You can feel its fiery breath as you get closer. It stares at you with its eyes (enter 'red' or 'blue')");
				
				color = input.nextLine();
				input.nextLine();
				
				switch(color){
				
				case "red":
					System.out.println("Oh thank goodness! Red-eyed dragons are friendly. You pet it and become friends.");
					break;
				
				case "blue":
					System.out.println("Oh no! Blue-eyed dragons are mean. You pet it and it growls.");
					break;
				}
				
				
			}
				
		}
		
}
		
	
	