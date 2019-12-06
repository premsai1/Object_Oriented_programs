package com.bridgelabz.oops.inventorymangement_of_rice.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.oops.inventory_datamanagement_of_rice.models.inventory_operation;
import com.bridgelabz.oops.inventorymanagement_of_rice.models.inventory_data;
import com.bridgelabz.oops.inventorymanagement_of_rice.repository.file_connection;

/**
 * @author Premsai Manthani
 * @purpose : this performs this performs the operation of adding a pulse
 *          deleting a pulse and what is the value of each pulse.
 * 
 */
public class inventorymagager_main {
	static Scanner s1 = new Scanner(System.in);

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		inventory_operation op = new inventory_operation();
		file_connection fcon = new file_connection();
		inventory_data i = new inventory_data();
		int option = 0;
		do {
			System.out.println("enter the option");
			System.out.println("1 : addInventory");
			System.out.println(" 2: Delete Inventory");
			System.out.println("3: value Of each inventory");
			int ch = s1.nextInt();
			switch (ch) {
			case 1:

				LinkedList<inventory_data> listOfIn = fcon.readFile();
				op.addinventory_data(listOfIn);
				fcon.writeFile(listOfIn);
				break;

			case 2:

				LinkedList<inventory_data> listOfIn1 = fcon.readFile();
				op.deleteinventory_data(listOfIn1);
				fcon.writeFile(listOfIn1);

				break;
			case 3:
				LinkedList<inventory_data> listOfIn2 = fcon.readFile();
				op.inventory_dataval(listOfIn2);
				break;

			}
			System.out.println("Do you want to countinue  /n 1.true  /n 2.false");
			option = s1.nextInt();

		} while (option == 1);
		s1.close();
		System.out.println("Operation has performed");
	}
}