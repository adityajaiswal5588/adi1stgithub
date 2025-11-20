
/**
 * Write a description of class biggerNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class biggerNumber
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the firstNumber");
        int firstNumber= sc.nextInt();
        System.out.println("Enter the secondNumber");
        int secondNumber=sc.nextInt();
        
        int bigger=(firstNumber>secondNumber)?firstNumber:secondNumber;
        System.out.println("bigger number is"+bigger);
        
}
}