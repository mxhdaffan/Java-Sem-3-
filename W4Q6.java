import java.util.Scanner;
public class W4Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int fact=1;
        for(int i=num ; i>=1 ; i-=1) {
            fact *= i;
        }
        System.out.printf("\nFactorial of %d = %d",num,fact);

        sc.close();
    }
    
}
