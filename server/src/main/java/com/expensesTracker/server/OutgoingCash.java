package com.expensesTracker.server;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class OutgoingCash {
	
	@Id
	@GeneratedValue
	private int OTID;
	private String TransactionName;
	private String Category;
	private LocalDate Date;
	private LocalTime Time;
	private long Amount;
	private long Balance;
	
}
