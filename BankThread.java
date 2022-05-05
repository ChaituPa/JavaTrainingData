
public class BankThread {
public static void main(String[] args) {
	 BankAccount b1= new BankAccount();
	 SavingsBankAccount sb1= new SavingsBankAccount();
	 FixedDepositAccount fb1= new FixedDepositAccount();
	 CurrentBankAccount cb1= new CurrentBankAccount();
	 CreditBankAccount crb1= new CreditBankAccount();
	 
	 b1.run();
	 sb1.run();
	 fb1.run();
	 cb1.run();
	 crb1.run();

}
}

class BankAccount extends Thread
{
	public void run()
	{
		int acn = -201;
		if (acn<0) {
			System.out.println("\tAccount Number cannot be Negative....");
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class SavingsBankAccount extends Thread
{
	public void run()
	{
		int roi=-2; 
		if (roi<0) {
			System.out.println("\tRate of Interest cannot be Negative....");
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}

class FixedDepositAccount extends Thread
{
	public void run()
	{
		int tenure= -5;
		if (tenure<0) {
			System.out.println("\tTenure cannot be Negative....");
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class CurrentBankAccount extends Thread
{
	public void run()
	{
		int acbal=-50000;
		if (acbal<0) {
			System.out.println("\tAccount Balance cannot be Negative....");
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class CreditBankAccount extends Thread
{
	public void run()
	{
		int lim=100000;
		if (lim>10000) {
			System.out.println("\tAccount is overdrawn..Limit exceeding..");
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}