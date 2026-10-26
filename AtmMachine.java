import java.util.*;
class SBI
{
	//Attributes
	private int pin;
	protected double balance; // encapsulation
    Scanner sc = new Scanner(System.in);
	//Constructor
	SBI(int pin , double balance)
	{
		System.out.println("Hiiiiiiii");
		this.pin = pin;
		this.balance = balance;
	}
	public int getPin() //getter fn
	{
		return pin;
	}
	public void setChangePin() //Setter fn
	{
		System.out.println("Enter your Pin");
		int askPin = sc.nextInt();
		if(askPin == pin)
		{
			System.out.println("Enter new Pin");
			int newPin = sc.nextInt();
			pin = newPin;
		}
		else
		{
			System.out.println("Invalid Pin , Bhag jao!!");
		}
	}
	//Methods
	void createPin()
	{
		System.out.println("Enter your Pin");
		int enterPin = sc.nextInt();
		pin = enterPin;
	}
	void checkBal()
	{
		System.out.println("Enter your Pin");
		int askPin = sc.nextInt();
		if(askPin == pin)
		{
			System.out.println("Current Balance:" + balance);
		}
		else
		{
			System.out.println("Invalid Pin , Bhag jao!!");
		}
	}
	void addBal()
	{
		System.out.println("Enter your Pin");
		int askPin = sc.nextInt();
		if(askPin == pin)
		{
			System.out.println("Enter your Amount");
			int amount = sc.nextInt();
			balance = balance + amount;

		}
		else
		{
			System.out.println("Invalid Pin , Bhag jao!!");
		}
	}
	void withdrawBal()
	{
		System.out.println("Enter the pin!");
		int askPin = sc.nextInt();
		if(askPin == pin)
		{
			System.out.println("Enter the amount!");
			int amount = sc.nextInt();
			if(amount <0 || amount>balance)
			{
				System.out.println("Invalid amount or insufficient balance");
			}
			balance = balance - amount;
			System.out.println("Balance Withdrawn: "+ amount);
			System.out.println("Current Balance "+ balance);
		}
		else
	{
			System.out.println("Invalid Pin , Bhag jao!!");
		}
	}
}	

public class AtmMachine
{
	public static void main(String args[])
	{
		SBI user1 = new SBI(1234 , 10000);
		Scanner sc = new Scanner(System.in);
		while(true)
	{
		System.out.println("ENter 1 to change pin");
		System.out.println("Enter 2 to check balance");
		System.out.println("Enter 3 to add balance");
		System.out.println("Enter 4 to withdraw balance");
		System.out.println("Enter 5 to exit");
		int choice = sc.nextInt();
		if(choice == 1)
		{
			//changepin
			user1.setChangePin();

		}
		else if(choice == 2)
		{
			//check balance
			user1.checkBal();
		}
		else if(choice == 3)
		{
			//add balance
			user1.addBal();
			
		}
		else if(choice == 4)
		{
			//withdraw balance
			user1.withdrawBal();
		}
		else if(choice == 5)
		{
			System.out.println("Thank you for using our services");
			break;
		}
		else
		{
			System.out.println("Invalid choice");
		}
	}

	}
}