class radius
{
    public static void main (String args[])
    {
      Scanner input = new Scanner(System.in);
      final double PI = 3.14159265359;

      System.out.print("Enter the radius and langth of a cylinder: ");
      double radius = input.nextDouble();
      double length = input.nextDouble();
      
      double area = radius * radius * PI;
      double volume = area * lenghth;

      System.out.println("The area is " + area);
      System.out.println("The volume is " + volume);
    }
}