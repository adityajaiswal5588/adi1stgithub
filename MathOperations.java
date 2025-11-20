import java.util.Scanner;

public class MathOperations
{
    public static void main(String[]arg)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the grade in number=");
        int grade= sc.nextInt();
        
        String result=(grade>=40)?"pass":(grade<40)?"fail":"invalid input";
        
        System.out.println(result);
    }
}