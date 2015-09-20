

package Mainpackage;
import java.lang.Math;


public class Card {
	
	private int rank;
	private char suit;
	
	
	
	public Card(){
		//default constructor
		//creates a card with a random rank and suit
		rank = (int)Math.random()*12 + 1;
		int x = (int)Math.random()*3 + 1;
		switch(x){
		case 1: suit = 'd'; break;
		case 2: suit = 'c'; break;
		case 3: suit = 's'; break;
		case 4: suit = 'h'; break;
		}
		
				
	}
	
	
	public Card(int rankin, int suitin){
		//overloaded constructor, takes suit as an int
		
		if((rankin > 13 || rankin < 1)){
			System.out.println("bad card? nah, bad you.");
		}
		else if(suitin<1 || suitin>4){
			System.out.println("bad card? nah, bad you.");
		}
		
		rank = rankin;		
		switch(suitin){
		case 1: suit = 'd'; break;
		case 2: suit = 'c'; break;
		case 3: suit = 's'; break;
		case 4: suit = 'h'; break;
		}
		
	
	
	}
	
	
	
	public Card(int rankin, char suitin){
		//overloaded constructor, takes suit as a char
		
		if((rankin > 13 || rankin < 1)){
			System.out.println("bad card? nah, bad you.");
		}
		else if(suitin != 's' || suitin != 'c'){
			if (suitin != 'h' || suitin != 'd')
			System.out.println("bad card? nah, bad you.");
		}
		
		rank = rankin;		
		suit = suitin;		
	
	
	}
	
	
	public int getRank(){
		//returns rank
		return this.rank;
		
	}
	
	public char getSuit(){
		//returns suit
		return this.suit;
		
	}
	
	public static int getRank(Card a){
		return a.rank;
		
	}
	
	public static char getSuit(Card a){
		return a.suit;
		
	}
	
	public void setRank(int a){
		//sets the rank of a card to the inputed int
		if (a < 14 && a > 0)
			this.rank = a;
		else
			System.out.println("What are you trying to pull?");
		
	}
	
	public void setSuit(int suitin){
		//sets the suit of a card to the inputted suit, as an int
		if(suitin<1 || suitin>4){
			System.out.println("Thats not a suit...");
		}
			
		switch(suitin){
		case 1: this.suit = 'd'; break;
		case 2: this.suit = 'c'; break;
		case 3: this.suit = 's'; break;
		case 4: this.suit = 'h'; break;
		}
		
	}
	
	
	public void setSuit(char suitin){
		//sets the suit of a card to the inputted suit, as a char
	if(suitin != 's' || suitin != 'c'){
		if (suitin != 'h' || suitin != 'd')
		System.out.println("Thats not a suit...");
	}
		
	suit = suitin;		
	}


	
	public static void setRank(Card a, int b){
		//sets the rank of any card to a given int
		if (b < 14 && b > 0)
			a.rank = b;
		else
			System.out.println("What are you trying to pull?");
	}
	
	
	
	public static void setSuit(Card a, int suitin){
		//sets the suit of any card to the inputted suit, as an int
		if(suitin<1 || suitin>4){
			System.out.println("Thats not a suit...");
		}
			
		switch(suitin){
		case 1: a.suit = 'd'; break;
		case 2: a.suit = 'c'; break;
		case 3: a.suit = 's'; break;
		case 4: a.suit = 'h'; break;
		}
		
				
	}
	
	public static void setSuit(Card a, char suitin){
		//sets the suit of any card to the inputted suit, as a char
	if(suitin != 's' || suitin != 'c'){
		if (suitin != 'h' || suitin != 'd')
		System.out.println("Thats not a suit...");
	}
		
	a.suit = suitin;		
	}

	public void showCard(){
		//prints the card out to the console
		System.out.print(this.getSuit());
		System.out.print(this.getRank());
		
	}
	
	
	
}
