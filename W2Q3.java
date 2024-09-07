import java.util.Scanner;

public class W2Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int cube = (int)Math.pow(num1, 3);
        System.out.println("\nCube = " + cube);
        sc.close();
    }
}
