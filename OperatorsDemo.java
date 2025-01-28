public class OperatorsDemo {
    // Create a simple calculator
    public static void main(String[] args) {
        // Enter two numbers
        int num1 = 10, num2 = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));
        // The modulus operator returns the remainder of the division of num1 by num2
        System.out.println("\nRelational Operators:");
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));
        System.out.println("num1 <= num2: " + (num1 <= num2));
        // The relational operators return a boolean value
        boolean condition1 = true, condition2 = false;
        System.out.println("\nLogical Operators:");
        System.out.println("condition1 AND condition2: " + (condition1 && condition2));
        System.out.println("condition1 OR condition2: " + (condition1 || condition2));
        System.out.println("NOT condition1: " + (!condition1));
        // Give the logical operators a try
        System.out.println("\nCombining operators:");
        System.out.println("(num1 > num2) AND (condition1): " + ((num1 > num2) && condition1));
        System.out.println("(num1 < num2) OR (condition2): " + ((num1 < num2) || condition2));
    }
}

