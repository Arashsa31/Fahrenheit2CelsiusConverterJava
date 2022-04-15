/**
 * @author Arash
 * This program takes a Fahrenheit temperature input and converts it to its equivalent in Celsius temperature
 * The conversion formula used is: Celsius = 5/9*(Fahrenheit-32)
 */


/**
 * import packets
 */

//import java.util.Scanner; 
import java.util.*;

public class FtoCconverter 
{

	public static void main(String[] args) 
	{
		// declare variables
		double fTemp, cTemp;
		
		// takes the user input
		System.out.print("Please enter the current temperature in Fahrenheit: ");
		
		// creates scanner object
		Scanner keyboard = new Scanner(System.in);
		
		/** declares fTemp as double
		 *  takes the user input and places it into the fTemp variable
		 */ 
	    //double fTemp = keyboard.nextDouble(); // declares variable in-line
		fTemp = keyboard.nextDouble(); 
	    
	    // repeats what the user entered 	    
	    System.out.print("You entered the current temperature as " + fTemp + " degrees in Fahrenheit.\n");

	    
		/** declares c as double
		 *  use the conversion formula to convert Fahrenheit temperature to Celsius temperature
		 */
	    //double cTemp = 5/9*(fTemp-32); // declares variable in-line
	    cTemp = 5.0/9.0* (fTemp-32.0);
	    
	    // prints the converted temperature cTemp to the user
	    System.out.print("Your converted temperature of " + fTemp + " Fahrenheit ");
	    System.out.printf("in Celsius is: %.3f degrees.\n", cTemp ); //rounds the decimal up to 3 points

	    //closes object scanner
	    keyboard.close();
	}

}
