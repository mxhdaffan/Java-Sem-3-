import java.util.Scanner;
public class W4Q2 {

    static void EnterArray(int [] arr) {
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<arr.length ; i+=1) {
            System.out.printf("Enter element %d: ",i+1);
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    static void traverse(int [] arr) {
        System.out.println("\nTraversing the array ->");
        for(int element: arr) {
            System.out.print(element + "\t");
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[5];
        EnterArray(arr);
        traverse(arr);
        int sum=0;
        for(int element: arr) {
            sum += element;
        }
        System.out.println("\n\nSum of array elements = " + sum);
    }
    
}
