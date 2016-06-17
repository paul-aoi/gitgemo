package Lab12;

import java.util.Random;


public abstract class Computer extends GameEnums {

	private Random rand;
	
	public Computer() {
		super();
		rand = new Random();
		
	}
	
	public CHOICES generateRPS() {
		int choice = 1 + rand.nextInt(3);
	
		switch(choice) {
		
		case 1: return CHOICES.ROCK;
		case 2: return CHOICES.PAPER;
		
		}
		
		return CHOICES.SCISSORS;
	}
	
	
}
