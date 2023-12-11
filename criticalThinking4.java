//Import Scanner class
//Set up Document
import java.util.Scanner;
public class criticalThinking4 {
	public static void main(String[] args) {
		
		//Initialize new scanner (scr)
		Scanner scr = new Scanner(System.in);
		
		//Set up variables
		
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		double num4 = 0;
		double num5 = 0;
		
		double maxNum = 0;
		double minNum = 0;
		
		String userResponse;
		
		boolean startInitialLoop = false;
		boolean startCalculationsLoop = false;
				
		// Initialize Loop Structure
		System.out.println("Would you like to begin? Press Y for yes or N for no");
		userResponse = scr.next();
		
		if (userResponse.equals("yes") || userResponse.equals("Yes") || userResponse.equals("y") || userResponse.equals("Y")) {
			startInitialLoop = true;
			
			while (startInitialLoop == true) {										//BEGIN MAIN LOOP
				
				if (startInitialLoop == true) {
					// Enter 5 floating point numbers
					System.out.println("Enter 5 floating point numbers...");
				
					//Error handling mechanism for non-numeric input
					if (scr.hasNextDouble()) {
						num1 = scr.nextDouble();
					} else {
						System.out.println("Invalid input. Please enter a floating point number.");
						startInitialLoop = false;
					}
					
					if (scr.hasNextDouble()) {
						num2 = scr.nextDouble();
					} else {
						System.out.println("Invalid input. Please enter a floating point number.");
						startInitialLoop = false;
					}
					
					if (scr.hasNextDouble()) {
						num3 = scr.nextDouble();
					} else {
						System.out.println("Invalid input. Please enter a floating point number.");
						startInitialLoop = false;
					}
					
					if (scr.hasNextDouble()) {
						num4 = scr.nextDouble();
					} else {
						System.out.println("Invalid input. Please enter a floating point number.");
						startInitialLoop = false;
					}
					
					if (scr.hasNextDouble()) {
						num5 = scr.nextDouble();
						
						// Question "Are you satisfied with the numbers entered?
						System.out.println();
						System.out.println("Are you satisfied with the numbers entered? Press Y for yes or N for no");
						
					} else {
						System.out.println("Invalid input. Please enter a floating point number.");
						startInitialLoop = false;
					}
					
				}
				
				// Calculate Average, Sum Total, Interest @ 20%
				double sumNum = (num1 + num2 + num3 + num4 + num5);
				double averageNum = ((num1 + num2 + num3 + num4 + num5) / 5);
				double interestNum = ((num1 + num2 + num3 + num4 + num5) * 0.20);
				
				// User response from previous question starts branches
					// YES - startCalculationsLoop = true;
					// NO - option to reenter numbers or quit will be given
				userResponse = scr.next();
				if (userResponse.equals("yes") || userResponse.equals("Yes") || userResponse.equals("y") || userResponse.equals("Y")) {
					startCalculationsLoop = true;
				} 
						
				// MIN & MAX VALUE CALCULATIONS BEGIN
				if (startCalculationsLoop == true) {
					System.out.println("Your data is being processed...");
					
					// Find Max Value
					while (num1 >= 0) {
						
						maxNum = num1;
					
						if (num2 > num1) {
							maxNum = num2;
						} 
						if (num3 > num2) {
							maxNum = num3;
						}
						if (num4 > num3) {
							maxNum = num4;
						}
						if (num5 > num4) {
							maxNum = num5;
						}
						
						break;
						
					}
				
				// Find Min Value
					
					while (num1 >= 0) {
						
						minNum = num1;
						 
						if (num2 < num1) {
							minNum = num2;
						} 
						if (num3 < num2) {
							minNum = num3;
						}
						if (num4 < num3) {
							minNum = num4;
						}
						if (num5 < num4) {
							minNum = num5;
						}
						
						break;
						
					}
					
					startCalculationsLoop = false;
					
					//Print strings for program aesthetics
					
					System.out.println("...............");
					System.out.println("...............");
					System.out.println("...............");
					
					//Output messagges
					System.out.println("Processing complete.");
					System.out.println();
					System.out.println("The following statistics are available: "); 
					System.out.println();
					
					// Print Calculations to screen
					System.out.printf("\t Number total: %.2f\n", sumNum);
					System.out.printf("\t Number average: %.2f\n ", averageNum);
					System.out.printf("\t Max number: %.2f\n", maxNum);
					System.out.printf("\t Min number: %.2f\n ", minNum);
					System.out.printf("\t 20%% interest of number total: %.2f\n", interestNum);
					System.out.println();
					
				}														// END OF MIN & MAX VALUE CALCULATIONS
				else {
					startInitialLoop = false;
					System.out.println("No data found...");
					System.out.println();
				}
				
				//give option to continue with new values or quit
				System.out.println("Would you like to enter new numbers? Press Y for yes or N for no" );
				userResponse = scr.next();
				
				// if YES, startLoop = true;
				if (userResponse.equals("yes") || userResponse.equals("Yes") || userResponse.equals("y") || userResponse.equals("Y")) {
					startInitialLoop = true;
				} else {							// If user responds no, option to reenter numbers or quit will be given
					startInitialLoop = false;
					
					//Terminate program message
					System.out.println("Ok, have a nice day.");
				}
			
			}															//END OF MAIN LOOP
			
		}																//END OF IF-STATEMENT
		
		else {															//EXIT PROGRAM
		
		//Terminate program message
		System.out.println("Ok, have a nice day.");						
		
		}
		
	}
	
}
