import java.util.Scanner;

public class W5Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        for(int j=2 ; j<=Math.sqrt(num) ; j+=1) {
            if(num%j==0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.print("\nThis is a prime number");
        }
        else{
            System.out.println("\nComposite number");
        }
        sc.close();
    }
}