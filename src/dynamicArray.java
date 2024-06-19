import java.util.*;
import java.util.Scanner;
public class dynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Moved outside the loop

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt(); // Using sc inside the loop
        }
        System.out.println(n);

        // Here you can use sc for other inputs if needed (assuming this is the intention)
        // ... your code using sc ...

        sc.close(); // Close the scanner when you're done using it (good practice)
    }
}
