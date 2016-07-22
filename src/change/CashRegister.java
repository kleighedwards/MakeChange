package change;

public class CashRegister 
{
	public static void main(String[] args) 
	{
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		double price, tendered;
		
		System.out.print("List the price of the item: ");
		price = keyboard.nextDouble();
		
		System.out.print("How much money did the customer give you: ");
		tendered = keyboard.nextDouble();
		
		if (tendered < price)
		{
			System.out.println("ERROR: Insuficient Funds");
		}
		
		else if (tendered == price)
		{
			System.out.println("The customer has given you exact change.");
			System.out.println("No further action required.");
		}
		
		else
		{
			System.out.println("The customer has given you too much money.");
			System.out.println("You must give them their change.");
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
