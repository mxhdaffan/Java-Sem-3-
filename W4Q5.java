import java.util.Scanner;
public class W4Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int sum=0;
        for(int i=num ; i>0 ; i/=10) {
            int d = i%10;
            sum += d;
        }
        System.out.printf("\nSum of digits = %d",sum);

        sc.close();
    }
    
}
