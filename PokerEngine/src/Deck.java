import java.util.ArrayList;
import java.util.Random;
import java.util.Collections; 

public class Deck { //constructor, un-shuffled deck of cards
    
        private ArrayList<Card> deck;// array of cards
        private int currentCard; // next card to deal
        private static final int numCards = 52; //always 52 cards in deck
        
        
        public Deck(){
            int[] ranks = {14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2}; //array of ints
            String[] suits ={"Clubs", "Spades","Diamonds","Hearts"}; // array of strings
            deck = new ArrayList<Card>();
            setCurrentCard(0);
            
            for (int count = 0; count < numCards; count++)
                deck.add(new Card (ranks[count % 13], suits[count/13]));
            }
        
        public void shuffleDeck() {
            Collections.shuffle(this.deck,new Random());
        }
        
        public Card drawFromDeck() {
            Card drawCard = deck.get(0);
            deck.remove(0);
            return drawCard;
        }
        
        //return remaining cards
        public int cardsRemain() {
            return deck.size();
        }

		public int getCurrentCard() {
			return currentCard;
		}

		public void setCurrentCard(int currentCard) {
			this.currentCard = currentCard;
		}
        
        }