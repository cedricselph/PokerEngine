package Main;

public class Card {
	
	//Data Fields
	private int rank;
	private String suit;
		//public static void main(String[] args){
		
		// Creates Card data fields
		//String[] suit={"Spades","Hearts","Diamonds","Club"};
		//String[] rank={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};}
	
	// no arg constructor
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
