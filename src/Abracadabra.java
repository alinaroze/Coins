

	import java.text.NumberFormat;
	import java.util.Locale;
	import java.util.Scanner;

		public class Abracadabra
		{ public static void main(String[] args)
	{  
	   final double PENNY_VALUE = 0.01;
	   final double NICKEL_VALUE = 0.05;
	   final double DIME_VALUE = 0.1;
	   final double QUARTER_VALUE = 0.25;
	   final double HALFDOLLAR_VALUE = .5;
	   final double DOLLAR_VALUE = 1.0;
	   
	   Scanner console = new Scanner ( System.in );

	   System.out.printf("How many pennies do you have?\n");
	   int pennies = console.nextInt();

	   System.out.printf("How many nickels do you have?\n");
	   int nickels = console.nextInt();

	   System.out.printf("How many dimes do you have?\n");
	   int dimes = console.nextInt();

	   System.out.printf("How many quarters do you have?\n");
	   int quarters = console.nextInt();
	   
	   System.out.printf("How many halfdollars do you have?\n");
	   int halfdollars = console.nextInt();
	   
	   System.out.printf("How many dollars do you have?\n");
	   int dollars = console.nextInt();
	   
	   int total = (int) (pennies * PENNY_VALUE
	         + nickels * NICKEL_VALUE
	         + dimes * DIME_VALUE
	         + quarters * QUARTER_VALUE
	         + halfdollars * HALFDOLLAR_VALUE
	         + dollars * DOLLAR_VALUE);
	   
	            // total value of the coins

	   NumberFormat formatter
	         = NumberFormat.getCurrencyInstance(Locale.US);

	   System.out.printf("Total value = " + formatter.format(total) );

	   console.close();
	   } // end main
		
		
	}    // end class

