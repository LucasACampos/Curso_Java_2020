package secao8;

public class Account {
	
	private static final double TAX_FOR_WITHDRAW = 5f;
	
	private int accountNumber;
	
	private String accountHolder;
	
	private double balance;
	
	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = initialDeposit;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public void deposit(double value){
		balance += value;
	}
	
	public void withdraw(double value){
		balance -= (value + TAX_FOR_WITHDRAW);
	}
	
	@Override
	public String toString() {
		return
				"Account: " + accountNumber +
				", Holder: " + accountHolder +
				", Balance: " + String.format("%.2f", balance)
				;
	}
}
