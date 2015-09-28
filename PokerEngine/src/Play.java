//By Cindy Nguyen and Christian Pirhalla


public class Play {

	
	//sort hands by rank to make them easier to evaluate
	
	 public static void sortByRank( Card[] h )
	   {
	      int i, j, min_j;

	      for ( i = 0 ; i < h.length ; i++ )
	      {
	         min_j = i;   
	         for ( j = i+1 ; j < h.length ; j++ )
	         {
	            if ( h[j].getRank() < h[min_j].getRank() )
	            {
	               min_j = j;    // We found a smaller rank value, update min_j     
	            }
	         }


	         Card help = h[i];
	         h[i] = h[min_j];
	         h[min_j] = help;
	      }
	   }
	
	
	// method for determining royal flush
	 
	 public static boolean isRoyalFlush(Hand h){
		 
		 Card[] c = h.getCards();
		 if (c[0].getRank() == 10 &&
				 c[1].getRank() == 11 &&
				 c[2].getRank() == 12 &&
				 c[3].getRank() == 13 &&
				 c[4].getRank() == 14 &&
				 c[0].getSuit() == c[1].getSuit() &&
				 c[1].getSuit() == c[2].getSuit() &&
				 c[2].getSuit() == c[3].getSuit() &&
				 c[3].getSuit() == c[4].getSuit()
				 )		 		 
		 return true;
		 else
			 return false;
	 }
	 
	 public static boolean isStraightFlush(Hand h){
		 
		 Card[] c = h.getCards();
		 if (c[1].getRank() == c[0].getRank() + 1 &&
				 c[2].getRank() == c[1].getRank() + 1 &&
				 c[3].getRank() == c[2].getRank() + 1 &&
				 c[4].getRank() == c[3].getRank() + 1 &&
				 c[0].getSuit() == c[1].getSuit() &&
				 c[1].getSuit() == c[2].getSuit() &&
				 c[2].getSuit() == c[3].getSuit() &&
				 c[3].getSuit() == c[4].getSuit()
				 )		 		 
		 return true;
		 else
			 return false;
	 }
			
	 
	 public static boolean is4OAK( Hand h )
	   {
		 Card[] c = h.getCards();
	      boolean a1, a2;
   
	      a1 = c[0].getRank() == c[1].getRank() &&
	           c[1].getRank() == c[2].getRank() &&
	           c[2].getRank() == c[3].getRank() ;


	      a2 = c[1].getRank() == c[2].getRank() &&
	           c[2].getRank() == c[3].getRank() &&
	           c[3].getRank() == c[4].getRank() ;

	      return( a1 || a2 );
	   }
		

	 
	 public static boolean isFullHouse( Hand h )
	   {
	      boolean a1, a2;

	      Card[] c = h.getCards();
	    // Permutation 1 
	      a1 = c[0].getRank() == c[1].getRank() &&
	           c[1].getRank() == c[2].getRank() &&
	           c[3].getRank() == c[4].getRank();

	      // Permutation 2
	      a2 = c[0].getRank() == c[1].getRank() &&
	           c[2].getRank() == c[3].getRank() &&
	           c[3].getRank() == c[4].getRank();

	      return( a1 || a2 );
	   }
	
	 public static boolean isFlush(Hand h){
		 
		 Card[] c = h.getCards();
		 if (
				 c[0].getSuit() == c[1].getSuit() &&
				 c[1].getSuit() == c[2].getSuit() &&
				 c[2].getSuit() == c[3].getSuit() &&
				 c[3].getSuit() == c[4].getSuit()
				 )		 		 
		 return true;
		 else
			 return false;
	 }	
	
	 
	 public static boolean isStraight(Hand h){
		 
		 Card[] c = h.getCards();
		 if (c[1].getRank() == c[0].getRank() + 1 &&
				 c[2].getRank() == c[1].getRank() + 1 &&
				 c[3].getRank() == c[2].getRank() + 1 &&
				 c[4].getRank() == c[3].getRank() + 1 
				 )		 		 
		 return true;
		 else
			 return false;
	 }
	
	
	 public static boolean is3OAK( Hand h )
	   {
	      boolean a1;
	      boolean a2;
	      boolean a3;

	      Card[] c = h.getCards();

	  

	      // permutation 1  
	      a1 = c[0].getRank() == c[1].getRank() &&
	           c[1].getRank() == c[2].getRank() &&
		   c[3].getRank() != c[0].getRank() &&
		   c[4].getRank() != c[0].getRank() &&
		   c[3].getRank() != c[4].getRank() ;

	      // permuation 2
	      a2 = c[1].getRank() == c[2].getRank() &&
	           c[2].getRank() == c[3].getRank() &&
		   c[0].getRank() != c[1].getRank() &&
		   c[4].getRank() != c[1].getRank() &&
		   c[0].getRank() != c[4].getRank() ;

	      //permutation 3  
	      a3 = c[2].getRank() == c[3].getRank() &&
	           c[3].getRank() == c[4].getRank() &&
		   c[0].getRank() != c[2].getRank() &&
		   c[1].getRank() != c[2].getRank() &&
		   c[0].getRank() != c[1].getRank() ;

	      return( a1 || a2 || a3 );

	   }
	 
	 
	  public static boolean is2Pair(Hand h)
	   {
	      boolean a1, a2, a3;

	      Card[] c = h.getCards();

	      //permutation 1                    
	      a1 = c[0].getRank() == c[1].getRank() &&
	           c[2].getRank() == c[3].getRank() ;

	      //permutation 2
	      a2 = c[0].getRank() == c[1].getRank() &&
	           c[3].getRank() == c[4].getRank() ;

	      //permutation 3
	      a3 = c[1].getRank() == c[2].getRank() &&
	           c[3].getRank() == c[4].getRank() ;

	      return( a1 || a2 || a3 );
	   }
	 
	  
	  
