import java.io.*;
import java.util.*;

public class testdriverclass extends GasPump
{
public static void main(String args[]) throws IOException
	{
		GasPump gp=new GasPump();
		float a,b,d,cash;
		Scanner scan=new Scanner(System.in);
		int x;
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t CS 589: FALL 2015");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t PROJECT DEMO");
		System.out.print("Press enter to continue");
		scan.nextLine();
		
		
		int i=0;
		int k;
		
		while(i==0)
		{
		System.out.println("Test Driver for GasPump Class");
		System.out.println("1. Activate");
		System.out.println("2. PayCredit");
		System.out.println("3. Reject");
		System.out.println("4. Approved");
		System.out.println("5. PayCash");
		System.out.println("6. Cancel");
		System.out.println("7. Regular");
		System.out.println("8. Super");
		System.out.println("9. Diesel");
		System.out.println("10. StartPump");
		System.out.println("11. PumpLiter");
		System.out.println("12. StopPump");
		System.out.println("13. NoReceipt");
		System.out.println("14. Receipt");
		System.out.println("15. TurnOff");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Testing Related Methods");
		System.out.println("16. ShowState");
		System.out.println("17. ShowPrice");
		System.out.println("18. Show value of W");
		System.out.println("19. Number of Gallons Pumped");

		
		System.out.println("20. Quit");
		System.out.println("Please select any option");
		
		x=scan.nextInt();
		

		switch(x)
		{
			case 1: 
			System.out.println("GasPump Class");
			System.out.println("Activate(float a,float b,float d) method");
			System.out.println();
			System.out.println("Enter Regular Price");
			a=scan.nextFloat();
			System.out.println("Enter Super Price");
			b=scan.nextFloat();
			System.out.println("Enter Diesel Price");
			d=scan.nextFloat();
			System.out.println("Result is: "+gp.Activate(a,b,d));
			System.out.print("Press enter to continue");
			scan.nextLine();
			scan.nextLine();
			break;
			
			
			case 2:
			System.out.println("GasPump Class");
			System.out.println("PayCredit() method"); 
			System.out.println();
			System.out.println("Result is: "+gp.PayCredit());
			System.out.print("Press enter to continue");
			scan.nextLine();
			scan.nextLine();
			break;
			
			
			case 3: 	
			System.out.println("GasPump Class");
			System.out.println("Reject() method");
			System.out.println();
			System.out.println("Result is: "+gp.Reject());
			System.out.print("Press enter to continue");
			scan.nextLine();
			scan.nextLine();
			break;
			
			
			case 4:
			System.out.println("GasPump Class");
			System.out.println("Approved() method");
			System.out.println();
			System.out.println("Result is: "+gp.Approved());
			System.out.print("Press enter to continue");
			scan.nextLine();
			scan.nextLine();
			break;


			case 5:
			System.out.println("GasPump Class");
			System.out.println("PayCash(float c) method");
			System.out.println();
			System.out.println("Enter Cash");
			cash=scan.nextFloat();
			System.out.println("Result is: "+gp.PayCash(cash));
			System.out.print("Press enter to continue");
			scan.nextLine();
			scan.nextLine();
			break;
			
			case 6:
			System.out.println("GasPump Class");
			System.out.println("Cancel() method");
			System.out.println();
			System.out.println("Result is : "+gp.Cancel());
			System.out.print("Press enter to continue");
			scan.nextLine();
			scan.nextLine();
			break;
			
			case 7:
			System.out.println("GasPump Class");
			System.out.println("Regular() method");
			System.out.println();
			System.out.println("Result is: "+gp.Regular());
			System.out.print("Press enter to continue");
			scan.nextLine();
			scan.nextLine();
			break;
			
			case 8:
			System.out.println("GasPump Class");
			System.out.println("Super() method");
			System.out.println();
			System.out.println("Result is: "+gp.Super());
			System.out.print("Press enter to continue");
			scan.nextLine();
			scan.nextLine();
			break;	

			case 9:
			System.out.println("GasPump Class");
			System.out.println("Diesel() method");
			System.out.println();
			System.out.println("Result is: "+gp.Diesel());
			System.out.print("Press enter to continue");
			scan.nextLine();
			scan.nextLine();
			break;
			
			case 10:
			System.out.println("GasPump Class");
			System.out.println("StartPump() method");
			System.out.println();
			System.out.println("Result is: "+gp.StartPump());
			System.out.print("Press enter to continue");
			scan.nextLine();
			scan.nextLine();
			break;
			
			case 11:
			System.out.println("GasPump Class");
			System.out.println("PumpLiter() method");
			System.out.println();
			System.out.println("Result is: "+gp.PumpLiter());
			System.out.print("Press enter to continue");
			scan.nextLine();
			scan.nextLine();
			break;
			
			case 12:
			System.out.println("GasPump Class");
			System.out.println("StopPump() method");
			System.out.println();
			System.out.println("Result is: "+gp.StopPump());
			System.out.print("Press enter to continue");
			scan.nextLine();
			scan.nextLine();
			break;

			case 13:
			System.out.println("GasPump Class");
			System.out.println("NoReceipt() method");
			System.out.println();
			System.out.println("Result is: "+gp.NoReceipt());
			System.out.print("Press enter to continue");
			scan.nextLine();
			scan.nextLine();
			break;
			
			case 14:
			System.out.println("GasPump Class");
			System.out.println("Receipt() method");
			System.out.println();
			System.out.println("Result is: "+gp.Receipt());
			System.out.print("Press enter to continue");
			scan.nextLine();
			scan.nextLine();
			break;

			case 15:
			System.out.println("GasPump Class");
			System.out.println("TurnOff() method");
			System.out.println();
			System.out.println("Result is: "+gp.TurnOff());
			System.out.print("Press enter to continue");
			scan.nextLine();
			scan.nextLine();
			break;
			
			
			case 16:
			System.out.println("The State is: "+gp.getState());
			System.out.print("Press enter to continue");
			scan.nextLine();
			scan.nextLine();
			scan.nextLine();
			break;

			
			
			
			    case 17:
				System.out.println("Price: $ "+gp.getPrice());
				System.out.println("Total: $"+gp.getTotal());
				System.out.println("Cash: $"+gp.getCash());
				System.out.print("Press enter to continue");
				scan.nextLine();
				scan.nextLine();
				scan.nextLine();
				break;

				case 18:
				System.out.println("Value of w: "+gp.getW());
				System.out.print("Press enter to continue");
				scan.nextLine();
				scan.nextLine();
				scan.nextLine();
				break;

				case 19:
				System.out.println("Number of Gallons pumped: "+gp.getNumberOfGallons());
				System.out.print("Press enter to continue");
				scan.nextLine();
				scan.nextLine();
				scan.nextLine();
				break;

			
			

			case 20:
			System.out.println("Quit");

			
			
			
			
			i=1;
			break;

			default:
			System.out.println("Please enter valid input");
			System.out.print("Press enter to continue");
			scan.nextLine();
			scan.nextLine();
			
		}	
		}		
	}
}

