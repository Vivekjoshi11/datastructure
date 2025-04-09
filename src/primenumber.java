import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        boolean isprime = true;

        // normal method
        // if(n<=1){
        //     System.out.println(n+" is not a prime number");
        //     isprime = false;
        // }
        // else {
        //     for (int i = 2; i < n; i++) {
        //         if(n%i ==0){
        //             isprime = false;
        //             break;
        //         }
        //     }
        // }

        // if(isprime){
        //     System.out.println("number is prime"+n);
        // }
        // else{
        //     System.out.println("number is not prime"+n);
        // }

        // optimized method

        if (n <= 1) {
            isprime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }

        System.out.println(isprime ? "Prime" : "Not Prime");
        
    }
}
