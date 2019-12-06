package com.bridgelabz.oops.inventorymangement_of_rice.controller;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.oops.inventorymanagement_of_rice.models.inventory_data;

/**
 * @author Premsai Manthani
 * @purpose : this programs displays the total value of total pulses present.
 * 
 * 
 * 
 */
public class inventory_main {

	// public static void main (String[] args)
	{
		ObjectMapper mapper = new ObjectMapper();

		try {

			inventory_data d1 = mapper.readValue(new File("details_of_pulses.json"), inventory_data[].class)[0];
			inventory_data d2 = mapper.readValue(new File("details_of_pulses.json"), inventory_data[].class)[1];
			inventory_data d3 = mapper.readValue(new File("details_of_pulses.json"), inventory_data[].class)[2];
			System.out.println("the value of" + d1.getName_of_grain() + " \n" + d1.getPrice_of_the_day() + " \n "
					+ d1.getWeight_of_grain());
			// System.out.println("the value of the rice is "+"
			// "+d1.getPrice_of_the_day()*d1.getWeight_of_grain());
			long value1 = (d1.getPrice_of_the_day() * d1.getWeight_of_grain());
			System.out.println("the value of " + d1.getName_of_grain() + "" + value1);
			long value2 = (d2.getPrice_of_the_day() * d2.getWeight_of_grain());
			System.out.println("the value of " + d2.getName_of_grain() + "" + value2);
			long value3 = (d3.getPrice_of_the_day() * d3.getWeight_of_grain());
			System.out.println("the value of " + d3.getName_of_grain() + "" + value3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
