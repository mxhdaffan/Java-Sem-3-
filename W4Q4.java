import java.util.Scanner;
public class W4Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        double sum=0;
        for(double i=1 ; i<=num ; i+=1) {
            sum += 1/i;
        }
        System.out.printf("\nSum of series = %f",sum);

        sc.close();
    }
    
}
