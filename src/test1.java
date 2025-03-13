import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
      System.out.println("Hi Vivek here");
      //numbers total 1 to 15 select number 2 as fizz number 3 as buzz which number is divisable by fizz and buzz 


      int n = 15;
      for (int i = 1; i <= n; i++) {
        if(i%2 == 0 && i%3!= 0){
            System.out.println("FIZZ");
        }
        else if (i%2 ==0 && i%3 ==0){
            System.out.println("FIZZBUZZ");
        }
        else if(i%3 == 0 && i%2!= 0){
            System.out.println("BUZZ");
        }
        else{
            System.out.println(i);
        }
      }
    }
}
