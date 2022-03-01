/**
 *
 * @author amaxr
 *
 **/

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random  rand  = new Random();
		
		
		int pcChoice = rand.nextInt(3) + 1;
		
		System.out.println("Welcome to Rock Paper and Scissors 3000");
		
		System.out.println("Enter 1 Scissors, 2 for rock, 3 for paper");
		
		int userChoice = input.nextInt();
		
		//Winning
		if ((userChoice == 1 && pcChoice == 3) || (userChoice == 2 && pcChoice == 1 ) || (userChoice == 3 && pcChoice == 2 )) {
			System.out.println("You win");
			System.out.println("You chose: "+ userChoice);
			System.out.println("PC chose: "+ pcChoice);
		}
		//Tie
		else if ( userChoice == pcChoice) {
			System.out.println( "Tie !");
			System.out.println("You chose: "+ userChoice);
			System.out.println("PC chose: "+ pcChoice);
		}
		//Lose
		else {
			System.out.println("You lose!");
			System.out.println("You chose: "+ userChoice);
			System.out.println("PC chose: "+ pcChoice);
		}
		
		input.close();
		
		
		}
	}



