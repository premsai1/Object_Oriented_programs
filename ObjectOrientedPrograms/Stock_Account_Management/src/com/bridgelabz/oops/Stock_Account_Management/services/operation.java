package com.bridgelabz.oops.Stock_Account_Management.services;

import java.awt.List;
import java.util.LinkedList;
import java.util.Scanner;

import com.bridgelabz.oops.Stock_Account_Management.models.stock_info;

/**
 * @author Premsai Manthani
 * @purpose : this performs the implementation of adding a stock deleting a
 *          stock and what is the stock value and how much stock is there in
 *          the availability.
 * 
 */
public class operation {
	Scanner s1 = new Scanner(System.in);

	public void addStock(LinkedList<stock_info> listOfStock) {
		int option = 0;
		do {
			stock_info s = new stock_info();

			System.out.println("Enter the Stock Name");
			s.setStock_name(s1.next());

			System.out.println("Enter the price of stock share");
			s.setShare_price(s1.nextInt());

			System.out.println("Enter the number of share");
			s.setNo_of_shares(s1.nextInt());
			listOfStock.add(s);
			System.out.println("doyou want to countinue /n 1.countinue /n 2.exit");
			option = s1.nextInt();
		} while (option == 1);
	}

	public LinkedList<stock_info> deleteStock(LinkedList<stock_info> listOfStock) {
		System.out.println("enter the stock name ");
		String name = s1.next();
		for (int i = 0; i < listOfStock.size(); i++) {
			if (listOfStock.get(i).getStock_name().equals(name)) {
				listOfStock.remove(i);
			}
			System.out.println("the stock is deleted");
		}
		return listOfStock;
	}

	public void stockval(LinkedList<stock_info> listOfstock) {
		System.out.println("Enter the Stock Name");
		String name = s1.next();

		for (int i = 0; i < listOfstock.size(); i++) {
			if (listOfstock.get(i).getStock_name().equals(name)) {
				stock_info temp = listOfstock.get(i);
				long value = temp.getShare_price() * temp.getNo_of_shares();
				System.out.println("the value of" + temp.getStock_name() + " is :" + value);
			}
		}
	}

	public void Totstockval(LinkedList<stock_info> listOfstock) {
		long Total = 0;
		for (int i = 0; i < listOfstock.size(); i++) {
			stock_info temp = listOfstock.get(i);
			Total = Total + temp.getShare_price() * temp.getNo_of_shares();

		}
		System.out.println("Total value of Stock is " + Total);
	}

}
