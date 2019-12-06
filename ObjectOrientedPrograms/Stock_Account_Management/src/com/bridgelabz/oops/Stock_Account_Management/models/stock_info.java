package com.bridgelabz.oops.Stock_Account_Management.models;

public class stock_info {
	private String stock_name;
	private long no_of_shares;
	private long share_price;

	public String getStock_name() {
		return stock_name;
	}

	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}

	public long getNo_of_shares() {
		return no_of_shares;
	}

	public void setNo_of_shares(long no_of_shares) {
		this.no_of_shares = no_of_shares;
	}

	public long getShare_price() {
		return share_price;
	}

	public void setShare_price(long share_price) {
		this.share_price = share_price;
	}

}
