package model;

public class Account {
	private int accountNo;
	private double accountBalance;
	private String accountPassword;
	private static final String bankName;
	
	static {
		bankName="HDFC";
	}
	
	public Account() {}

	public Account(int accountNo, double accountBalance, String accountPassword) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountPassword = accountPassword;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	public String getBankName() {
		return bankName;
	}
	
	public void displayAccount() {
		System.out.println("Your Account Number is : "+this.accountNo);
		System.out.println("Your Account Balance is : "+this.accountBalance);
		System.out.println("Your Account Password is : "+this.accountPassword);
		System.out.println("Your Bank Name is : "+Account.bankName);		
	}
}
public class Main{

	public static void main(String[] args) {
		Account acc = new Account(101,100000.00,"123@abc");
		acc.displayAccount();
	}

}