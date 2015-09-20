package Mainpackage;
import java.util.Scanner;
import java.lang.Math;

public class Play {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Autoplay how many hands?");
		int nGames = Math.abs((int)input.nextDouble());
		
		for(int i = 1; i <= nGames; i++){
			System.out.println("Game" + i);
			playGame();		
			
			
		}
		
		input.close();
	}
	
	public static void playGame(){
		Deck dealer = new Deck();
		dealer.shuffle();
		
		Hand player1 = new Hand(dealer, 5);
		Hand player2 = new Hand(dealer, 5);
		
		player1.showHand();
		player2.showHand();
		
		int winner = Hand.rankHands(player1, player2);
		if(winner == 1)
			System.out.println("Player 1 wins");
		else 
			System.out.println("Player 2 wins");		
		
		
		
	}
}
