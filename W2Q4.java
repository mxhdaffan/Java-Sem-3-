import java.util.Scanner;

public class W2Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int i=1 ; i<=3 ; i+=1) {
            System.out.printf("Enter number %d: ",i);
            int num = sc.nextInt();
            sum+=num;
        }
        float avg = sum/3f;
        System.out.println("\nAverage = " + avg);
        sc.close();
    }
}
