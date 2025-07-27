import java.util.Scanner;

public class ReverseString {
    // manual reverse string method
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Enter a string: ");
    //     String input = scanner.nextLine();

    //     String reversed = "";

    //     // Loop from end to start
    //     for (int i = input.length() - 1; i >= 0; i--) {
    //         reversed += input.charAt(i);  // Concatenate characters in reverse
    //     }

    //     System.out.println("Reversed string = " + reversed);
    // }

    // method by java reverse string

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Use StringBuilder for easy reverse
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
      System.out.println(sb);
        System.out.println("Reversed string = " + sb.toString());
    }
}
