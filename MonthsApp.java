import java.util.*;


public class MonthsApp {
	public static void main (String[]args){

		//variables
		int months;
		int days;


		//objects

		Months myMonths = new Months();
		Scanner keyboard = new Scanner (System.in);


		//inputs
		System.out.println("Please enter the month of the year by the number e.g. 1 = January");
		months=keyboard.nextInt();
		myMonths.setMonth(months);


		//process
		myMonths.compute();



		//output
		days=myMonths.getDays();
		System.out.println("The month you entered " + months + " has " + days + " days." );




		}






	}