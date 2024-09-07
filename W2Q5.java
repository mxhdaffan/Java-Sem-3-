import java.util.Scanner;
import java.lang.Math;

public class W2Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1,y1,x2,y2;
        System.out.println("Enter coordinate 1 ->");
        System.out.print("X1: ");
        x1 = sc.nextInt();
        System.out.print("Y1: ");
        y1 = sc.nextInt();

        System.out.println("\nEnter coordinate 2 ->");
        System.out.print("X2: ");
        x2 = sc.nextInt();
        System.out.print("Y2: ");
        y2 = sc.nextInt();

        double d = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
        double result = Math.sqrt(d);
        System.out.printf("\nDistance between (%d, %d) and (%d, %d) = %f",x1,y1,x2,y2,result);
        sc.close();
    }
}
