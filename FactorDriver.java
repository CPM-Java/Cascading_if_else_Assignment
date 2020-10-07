/**
 * Demonstration source code.
 * Demonstrates use of:
 *   console interface and model objects
 *   while loops
 *   if else logic
 * 
 * @author GrayKnight 
 * @version 10/11/12 10/13/17
 */
import java.util.Scanner;

public class FactorDriver
{
    private FactorModeler doNow = new FactorModeler();
    private Scanner scan = new Scanner(System.in);
    // A separate Scanner object for scanning Strings can help keep things running smoothly.
    private Scanner scan2 = new Scanner(System.in);
    
    //surveys the user for information
    //controls execution
    public void runDemo()
    {
        String sentinel = "y";
        int count1, count2;
      
        while(sentinel.equals("y"))
        {
            System.out.print("Enter an integer:");
            count1 = scan.nextInt();
            System.out.print("Enter another integer:");
            count2 = scan.nextInt();
            
            
            System.out.println(doNow.evenlyDivisible(count1, count2));
           
            
            System.out.print("Try Again? (y or n):");
            sentinel = scan2.nextLine();
        } 
        System.out.println("Goodbye!:");
    }
}
