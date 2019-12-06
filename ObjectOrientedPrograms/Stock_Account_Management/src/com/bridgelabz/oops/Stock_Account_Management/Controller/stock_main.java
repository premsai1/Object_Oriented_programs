package com.bridgelabz.oops.Stock_Account_Management.Controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.oops.Stock_Account_Management.models.stock_info;
import com.bridgelabz.oops.Stock_Account_Management.repository.file_connection;
import com.bridgelabz.oops.Stock_Account_Management.services.operation;

/**
 * @author Premsai Manthani
 * @purpose : this performs stock management operation like taking input from
 *          the manager whether to add ,delete ,value of each stock and delete
 *          any paticular stock.
 * 
 */
public class stock_main {
	static Scanner s1 = new Scanner(System.in);

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : addStock");
		System.out.println(" 2: Delete Stock");
		System.out.println("3: value Of each Stock");
		System.out.println("4 : Total Stock value");
		int ch = sc.nextInt();
		operation op = new operation();
		file_connection fcon = new file_connection();
		int option = 0;

		do {
			switch (ch) {
			case 1:
				LinkedList<stock_info> listOfStock = fcon.readFile();
				op.addStock(listOfStock);
				fcon.writeFile(listOfStock);
				break;

			case 2:
				LinkedList<stock_info> listOfStock1 = fcon.readFile();
				op.deleteStock(listOfStock1);
				fcon.writeFile(listOfStock1);

				break;
			case 3:
				LinkedList<stock_info> listOfStock2 = fcon.readFile();
				op.stockval(listOfStock2);
				break;
			case 4:
				LinkedList<stock_info> listOfStock3 = fcon.readFile();
				op.Totstockval(listOfStock3);
				break;
			}

			System.out.println("1 : addStock");
			System.out.println(" 2: Delete Stock");
			System.out.println("3: value Of each Stock");
			System.out.println("4 : Total Stock value");
			System.out.println("do you want to countinue above operation ");
			option = s1.nextInt();
		} while (option == 1);
		s1.close();

	}

}
