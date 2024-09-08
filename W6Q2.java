import java.util.Scanner;
public class W6Q2 {
    static void traverse(int [] arr) {
        for(int element: arr) {
            System.out.print(element + "\t");
        }
        System.out.println();
    }

    static void SelectionSort(int [] arr) {
        int size=arr.length;
        for(int pass=1 ; pass<=size-1 ; pass+=1) {
            int loc_min = pass-1;
            for(int j=pass ; j<size ; j+=1) {
                if(arr[j] < arr[loc_min]) {
                    loc_min = j;
                }
            }
            if(loc_min != pass-1) {
                int temp = arr[pass-1];
                arr[pass-1] = arr[loc_min];
                arr[loc_min] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[6];
        System.out.println("Enter an array ->");
        for(int i=0 ; i<arr.length ; i+=1) {
            System.out.printf("Enter element %d: ",i+1);
            arr[i] = sc.nextInt();
        }

        System.out.println("\nOriginal array ->");
        traverse(arr);
        System.out.println("\nArray after sorting ->");
        SelectionSort(arr);
        traverse(arr);

        sc.close();
    }
    
}
