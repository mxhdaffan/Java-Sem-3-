import java.util.Scanner;

public class W6Q4 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    int size = str.length();
    System.out.printf("\nOriginal string: %s",str);

    char [] chararr = str.toCharArray();        // Converting the string to a character array
    for(int i=0 ; i<(size/2) ; i+=1) {      // Reversing the array
        char temp = chararr[i];
        chararr[i] = chararr[size-i-1];
        chararr[size-i-1] = temp;
    }
    str = new String(chararr);      // Converting the array back to the string

    System.out.printf("\nNew string: %s",str);
    sc.close();
}   
}