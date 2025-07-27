public class PalindromeString {
    // public static void main(String[] args) {
    //     String str = "madam";
    //     String reversed = new StringBuilder(str).reverse().toString();

    //     if (str.equals(reversed)) {
    //         System.out.println(str + " is a palindrome.");
    //     } else {
    //         System.out.println(str + " is not a palindrome.");
    //     }
    // }

    public static void main(String[] args){
        String s = "madam";
        int left = 0, right = s.length() - 1;
        while (left < right) {
            System.out.println("Comparing " + s.charAt(left) + " and " + s.charAt(right));
            if (s.charAt(left++) != s.charAt(right--)){

                System.out.println(s + " is not a palindrome.");
                return;
            }
        }
        System.out.println(s + " is a palindrome.");
    }
}
