import java.util.Scanner;

public class Adventure {

	

	public static void main(String[] args) {
		
		String name;
		String yes;
		String answer;
		String weapon;
		String color;
		String option; 
		String dragon; 
	
		
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
				option = input.nextLine();	
				
				switch(option){
				case "1":
					System.out.println("No one has ever faced a 1-headed dragon before!");
					break;
					
				case "2":
					System.out.println("No one has ever faced a 2-headed dragon before!");
					break;
		
				case "3":
					System.out.println("No one has ever faced a 3-headed dragon before!");
					break;
				
				}
				
				System.out.println("Choose your weapon. (enter 'slingshot' or 'sword' or 'bow and arrow'):");
				weapon = input.nextLine();
				//input.nextLine();		
				
				switch(weapon){
				case "slingshot":
					System.out.println("Armed with your slingshot, you approach the dragon. You can feel its fiery breath as you get closer. It stares at you with its eyes (enter 'red' or 'blue': )");
					break;
					
				case "sword":
					System.out.println("Armed with your sword, you approach the dragon. You can feel its fiery breath as you get closer. It stares at you with its eyes (enter 'red' or 'blue': )");
					break;
					
				case "bow and arrow":
					System.out.println("Armed with your bow and arrow, you approach the dragon. You can feel its fiery breath as you get closer. It stares at you with its eyes (enter 'red' or 'blue': )");
					break;
				
					
				}
				
				
				color = input.nextLine();
				//input.nextLine();
				
				
				switch(color){
				case "red":
					color = "red";
					System.out.println("Oh thank goodness! Red-eyed dragons are friendly. You pet it and become friends.");
					break;
				
				case "blue":
					color = "blue";
					System.out.println("Oh no! Blue-eyed dragons are mean. You will not become friends.");
					break;
				}
				
				System.out.println("You name the dragon (enter a name:) ");
				dragon = input.nextLine();
				switch(dragon){
				
				case "dragon":
					break;
				
				}
				
				System.out.println("" + "" +name  +dragon   +"live happily ever after.");
				
				
		}
	}
}
