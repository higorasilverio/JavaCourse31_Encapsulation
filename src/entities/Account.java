package entities;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance = 0.00;
	
	public Account(Integer number, String holder, Double amount) {
		this.number = number;
		this.holder = holder;
		deposit(amount);
	}
	
	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;		
	}
	
	public void withdraw(Double amount) {
		this.balance -= (amount + 5.00);		
	}

	@Override
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
	
}
