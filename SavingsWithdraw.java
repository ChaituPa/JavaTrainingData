
public class SavingsWithdraw {
	public static void main(String[] args) {
		BankAccountt acc = new BankAccountt(10001, "Amey", 100000);
		System.out.println("acc"+acc);
		
		Teller t1 = new Teller("Amol",acc,5000); //3
		Teller t2 = new Teller("\tAmul",acc,11000); //3
		Teller t3 = new Teller("\t\tAmish",acc,4000); //3
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join(); 
			t2.join(); 
			t3.join(); 
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
				System.out.println("last line : ba"+acc);
	}
}
class Teller extends Thread //1
{
	String tellerName;
	BankAccountt ref;
	double amountToWithdraw;
	
	Teller(String name, BankAccountt x, double amt) {
		tellerName= name;
		ref= x;
		amountToWithdraw=amt;
	}
	void withdrawCash() {
		ref.withdraw(amountToWithdraw, tellerName);
	}
	public void run() { //2
		withdrawCash();
	}
}
class BankAccountt {
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	
	public BankAccountt(int accountNumber, String accountHolderName, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	@Override
	public String toString() {
		return "BankAccount [AccountNumber=" + accountNumber + ", AccountHolderName=" + accountHolderName
				+ ", AccountBalance=" + accountBalance + "]";
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getAccountBalance(String tn) {
		System.out.println(tn+" getting the balance....");
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance,String tn) {
		System.out.println(tn+" setting the balance....");
		this.accountBalance = accountBalance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public synchronized void withdraw(double amountToWithdraw, String tn) {
		System.out.println(tn+" Withdraw started");
		double currentBalance = getAccountBalance(tn);
		System.out.println(tn+" Balance got : "+currentBalance);
		System.out.println(tn+" calculating new balance ");
		double newBalance = currentBalance - amountToWithdraw;
		setAccountBalance(newBalance,tn);
		System.out.println(tn+" Withdraw finished");
		System.out.println("Update the passbook!!!!!");
	}
	
}