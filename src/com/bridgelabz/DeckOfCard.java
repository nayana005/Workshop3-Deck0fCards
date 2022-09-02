package com.bridgelabz;

public class DeckOfCard {
	
	 public static void main(String[] args) {
	        DeckOfCard deckOfCards = new DeckOfCard();
	        deckOfCards.initializeCards();
	    }
	    void initializeCards(){
	        System.out.println("initializing cards...");
	        int cardIndex=0;
	        for (int i = 0; i < Cards.suitArray.length; i++) {
	            for (int j = 0; j < Cards.rankArray.length; j++) {
	                Cards card = new Cards(Cards.suitArray[i],Cards.rankArray[j]);
	                Cards.cardArray[cardIndex++] = card;
	            }
	        }
	        printCards(Cards.cardArray);
	    }
	    void printCards(Cards[] card){
	        System.out.print("Cards{");
	        for (Cards cards : card) {
	            System.out.print(cards.getSuit() + "-" + cards.getRank() + ", ");
	        }
	        System.out.println("}");
	    }

}
