package wordgussergame;

import java.util.Random;
import java.util.Scanner;

public class WordGusserGame {

	public static void main(String[] args) {
		

	
		
		System.out.println("*******word Guesser Game********");
		System.out.println("--------Rule of the game-------");
		System.out.println("here we will generate an eight character word in which some characters will be hidden.\nYou have to guess a single character.\nif it is present in string it will print on right position.");
		System.out.println("For start the game press 1");
		
		Scanner scanner= new Scanner(System.in);
		Random random = new Random();
		int choice = scanner.nextInt();
		
		while(choice==1)
		{
			
	     String word="";
	     
	     for(int i=0;i<8;i++)
	     {
	    	 int rand = random.nextInt(26);
	    	 
	    	 word+=(char) (rand+'a');
	     }
			
	     System.out.println("string is "+word);	
	     
	    
	     String temp="--------";
	     String holder="";
	     int tries =0;
	     
	     
	     for(int i = 0; i < word.length(); i ++) {
                 if(i==0 || i==3 || i==6)
                 {
                     holder = Character.toString(word.charAt(i));
                     temp = temp.substring(0, i) + holder + temp.substring( i+1, temp.length());
                 }
              
         }  
         
         
	     System.out.println(temp);

	     
	     
	    
	     do {
	            System.out.println("Enter your letter guess");
	            String guess = scanner.next();
	            
	        
	            for(int i = 0; i < word.length(); i ++) {
	                if (guess.equals(Character.toString(word.charAt(i)))) 
	                {
	                    
	                        holder = Character.toString(temp.charAt(i)).replace("-", guess);
	                        temp = temp.substring(0, i) + holder + temp.substring( i + 1, temp.length());
	                    
	                } 
	          
	            }
	            tries++;
	            
	            
	            
	            System.out.println(temp);
	            if(temp.equals(word)) {
	                System.out.println("You guessed correctly in "+tries+" triels");
	                break;
	            }
	        }while (tries < 10);
	     
	     if(tries>=10)
	     {
	     System.out.println(" you can try only 10 times!");
	     System.out.println("Game Over");
	     return;
	     }
			choice = 0;
			
	    System.out.println("if you want to play again then press 1");
	
		int again=scanner.nextInt();
		
		if(again==1)
		{
			choice=1;
		}	
			
			
		}
		
		System.out.println("Game Over");

	}

}

