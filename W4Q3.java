public class W4Q3 {
    public static void main(String[] args) {
        int rows = 5;  // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            for(int j=rows-i ; j>0 ; j-=1) {
                System.out.print("  ");
            }
            for(int k=1 ; k<=i ; k+=1) {
                System.out.print(k + " ");
            }
            for(int m=i-1 ; m>0 ; m-=1) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

}
