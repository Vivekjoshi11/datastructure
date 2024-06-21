import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        System.out.println("hello");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = a+10;
        System.out.println(sum);
    }
}
