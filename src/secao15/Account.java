package secao15;

import secao15.exception.WithdrawException;

public class Account {
	
	private int number;
	
	private String holder;
	
	private double balance;
	
	private double withdrawLimit;
	
	public Account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit (double amount){
		balance += amount;
	}
	
	public void withdraw(double amount) throws WithdrawException {
		if(amount > withdrawLimit){
			throw new WithdrawException("The amount exceeds limit");
		}
		if(amount > balance){
			throw new WithdrawException("Not enough balance");
		}
		balance -= amount;
		
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getWithdrawLimit() {
		return withdrawLimit;
	}
}
