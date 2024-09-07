import java.util.Scanner;

public class W5Q3 {
    public static void traverse(int[] arr) {
        for(int e: arr) {
            System.out.print(e + "\t");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int size = arr.length;

        for(int i=0 ; i<size ; i+=1) {
            System.out.printf("Enter element %d: ",i+1);
            arr[i] = sc.nextInt();
        }

        System.out.println("\nOriginal array ->");
        traverse(arr);

        int temp = arr[0];
        arr[0] = arr[size-1];
        arr[size-1] = temp;

        System.out.println("\n\nNew array ->");
        traverse(arr);

        sc.close();
    }
}