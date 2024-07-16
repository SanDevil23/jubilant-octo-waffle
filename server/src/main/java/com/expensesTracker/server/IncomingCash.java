package com.expensesTracker.server;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class IncomingCash {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)					// automatic generation type generate primary key according to database usage
	private int id;												// auto generate
	private String TransactionName;
	private String Category;						
	private LocalDate Date;											// auto generate
	private LocalTime Time;											// auto generate
	private long Amount;											// get from user
	private long Balance;											// auto check
	
	
	
	public IncomingCash() {};
	
	/**
	 * @param iTID
	 * @param transactionName
	 * @param category
	 * @param date
	 * @param time
	 * @param amount
	 */
	public IncomingCash(int id, String transactionName, String category, LocalDate date, LocalTime time,
			long amount) {
		super();
		this.id = id;
		TransactionName = transactionName;
		Category = category;
		Date = date;
		Time = time;
		Amount = amount;
	}


	public int getITID() {
		return id;
	}
	
	
	// getter and setter for Transaction Name
	public String getTransactionName() {
		return TransactionName;
	}
	public void setTransactionName(String transactionName) {
		TransactionName = transactionName;
	}
	
	// getter and setter for Category
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	
	// getter and setter for Date
	public LocalDate getDate() {
		return Date;
	}
	public void setDate() {
		Date = LocalDate.now();
	}
	
	
	// getter and setter for Time
	public LocalTime getTime() {
		return Time;
	}
	public void setTime() {
		Time = LocalTime.now();
	}
	
	// getter and setter for amount
	public long getAmount() {
		return Amount;
	}
	public void setAmount(long amount) {
		Amount = amount;
	}
	
	// getter and setter for Balance
	public long getBalance() {
		return Balance;
	}
	
	public void setBalance() {
		Balance = Balance + this.Amount ;
	}


}
