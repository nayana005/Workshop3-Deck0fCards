package com.bridgelabz;

import java.util.Scanner;

public class DeckOfCard {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		DeckOfCard deckOfCards = new DeckOfCard();
		deckOfCards.initializeCards();
		deckOfCards.addPlayers();
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

	void addPlayers(){
		int numOfPlayers;
		do {
			System.out.println("Enter number of players (2 to 4): ");
			numOfPlayers = sc.nextInt();
		} while (numOfPlayers < 2 || numOfPlayers > 4);
		for (int i = 0; i < numOfPlayers; i++) {
			Player.addPlayer(new Player());
		}
		System.out.println("players added: "+numOfPlayers);
	}

}
