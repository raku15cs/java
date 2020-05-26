package com;

public class Cell {
	
	private int cellNo;
	private String customerName;
	private double balance;
	private double ratePerSecond;
	private String circle;
	public Cell(int cellNo, String customerName, double balance, double ratePerSecond, String circle) {
		super();
		this.cellNo = cellNo;
		this.customerName = customerName;
		this.balance = balance;
		this.ratePerSecond = ratePerSecond;
		this.circle = circle;
	}
	public int getCellNo() {
		return cellNo;
	}
	public void setCellNo(int cellNo) {
		this.cellNo = cellNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getRatePerSecond() {
		return ratePerSecond;
	}
	public void setRatePerSecond(double ratePerSecond) {
		this.ratePerSecond = ratePerSecond;
	}
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
	}
	

}
