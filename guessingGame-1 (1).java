package guessingGame;

import java.util.*;

public class guessingGame {
	
	public static void main(String[] args){
	
		int random = (int)(Math.random()*100);
		
		Scanner input = new Scanner(System.in);

		System.out.println("Choose a number between 1-100");
	
		int guess = input.nextInt();
		
		int counter = 0;
		
		counter++;
		
		
		while(guess != random){
		
			if(guess<random){
				
				System.out.println("My number is greater");
				System.out.println("Guess again!");
				guess = input.nextInt();
				counter++;
			}
			else{
				
				System.out.println("My number is smaller");
				System.out.println("Guess again!");
				guess = input.nextInt();
				counter++;
			}
			
		}
			System.out.println("Correct!");
			System.out.print("It took you " + counter + " tries");
	
	}
	
	
}
