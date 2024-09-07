import java.util.Scanner;

public class W3Q3 {
    public static void main(String[] args) {
        Scanner af = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = af.nextInt();

        System.out.println("\nMultiplication table of "+num+"->\n");
        for(int i=1 ; i<=10 ; i+=1) {
            System.out.printf("%d\tx\t%d\t=\t%d\n",num,i,num*i);
        }
        
        af.close();
    }
}
