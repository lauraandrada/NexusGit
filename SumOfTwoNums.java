import java.util.Scanner;

/**
 * SumOfTwoNums
 */
public class SumOfTwoNums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 numbers: ");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
        scanner.close();
    }
}