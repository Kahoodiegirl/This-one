Class First
{
    public static void main(String args[]);
    {
        Scanner jeff = new Scanner(System.in);

        System.out.print("Enter your full name: ");

        String name = jeff.nextLine();

        System.out.println("Hello, " + name + "!");

        jeff.close();
    }
}