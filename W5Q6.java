import java.util.Scanner;

public class W5Q6 {
    public static void traverse(int[] arr) {
        for(int e: arr) {
            System.out.print(e + "\t");
        }
    }

    public static boolean LinearSearch(int[] arr, int src) {
        for(int el: arr) {
            if(el==src) {
                return true;
            }
        }
        return false;
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

        System.out.print("\n\nEnter an element to search: ");
        int num = sc.nextInt();
        
        if(LinearSearch(arr, num)) {
            System.out.println("This number lies in the array");
        }
        else{
            System.out.println("This number does NOT lie in the array!");
        }

        sc.close();
    }
}