import java.util.Scanner;

public class W3Q5 {
    public static void main(String[] args) {
        Scanner af = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = af.nextInt();

        for(int i=num, count=1 ; i>10 ; i/=2, count+=1) {
            System.out.printf("\nIteration %d = %d",count,i);
        }
        
        af.close();
    }
}
