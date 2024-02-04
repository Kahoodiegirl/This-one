Class Problem3

{ import math;

    {
        print("1) Square");
        print("2) Triangle");

choice = input("Enter a number: ");

if choice == '1':
    side_length = float(input("Enter the length of one side of the square: "));
    area = side_length ** 2
    print("The area of the square is:", area);
elif choice == '2':
    base = float(input("Enter the base length of the triangle: "));
    height = float(input("Enter the height of the triangle: "));
    area = 0.5 * base * height
    print("The area of the triangle is:", area);
else:
    print("Error: Invalid input. Please enter either 1 or 2.");
    }
}