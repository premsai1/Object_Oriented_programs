package com.bridgelabz.Deck_of_cards.Controller;

import java.util.Scanner;

/*
 * Extend the above program to create a Player Object having Deck of Cards, and
having ability to Sort by Rank and maintain the cards in a Queue implemented using
Linked List. Do not use any Collection Library. Further the Player are also arranged
in Queue. Finally Print the Player and the Cards received by each Player.
 */
public class deck_using_queue {
	class node{
		int data;
		node next;
		public  node(int d)
		{
			data=d;
			next=null;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		deck_using_queue m1=new deck_using_queue();
		
		System.out.println("enter the no of players");
		int number=s1.nextInt();
		
		
		
		
		
	}

}
