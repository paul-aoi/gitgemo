package Lab12;

public class Game extends GameEnums{

	private Player player;
	private Computer computer;
	private CHOICES playerChoice;
	private CHOICES computerChoice;
	private RESULT result;
	private int wins;
	private int losses;
	private int ties;
	
	public Game() {
		super();
		player = new Player();
		computer = new Computer();
				
	}
	
	public void play() {
		playerChoice = player.generateRPS();
		computerChoice = computer.generateRPS();
		result = getResults();
		displayResults();
		stats();
		
		}
	
	public void displayStats(){
		System.out.println("you played " + (wins + losses + ties) + " games");
		System.out.println("you won " + (wins) + " times");
		System.out.println("and lost " + losses + " times");
		System.out.println("and tied " + ties + " times");
	}
	
	
	public void stats() {
		if (result == RESULT.WIN)
			wins++;
		else if (result == RESULT.LOSE)
			losses++;
		else ties ++;
	
	}
	
	
	
	private void displayResults() {
		switch (result) {
		case WIN: System.out.println(playerChoice + " > " + computerChoice + "you win!");
		break;		
		case LOSE: System.out.println(playerChoice + " < " + computerChoice + "you lose");
		break;		
		case TIE: System.out.println(playerChoice + " = " + computerChoice + " its a tie");
		break;
		}
		
	}
	
	private RESULT getResults() {
		if (playerChoice == computerChoice)
			return RESULT.TIE;
		
		switch (playerChoice) {		
		case ROCK: return (computerChoice == CHOICES.SCISSORS ? RESULT.WIN : RESULT.LOSE);		
		case PAPER: return (computerChoice == CHOICES.ROCK ? RESULT.WIN : RESULT.LOSE);		
		case SCISSORS: return (computerChoice == CHOICES.PAPER ? RESULT.WIN : RESULT.LOSE);		
		}
		return RESULT.LOSE;
		
	}
}
