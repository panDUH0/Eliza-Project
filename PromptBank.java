package project2;

import java.util.Arrays;
//https://youtu.be/UV7M99FNW0A
public class PromptBank {
	  String[] questions;
	 String[] statements;
	static int random = (int) (Math.random()*3);
	public PromptBank(){
		 questions = new String[3]; //initialize your array to the correct length to match your number of questions you populate it with
		 statements = new String[3];
		
	}
//______________________________________________________________________________________________________________________________________
	
	public static void main(String [] args) {
		/*PromptBank state = new PromptBank();
		
		state.StatementsArray(" ello ", " esh ");
		System.out.println(Arrays.toString(state.statements));
		*/
		
		
	}
	
	
	public void StatementsArray(String word1, String word2){
		statements[0] = "Tell me more about " + word1 +  " and " + word2;
		statements[1] = word1 + " seems important to you, so does " + word2 + ". Please tell me more.";
		statements[2] = word1 + " and "  + word2 + " seem to be on your mind. Let's talk about it. ";
		
	}

	
		public void QuestionsArray(String word1, String word2){
			questions[0] = " Is there anything else about " + word1 + " and " + word2 + " ?";
			questions[1] = "Does " + word1 + " bother you? How about "  + word2 + " ?";
			questions[2] = "Are " + word1 + "and " + word2 +  " things you think about often?";
		}
	
		
		
		public static String getRandomQuestion(String word1, String word2) {
			
			PromptBank que = new PromptBank();
			que.QuestionsArray(word1, word2);
			return que.questions[random];
		}
		public static String getRandomStatement(String word1, String word2) {
			PromptBank state = new PromptBank();
			
			state.StatementsArray(word1 , word2);
			return state.statements[random];
			
			
		}
		
		
		
	}
	
	
	
	

