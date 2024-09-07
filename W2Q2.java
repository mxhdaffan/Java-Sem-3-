import java.util.Scanner;

public class W2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();
        System.out.println("\nProduct = " + (num1*num2));
        sc.close();
    }
}