	  public static boolean is1Pair( Hand h )
	   {
	      boolean a1, a2, a3, a4;


	      Card[] c = h.getCards();
	      

	      //permutation 1                            
	      a1 = c[0].getRank() == c[1].getRank() ;

	      //permutation 2
	      a2 = c[1].getRank() == c[2].getRank() ;

	      //permutation 3
	      a3 = c[2].getRank() == c[3].getRank() ;

	      //permutation 4
	      a4 = c[3].getRank() == c[4].getRank() ;

	      return( a1 || a2 || a3 || a4 );
	   }
	 
	 
	  //BEGIN EVALUATION METHOD
	  
	  public static int evaluateHand(Hand h){
		  

		  
		  if (isRoyalFlush(h) == true)
		  return 10;
		  else if (isStraightFlush(h) == true)
			  return 9;
		  else if (is4OAK(h) == true)
			  return 8;
		  else if (isFullHouse(h) == true)
			  return 7;
		  else if (isFlush(h) == true)
			  return 6;
		  else if (isStraight(h) == true)
			  return 5;
		  else if (is3OAK(h) == true)
			  return 4;
		  else if (is2Pair(h) == true)
			  return 3;
		  else if (is1Pair(h) == true)
			  return 2;
		  else 
			  return 1;
		  
		    
	  }
	  
	  
	  public static String convertRank(int i){
		  
		  if (i == 11)		  
			  return "Jack";
		  else if (i == 12)
			  return "Queen";
		  else if (i == 13)
			  return "King";
		  else if (i == 14)
			  return "Ace";
		  
		  else
		  {
			  return Integer.toString(i);
		  }
	  }
	  
	 
	@SuppressWarnings("unused")
	public static void main(String[] args){
		
		Deck gameDeck = new Deck();
		gameDeck.shuffleDeck();
		Hand h1 = new Hand(gameDeck.drawFromDeck(), gameDeck.drawFromDeck(), gameDeck.drawFromDeck(), gameDeck.drawFromDeck(), gameDeck.drawFromDeck());
		Hand h2 = new Hand(gameDeck.drawFromDeck(), gameDeck.drawFromDeck(), gameDeck.drawFromDeck(), gameDeck.drawFromDeck(), gameDeck.drawFromDeck());
		sortByRank(h1.getCards());
		sortByRank(h2.getCards());
		
		System.out.println("Player 1's hand: " + h1.getCards()[0].getRank() + " of " + h1.getCards()[0].getSuit() + ", "
				+ convertRank(h1.getCards()[1].getRank()) + " of " + h1.getCards()[1].getSuit() + ", "
				+ convertRank(h1.getCards()[2].getRank()) + " of " + h1.getCards()[2].getSuit() + ", "
				+ convertRank(h1.getCards()[3].getRank()) + " of " + h1.getCards()[3].getSuit() + ", "
				+ convertRank(h1.getCards()[4].getRank()) + " of " + h1.getCards()[4].getSuit());
		
		System.out.println("Player 2's hand: " + h2.getCards()[0].getRank() + " of " + h2.getCards()[0].getSuit() + ", "
				+ convertRank(h2.getCards()[1].getRank()) + " of " + h2.getCards()[1].getSuit() + ", "
				+ convertRank(h2.getCards()[2].getRank()) + " of " + h2.getCards()[2].getSuit() + ", "
				+ convertRank(h2.getCards()[3].getRank()) + " of " + h2.getCards()[3].getSuit() + ", "
				+ convertRank(h2.getCards()[4].getRank()) + " of " + h2.getCards()[4].getSuit());
		
		
		if (evaluateHand(h1) > evaluateHand(h2))
		System.out.println("Player 1 wins!");
		else if (evaluateHand(h1) < evaluateHand(h2))
			System.out.println("Player 2 wins!");
		else if (evaluateHand(h1) == evaluateHand(h2))
			for (int i = 4; i >= 0; i = i - 1){
			if (h1.getCards()[i].getRank() > h2.getCards()[i].getRank())
			{
				System.out.println("Player 1 wins!");
				break;}
			else
				{System.out.println("Player 2 wins!");
				break;}
			}
		
		
		//10 total possible combinations
		// 10 - royal flush
		// 9 - straight flush
		// 8 - four of a kind
		// 7 - full house
		// 6 - flush
		// 5 -  straight
		// 4 - three of a kind
		// 3 - two pair
		// 2 - one pair
		// 1 - no pair/high card
		
		// in addition to this , remember to implement a method to determine who wins between
		// two hands of the same combo, e.g. if 2 people have a royal flush which one wins?
		// check by counting up card ranks
		
		
		
		//after you get a 3 OAK you need to check for 2OAK which would give you a full house.
		// when going through the sameRank loop, take all that are not the same Rank
		// and put the in a separate array...then run sameRank on that array
		
		
		
	}
	
}
