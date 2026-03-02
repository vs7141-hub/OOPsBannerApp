public class level1 {
    public static void main(String[] args) {

        System.out.println("----- Question 1 -----");
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is " + age);


        System.out.println("\n----- Question 2 -----");
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        double average = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam’s average mark in PCM is " + average);


        System.out.println("\n----- Question 3 -----");
        double kilometers = 10.8;
        double miles = kilometers * 1.6;
        System.out.println("The distance " + kilometers + " km in miles is " + miles);


        System.out.println("\n----- Question 4 -----");
        double costPrice = 129;
        double sellingPrice = 191;
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
        System.out.println("The Cost Price is INR " + costPrice +
                " and Selling Price is INR " + sellingPrice +
                "\nThe Profit is INR " + profit +
                " and the Profit Percentage is " + profitPercentage + "%");
    }
}