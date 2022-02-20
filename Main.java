import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int input = sc.nextInt();
    try {
      if (0 < input && input <= 5) {
        throw new SmallNumberException("Small Number");
      } else if (5 < input && input <= 10) {
        throw new Exception("Proper Number");
      } else if (input > 10) {
        throw new Exception("Greater Noida");
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println(fib(input));
    }
  }

  public static int fib(int input){
    if(input<2) return 1;
    return input*fib(input-1);
  }

}