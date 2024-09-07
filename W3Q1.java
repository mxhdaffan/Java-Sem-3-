import java.util.Scanner;

public class W3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num%2==0) {
            System.out.println("\nThe number is even");
        }
        else{
            System.out.println("\nThe number is odd");
        }
        sc.close();
    }
}
