package week3;
import java.util.Scanner;


/**
 * Write a description of class Operators here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Operators
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your first number");
    int a=sc.nextInt();
    System.out.println("enter your second number");
    int b=sc.nextInt();
    
    int sum=a+b;
    int difference =a-b;
    float division=(float)a/b;
    int multiplication= a*b;
    
    System.out.println("the number of sum is:" + sum +"\n the difference is:" + difference +"\n the division is" + division + "\n the multiplication is:" + multiplication);
    
    
    
    
    }
}