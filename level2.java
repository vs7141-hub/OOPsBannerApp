import java.util.Scanner;

public class level2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Question 1 -----");
        System.out.print("Enter number1: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter number2: ");
        double number2 = sc.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", "
                + multiplication + ", and " + division);


        System.out.println("\n----- Question 2 -----");
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is "
                + areaInch + " and sq cm is " + areaCm);


        System.out.println("\n----- Question 3 -----");
        System.out.print("Enter perimeter: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is "
                + side + " whose perimeter is " + perimeter);
    }
}