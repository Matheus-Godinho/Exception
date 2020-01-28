package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance, withdrawLimit;
	
	public Account() {
	}
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public Double getBalance() {
		return balance;
	}
	public void deposit(Double amount) {
		balance += balance;
	}
	public void withdraw(Double amount) {
		if (amount > getWithdrawLimit())
			throw new DomainException("The amount exceeds withdraw limit");
		if (amount > getBalance())
			throw new DomainException("Not enough balance");

		balance -= balance;
	}
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

}
