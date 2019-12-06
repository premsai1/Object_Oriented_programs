package com.bridgelabz.oops.inventory_datamanagement_of_rice.models;

import java.awt.List;
import java.util.LinkedList;
import java.util.Scanner;

import com.bridgelabz.oops.inventorymanagement_of_rice.models.inventory_data;

/**
 * @author Premsai Manthani
 * @purpose : this performs the implementation of adding a pulse
 *          deleting a pulse and what is the value of each pulse per day.
 * 
 * 
 */
public class inventory_operation {
	Scanner s1 = new Scanner(System.in);

	public void addinventory_data(LinkedList<inventory_data> listOfInven) {

		inventory_data i = new inventory_data();

		System.out.println("Enter the inventory_data Name");
		i.setName_of_grain(s1.next());

		System.out.println("Enter the price of inventory_data");
		i.setPrice_of_the_day(s1.nextInt());

		System.out.println("Enter the weight of inventory_data");
		i.setWeight_of_grain(s1.nextInt());

		listOfInven.add(i);

	}

	public LinkedList<inventory_data> deleteinventory_data(LinkedList<inventory_data> listOfInven) {
		System.out.println("enter the inventory_data name ");
		String name = s1.next();
		for (int i = 0; i < listOfInven.size(); i++) {
			if (listOfInven.get(i).getName_of_grain().equals(name)) {
				listOfInven.remove(i);
			}
		}
		return listOfInven;
	}

	public void inventory_dataval(LinkedList<inventory_data> listOfInven) {
		System.out.println("Enter the Stock Name");
		String name = s1.next();

		for (int i = 0; i < listOfInven.size(); i++) {
			if (listOfInven.get(i).getName_of_grain().equals(name)) {
				inventory_data temp = listOfInven.get(i);
				long value = temp.getPrice_of_the_day() * temp.getWeight_of_grain();
				System.out.println("the value of" + temp.getName_of_grain() + " is :" + value);
			}
		}
	}
}
