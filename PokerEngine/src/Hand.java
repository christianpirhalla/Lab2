
public class Hand {

	private Card[] cards = new Card[5];
	
	public Hand(Card a, Card b, Card c, Card d, Card e){
		cards[0] = a;
		cards[1] = b;
		cards[2] = c;
		cards[3] = d;
		cards[4] = e;
		
	}
	
	public Card[] getCards(){
		return cards;
	}
	
	
	
	
}
