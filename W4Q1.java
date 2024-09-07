import java.util.Scanner;

public class W4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[3];
        for(int i=0 ; i<3 ; i+=1) {
            System.out.printf("Enter element %d: ",i+1);
            arr[i] = sc.nextInt();
        }
        sc.close();
        traverse(arr);
    }
    static void traverse(int [] arr) {
        System.out.println("\n\nTraversing ->\n");
        for(int element: arr) {
            System.out.print(element + "\t");
        }
    }
}
