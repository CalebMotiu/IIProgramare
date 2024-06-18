package Line;

import java.util.LinkedList;

import Cards.Card;

public class Line {

	private int lineDimension;
	private LinkedList<Card> cards;
	
	
	public Line(int lineDimension) {
		this.lineDimension = lineDimension;
		this.cards = new LinkedList<Card>();
	}
	
	public boolean addLast(Card card) {
		if (cards.size()<lineDimension) {
			cards.addLast(card);
			return true;
		}
		return false;
	}
	
	public Card getFirst() {
		if (cards.size()>0) {
			Card card = cards.getFirst();
			cards.removeFirst();
			return card;
			}
		else 
			return null;
	}
	
	public void afiseaza() {
		for (Card card : cards) {
			System.out.println(card + "\n");
		}
	}
}
