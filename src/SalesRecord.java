import java.util.Scanner;

public class SalesRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String custName, custNumber, taxCode;
				float salesAmount, totalDue, taxPercent, totalTax;
				taxPercent = 0;
				
				Scanner keyboard = new Scanner(System.in);
				
				System.out.print( "Enter Customer Number:" );
				custName = keyboard.next();
				
				System.out.print( "Enter Customer Name:" );
				custNumber = keyboard.next();
				
				System.out.print( "Enter Sales Amount:" );
				salesAmount = keyboard.nextFloat();
				
				System.out.print( "Enter Tax Code:" );
				taxCode = keyboard.next();
				

				if (taxCode.equals("NRM"))
				      taxPercent = .06f;
				else if (taxCode.equals("NPF"))
					  taxPercent = 0;
				else if (taxCode.equals("BIZ"))
					  taxPercent = .045f;
					
				totalTax = (taxPercent * salesAmount);
				totalDue = (salesAmount + totalTax);
				
				System.out.println("Customer ID:" + custNumber);
				System.out.println("Customer Name:" + custName);
				System.out.println("Sales Amount:" + salesAmount);
				System.out.println("Tax Code:" + taxCode);
				System.out.println("Total Amount Due: $" + totalDue);


				
			}
		}
	


//Create a program that allows the user enter a sales record 
//(which includes customer number, name, sales amount and a tax code).
//tax code 	tax amount
//NRM 	6%
//NPF 	0%
//BIZ 	4.5%
//
//The program should output a total that includes the tax owed (if any).
//
//Customer ID: 101
//Customer Name: Bart Simpson
//Sales Amount: $500.00
//Tax Code: NPF
//Total Amount Due: $500.00
 
