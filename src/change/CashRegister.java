package change;

public class CashRegister 
{
	public static void main(String[] args) 
	{
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		double price, tendered;
		
		System.out.print("List the price of the item: ");
		price = keyboard.nextDouble();
		price = price * 100;
		
		System.out.print("The customer provided: ");
		tendered = keyboard.nextDouble();
		tendered = tendered * 100;
		
		keyboard.close();
		
		
		if (tendered < price)
		{
			System.out.println("\nERROR: Insufficient Funds");
		}
		
		else if (tendered == price)
		{
			System.out.println("\nThe customer has given you exact change.");
			System.out.println("No further action required.");
		}
		
		else
		{
			System.out.println("\nThe customer has given you too much money.");
			System.out.println("Their change:\n");
			
			int change = (int)(tendered - price);
			
			if (change >= 2000)
			{
				int twentyDollar = (int)(change / 2000);
				System.out.println("Twenty Dollar Bills: " + twentyDollar);
				
				change = change % 2000;
			}
			if (change >= 1000)
			{
				int tenDollar = (int)(change / 1000);
				System.out.println("Ten Dollar Bills: " + tenDollar);
				
				change = change % 1000;
			}
			if (change >= 500)
			{
				int fiveDollar = (int)(change / 500);
				System.out.println("Five Dollar Bills: " + fiveDollar);
				
				change = change % 500;
			}
			if (change >= 100)
			{
				int oneDollar = (int)(change / 100);
				System.out.println("One Dollar Bills: " + oneDollar);
				
				change = change % 100;
			}
			if (change >= 25)
			{
				int quarter = (int)(change / 25);
				System.out.println("Quarters: " + quarter);
				
				change = change % 25;
			}
			if (change >= 10)
			{
				int dime = (int)(change / 10);
				System.out.println("Dimes: " + dime);
				
				change = change % 10;
			}
			if (change >= 5)
			{
				int nickel = (int)(change / 5);
				System.out.println("Nickels: " + nickel);
				
				change = change % 5;
			}
			if (change < 5)
			{
				int penny = (int)(change);
				if (penny > 0)
				{
					System.out.println("Pennies: " + penny);
				}

			}
		}
	}
}

//User Story #1
//
//The user is prompted asking for the price of the item.
//
//User Story #2
//
//The user is then prompted asking how much money was tendered by the customer.
//
//User Story #3
//
//Display an appropriate message if the customer provided too 
//little money or the exact amount.
//
//User Story #4
//
//If the amount tendered is more than the cost of the item, display the 
//number of bills and coins that should be given to the customer.
