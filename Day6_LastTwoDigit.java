import java.util.Scanner;
class LastTwoDigit
{
  public static void main(String[]args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number");
 int num = sc.nextInt();

 System.out.println("Last two digit is"+num%100);
} 
}