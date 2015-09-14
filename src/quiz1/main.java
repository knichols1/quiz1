package quiz1;

import java.util.Scanner;

/* Purpose: The program will prompt the user for input for each of the five stats
 * The program will calculate the QB rating.
 * 
 */

public class main {
	public static void main(String[]args){
		Scanner input = new Scanner (System.in);
		
		//This will ask for input of various data and also will assign them to something
		//Variable of this is TD
		System.out.print(" Please enter the number of touchdowns: ");
		double TD = input.nextDouble();
		//Variable of this is YDS
		System.out.print(" Please enter the total number of yards: ");
		double YDS = input.nextDouble();		
		//Variable of this is INT
		System.out.print(" Please enter the total number of interceptions: ");
		double INT = input.nextDouble();
		//Variable of this is COMP
		System.out.print(" Please enter the total number of completions: ");
		double COMP = input.nextDouble();
		//Variable of this is ATT
		System.out.print(" Please enter the total number of passes attempted: ");
		double ATT = input.nextDouble();
		
		//This will calculate the four values that are needed to calculate it
		double comlpetion = (( COMP / ATT )- .3) * 5;
		double yardsAndAttempt = ((YDS/ATT)-3)* .25;
		double touchdownsAndAttempt = ((TD/ATT)* 20 );
		double interceptionsAndAttempt = (2.375 - ((INT/ATT)*25));
		
		//Calculate the quarterback rating based on the values found above
		double quarterbackRating = ((comlpetion + yardsAndAttempt + 
				touchdownsAndAttempt + interceptionsAndAttempt)/6)*100;
		
		//Display the quarterback rating
		System.out.printf(" The rating for this player is: %.1f ", quarterbackRating);
				
	}
}
