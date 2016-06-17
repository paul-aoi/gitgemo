package Lab12;

import java.util.Scanner;

public class Player extends GameEnums{

	Scanner scan; 
	
	public Player() {
		super();
		scan = new Scanner(System.in);
	}
	
	public CHOICES generateRPS() {
		System.out.println("welcome to roshambo. choose rock, paper, or scissors.");
		char playerChoice = scan.nextLine().toLowerCase().charAt(0);
		
		switch (playerChoice) {
		case 'r': return CHOICES.ROCK;		
		case 'p': return CHOICES.PAPER;		
		case 's': return CHOICES.SCISSORS;
		}
		
		System.out.println("try again");
		return generateRPS();
		
	}
}
