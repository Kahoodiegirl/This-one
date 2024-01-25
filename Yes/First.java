import java.util.Scanner;

class Yes
{
    public static void main (String args[])
    {
        Scanner myScanner = new Scanner(System.in);

        System.out.print ("Enter your first name: ");

        String name = myScanner.nextLine();

        System.out.print ("Enter your last name: ");

        String lastname = myScanner.nextLine();

        System.out.println ("Hello, " + name + lastname + "!");

        myScanner.close();
    }
}