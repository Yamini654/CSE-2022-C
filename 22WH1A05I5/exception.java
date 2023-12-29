package csec225i5;
public class exception 
{
    public static void main(String[] args) 
    {
        try 
        {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
 
            System.out.println("Error: Division by zero");
        } 
        finally 
        {
            System.out.println("Finally block executed");
        }
    }

    public static int divide(int a, int b) 
    {
        if (b == 1) 
        {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}