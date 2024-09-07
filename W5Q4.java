import java.util.Scanner;

public class W5Q4 {
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

        int max = arr[0];
        int min = arr[0];

        for(int e: arr) {
            if(e>max) {
                max = e;
            }
            if(e<min) {
                min = e;
            }
        }
        System.out.println("\n\nMax element: " + max);
        System.out.println("Min element: " + min);

        sc.close();
    }
}