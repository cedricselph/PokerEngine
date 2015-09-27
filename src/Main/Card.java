package Main;

public class Card {
	
	//Data Fields
	private int rank;
	private String suit;

	// no argument constructor
	public Card(){}
	
	// method for card using rank and suit
	public Card(int rank, String suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	// getter for rank
	public int getRank() {
		return rank;
	}
	
	// getter for suit
	public String getSuit() {
		return suit;
	}
			

}
