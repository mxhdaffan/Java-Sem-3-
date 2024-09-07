public class W5Q5 {
    public static void main(String[] args) {
        for(int num=2 ; num<100 ; num+=1) {     // 1 is neither prime nor composite
            boolean isPrime = true;
            for(int j=2 ; j<=Math.sqrt(num) ; j+=1) {
                if(num%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(num + "\t");
            }
        }
    }
}