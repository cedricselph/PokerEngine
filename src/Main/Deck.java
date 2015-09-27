package Main;

import java.util.ArrayList;
import java.util.Collections;

public class Deck extends Card{
	
	private ArrayList<Card> Deck_List;
	private ArrayList<Card> Used_List = new ArrayList<Card>();
	
	public Deck(){
	
		Deck_List= new ArrayList<Card>();
		
		for( int i=1; i<14;i++){
			Deck_List.add(new Card(i,"Spades"));}
		
		for( int i=1; i<14;i++){
			Deck_List.add(new Card(i,"Diamonds"));}
		
		for( int i=1; i<14;i++){
			Deck_List.add(new Card(i,"Hearts"));}
		
		for( int i=1; i<14;i++){
			Deck_List.add(new Card(i,"Clubs"));}
		
		Collections.shuffle(Deck_List);}
	
	public Card RemoveCard(){
		Card myCard= getDeck_List().get(0);
		Used_List.add(myCard);
		getDeck_List().remove(0);
		return myCard;
		}

	public ArrayList<Card> getDeck_List() {
		return Deck_List;
	}

	public ArrayList<Card> getUsed_List() {
		return Used_List;
	}

	public int DeckSize(){
		return getDeck_List().size();
	}

}
		
		
		

		
	
	

	
	
	
	
	
	

	
	
	
	

	