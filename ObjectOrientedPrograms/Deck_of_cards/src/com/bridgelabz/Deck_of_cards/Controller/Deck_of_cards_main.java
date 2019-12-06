package com.bridgelabz.Deck_of_cards.Controller;

import java.util.Random;

/**
 * @author Premsai Manthani
 * @purpose : this program performs the distribution of cards among 3 players
 *          with random function.
 * 
 */
public class Deck_of_cards_main {

	public static void main(String[] args) {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		int n = suits.length * ranks.length;
		String[] cards = new String[n];
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				cards[suits.length * i + j] = ranks[i] + "_of_" + suits[j];
			}
		}

		for (int i = 0; i < n; i++) {
			Random rand = new Random();
			int r = i + rand.nextInt(52 - i);

			String temp = cards[r];
			cards[r] = cards[i];
			cards[i] = temp;
		}

		// print shuffled deck
		System.out.println("First player");
		for (int i = 0; i < 9; i++) {
			System.out.print(" \n" + cards[i] + ",");
		}
		System.out.println(" ");

		System.out.println("second player ");
		for (int i = 9; i < 18; i++) {
			System.out.print(" \n" + cards[i]);
		}
		System.out.println(" ");
		System.out.println("third player");
		for (int i = 18; i < 27; i++) {
			System.out.print(" \n" + cards[i]);
		}
		System.out.println(" ");
		System.out.println("player 4");
		for (int i = 27; i < 36; i++) {
			System.out.print(" \n" + cards[i]);
		}
		System.out.println(" ");

	}

}
