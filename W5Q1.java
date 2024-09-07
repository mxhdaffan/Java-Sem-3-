public class W5Q1 {
    public static void main(String[] args) {
        for(int num=1 ; num<100 ; num+=2) {
            System.out.print(num + "\t");
        }

        System.out.println("\n\nAlternatively ->\n");
        for(int i=1 ; i<100 ; i+=1) {
            if(i%2 != 0) {
                System.out.print(i + "\t");
            }
        }
    }
}