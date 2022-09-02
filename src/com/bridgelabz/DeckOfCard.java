package com.bridgelabz;

import java.util.Scanner;

public class DeckOfCard {
	static Scanner scanner = new Scanner(System.in);

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
		
		System.out.println("\n Enter number of players minimum 2 , maximum 4");
        int player = scanner.nextInt();
        if (player >= 2 && player <= 4) {
            System.out.println(player + "players will  play the game");
            sequenceOfPlay(player);
        } else {
            System.out.println("please enter number of players in the Range");
            this.addPlayers();
        }
    }
		
	public void sequenceOfPlay(int player) {
        for (int i = 1; i < player; i++) {
            System.out.println("player " + i + " Getting card:");
        }
    }

}
