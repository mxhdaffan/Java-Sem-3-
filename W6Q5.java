import java.util.Scanner;

public class W6Q5 {

static String ReverseString(String str) {
    int size = str.length();
    char [] chararr = str.toCharArray();        // Converting the string to a character array

    for(int i=0 ; i<(size/2) ; i+=1) {      // Reversing the array
        char temp = chararr[i];
        chararr[i] = chararr[size-i-1];
        chararr[size-i-1] = temp;
    }
    return new String(chararr);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String user = sc.nextLine();
    
    String rev = ReverseString(user);
    if(user.equals(rev)) {
        System.out.println("Yes this string is a palindrome!");
    }
    else{
        System.out.println("NO! This string is not a palindrome");
    }
    sc.close();
}   
}