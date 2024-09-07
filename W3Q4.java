import java.util.Scanner;

public class W3Q4 {
    public static void main(String[] args) {
        Scanner af = new Scanner(System.in);
        System.out.print("Enter number of terms (N): ");
        int n = af.nextInt();

        int sum = 0;
        for(int i=1 ; i<=n ; i+=1) {
            sum+=i;
        }
        System.out.println("\nSum of first "+n+" natural numbers = " + sum);
        af.close();
    }
}
