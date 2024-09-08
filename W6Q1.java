import java.util.Scanner;
public class W6Q1 {
    static void traverse(int [] arr) {
        System.out.println("\nTraversing the array ->");
        for(int element: arr) {
            System.out.print(element + "\t");
        }
        System.out.println();
    }

    static boolean LinearSearch(int [] arr, int given) {
        for(int i: arr) {
            if(i==given) {
                return true;
            }
        }
        return false;
    }

    static boolean BinarySearch(int [] arr, int given) {
        int low = 0, high = arr.length-1;

        while(low <= high) {
            int mid = (low+high)/2;
            if(arr[mid]==given) {
                return true;
            }
            else if(arr[mid] < given) {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        System.out.println("\nEnter a sorted array ->");
        for(int i=0 ; i<arr.length ; i+=1) {
            System.out.printf("Enter element %d: ",i+1);
            arr[i] = sc.nextInt();
        }
        traverse(arr);

        
        System.out.printf("\nEnter an element to search: ");
        int given = sc.nextInt();

        if(BinarySearch(arr, given)) {
            System.out.println("\nYes this element is present in the array!");
        }
        else{
            System.out.println("\nNO! This element is not present in the array");
        }
        
        sc.close();
    }
    
}
