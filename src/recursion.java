public class recursion {

    // recursion  meaningg that when function calls it self
    // usefull for other algorithms
    public static void main(String[] args) {
        walk(5);
        factorial(5);
    }
    private static int factorial(int i) {
    if(i < 1) return 1;
    System.out.println(i);
    return i * factorial(i - 1);

    }
    private static void walk(int steps){
          if(steps < 1){
            return;
          }
          System.out.println("you take a step" + steps);
          walk(steps - 1);
    }
}
