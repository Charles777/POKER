package Mainpackage;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> decklist = new ArrayList<>();;
	
	public Deck(){
		
		for(int r = 1; r < 14; r++){
			for(int s = 1; s < 5; s++){
				decklist.add((new Card(r,s)));
				
				
			}
			
		}
		
		System.out.println(decklist.size() + " cards in the deck.");
		
		
	}
	
	
	public void shuffle(){
		Collections.shuffle(this.decklist);
				
	}
	
	public Card draw(){
		Card drawncard = (Card)this.decklist.get(0);
		this.decklist.remove(0);
		
		return drawncard;		
		
	}

	
	

}
