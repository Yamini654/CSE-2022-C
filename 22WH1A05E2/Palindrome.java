package lab_questions;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (isPalindrome(number))
        {
            System.out.println(number + " is a palindrome.");
        }
        else
        {
            System.out.println(number + " is not a palindrome.");
        }
    }
    private static boolean isPalindrome(int num)
    {
        int originalNumber = num;
        int reversedNumber = 0;
        while (num > 0)
        {
            int remainder = num % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            num /= 10;
        }
        return originalNumber == reversedNumber;
    }
}