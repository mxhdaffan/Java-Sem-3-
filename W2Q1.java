import java.util.Scanner;

public class W2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.printf("\nSum = %d",num1+num2);
        sc.close();
    }
}
