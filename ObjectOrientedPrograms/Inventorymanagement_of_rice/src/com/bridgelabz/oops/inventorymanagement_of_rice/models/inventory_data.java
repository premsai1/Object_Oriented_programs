package com.bridgelabz.oops.inventorymanagement_of_rice.models;

public class inventory_data {
	private String name_of_grain;
	private long weight_of_grain;
	private long price_of_the_day;

	public String getName_of_grain() {
		return name_of_grain;
	}

	public void setName_of_grain(String name_of_grain) {
		this.name_of_grain = name_of_grain;
	}

	public long getWeight_of_grain() {
		return weight_of_grain;
	}

	public void setWeight_of_grain(long weight_of_grain) {
		this.weight_of_grain = weight_of_grain;
	}

	public long getPrice_of_the_day() {
		return price_of_the_day;
	}

	public void setPrice_of_the_day(long price_of_the_day) {
		this.price_of_the_day = price_of_the_day;
	}

}
