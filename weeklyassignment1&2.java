import java.util.Scanner;

public class JavaBasicsNewSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========== LEVEL 1 ==========");

        System.out.println("\nQuestion 1: Perimeter of Rectangle");
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter = " + perimeter);

        System.out.println("\nQuestion 2: Convert Seconds to Minutes");
        System.out.print("Enter seconds: ");
        int seconds = sc.nextInt();
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println("Minutes = " + minutes + " and Remaining Seconds = " + remainingSeconds);

        System.out.println("\nQuestion 3: Square of a Number");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Square = " + (num * num));

        System.out.println("\nQuestion 4: Temperature Conversion (Celsius to Fahrenheit)");
        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        double f = (c * 9/5) + 32;
        System.out.println("Fahrenheit = " + f);



        System.out.println("\n========== LEVEL 2 ==========");

        System.out.println("\nQuestion 1: Average of 3 Numbers");
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();
        double avg = (a + b + d) / 3.0;
        System.out.println("Average = " + avg);

        System.out.println("\nQuestion 2: Type Conversion (Double to Int)");
        System.out.print("Enter a decimal number: ");
        double decimal = sc.nextDouble();
        int converted = (int) decimal;
        System.out.println("After Conversion = " + converted);

        System.out.println("\nQuestion 3: Expression Evaluation");
        int result = 20 + 10 * 2 - 5;
        System.out.println("20 + 10 * 2 - 5 = " + result);



        System.out.println("\n========== LEVEL 3 ==========");

        System.out.println("\nQuestion 1: Total Salary Calculation");
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        double hra = basic * 0.20;
        double da = basic * 0.10;
        double totalSalary = basic + hra + da;
        System.out.println("Total Salary = " + totalSalary);

        System.out.println("\nQuestion 2: Area of Triangle");
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area = " + area);

        sc.close();
    }
}