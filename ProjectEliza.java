package project2;
import java.util.Arrays;
import java.util.Scanner;

// https://youtu.be/UV7M99FNW0A//
public class ProjectEliza {
	public class Programs_Logic {
		static Scanner keyboard = new Scanner(System.in);
			public static  String userInput() {
			return keyboard.nextLine();
			}	
			
			
			
			
			public static String LogisticsQuestions(String first, String last) {
				
				
					
					 return PromptBank.getRandomQuestion(first, last);
					
				
			}
			public String LogScream() {
				 if(userInput().contains("!")) {
					
				}
				return null;
			}
					//make eliza say "WOW Dramatic!" followed by a random statement//
				
				public static String LogisticStatements(String first, String last) {
					
						
								return PromptBank.getRandomStatement(first, last);
					
				
					
				}
					



			public static String split(String userInput) {
				  String[] s = userInput.split(" ");
			
				String s1 = s[0]; 
				String s2 = s[s.length-1];
				
				 if(s2.contains("?")) {
					return LogisticsQuestions(s1,s2);
					
				}
				 else if((s2.contains("!"))) {
					 return "WOW! Dramatic! " + LogisticStatements(s1,s2);
				 }
				 else {
					return LogisticStatements(s1,s2);
				}
			
				
				
			}

			





			
			
			public static void main(String [] args) {
				
				System.out.println("Hello, my name is Eliza. What is your name?");
				
				String userName = userInput();
				
				while(true) {
					
					System.out.println("Hello, " + userName + " Tell me what is on your mind today in 1 sentence.");
				String userSays = userInput();
					while(!userSays.equalsIgnoreCase("exit")){
						System.out.println(split(userSays));
						userSays = userInput();
					}
				
					
					
					//System.out.println(LogisticsQuestions());
					
					
					
					
					if(userSays.equalsIgnoreCase("exit")) {
						System.out.println("Do you want to run the session again?");
						if(userInput().equalsIgnoreCase("no")) {
							System.out.println("Goodbye, until next time");
							break;
							
							}
						else {continue;
						
						}
					}
				}
				
				
				
				
			}
	}
}
