package academy.learnprogramming;

public class OperatorsChallenge {

  public static void main(String[] args) {

    double a = 20.00d;
    double b = 80.00d;
    double c = (a + b) * 100.00d; // (20 + 80) * 100 = 10000
    System.out.println("(a + b) * 100.00 = " + c);

    double d = c % 40.00d; //
    System.out.println("The remainder is " + d);

    boolean result = (d == 0) ? true : false;
    System.out.println("The result is " + result);

    if (!result) {
      System.out.println("Got some remainder");
    }

  }
}
