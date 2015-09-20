package Mainpackage;
import java.util.ArrayList;

public class Hand {
	
	private ArrayList<Card> cards = new ArrayList<>();
	
	public Hand(Deck deck, int ncards){
		for(int i = 0; i < ncards; i++){
			
			Card drawncard = deck.draw();
			//drawncard.showCard();			
			
			cards.add(drawncard);
			
		}
		
		ncards = cards.size();
		
		
	}
	
	public static int rankHands(Hand hand1, Hand hand2){
		if (hand1.getScore() < hand2.getScore())
			return 1;
		else 
			return 2;		
		
		
	}
	
	public int getScore(){
		//Royal Flush
		//if (this.cards.get(1).getSuit() == this.cards(2).suit)
			
		//Straight Flush
		//Four of
		//Full House
		//Flush
		//Straight
		//Three of
		//Two Pairs
		//One Pair
		//High Card
		return 0;
		
	}
	
	public void showHand(){
		for(int i = 0; i < this.getNCards(); i++){
			char s = ((Card) this.cards.get(i)).getSuit();
			int r = ((Card) this.cards.get(i)).getRank();
			System.out.print(s);
			System.out.print(r);
			if(i!=4)
				System.out.print("-");
			
		}
		
		System.out.println("");				
		
		
	}
	public static void showHand(Hand hand){
		for(int i = 0; i < hand.getNCards(); i++){
			(hand.getCard(i)).showCard();
			if(i!=4)
				System.out.print("-");
			
		}
		
		System.out.println("");				
		
		
		
		
	}
	
	public Card getCard(int i){
	
		return this.cards.get(i);
		
		
	}
	
	
	
	public int getNCards(){
		return this.cards.size();
		
	}

	
	

}
