import java.util.*;

public class First
{
public static void main(String[] args)
  {

    Scanner keyboard = new Scanner(System.in);

    int[] values;
    values = new int[10];

   
    System.out.println("Please enter 10 numbers:");
    for (int i = 0; i< values.length; i++) 
    {
      values[i] = keyboard.nextInt();
    }
    int[] reverseNums;
    reverseNums = new int[10];
    for (int i = (values.length -1); i>= 0; i--) 
    {
      reverseNums[ reverseNums.length -1 -i ] = values[ i ];
      System.out.println( reverseNums[ i ] );
    } 
 }
}