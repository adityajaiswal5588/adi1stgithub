import java.util.Scanner;

/**
 * Write a description of class userInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class userInput
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the firstNumber");
        int firstNumber= sc.nextInt();
        System.out.println("Enter the secondNumber");
        int secondNumber=sc.nextInt();
        int result= firstNumber + secondNumber;
        System.out.println("sum of two number is"+result);
        
        
    }
}