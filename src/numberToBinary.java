import java.util.Scanner;

public class numberToBinary {

    // java method 
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

       
    //     // Taking input
    //     System.out.print("Enter a decimal number: ");
    //     int decimal = scanner.nextInt();
    //     scanner.close();
    //     // Convert to binary using Integer.toBinaryString
    //     String binary = Integer.toBinaryString(decimal);

    //     // Output the result
    //     System.out.println("Binary of the given number = " + binary);
    // }

    // manual methiod

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Edge case for 0
        if (decimal == 0) {
            System.out.println("Binary of the given number = 0");
            return;
        }

        String binary = "";

        // Loop for manual conversion
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary; // Append in reverse order
            decimal = decimal / 2;
        }

        // Output
        System.out.println("Binary of the given number = " + binary);
    }
}
