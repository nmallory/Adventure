import java.util.Scanner;

public class Adventure {

	

	public static void main(String[] args) {
		
		String name = "";
		String yes = "Yes";
		String answer = "";
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
					System.out.println("No one has ever faced a 1-headed dragon before!");
					break;
					
				case 2:
					System.out.println("No one has ever faced a 2-headed dragon before!");
					break;
					
				case 3:
					System.out.println("No one has ever faced a 3-headed dragon before!");
					break;
				
				}
					
				
		}
				
	}
		
}
		
	