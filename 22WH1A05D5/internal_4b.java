package frames;

import java.util.Scanner;

public class internal_4b {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.print("Enter the third number: ");
	        double num3 = scanner.nextDouble();

	        double greatestNumber = Math.max(Math.max(num1, num2), num3);
	        
	        System.out.println("The greatest number is: " + greatestNumber);

	        scanner.close();
	    }
	}