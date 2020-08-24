package academy.learnprogramming;

public class Keywords {

  public static void main(String[] args) {
    // a mile is equal to 1.609344 kilometres
    double kilometres = (100 * 1.609344);
    int highScore = 50;


    if (highScore == 50) {
      System.out.println("This is an expression");

    }

    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;
    int score2 = 10000;
    int levelCompleted2 = 8;
    int bonus2 = 200;
    /*if (score < 5000 && score > 1000) {
      System.out.println("Your score was less than 5000 but greater than 1000");
    } else if (score<1000) {
      System.out.println("Your score was less than 1000");

    } else {
      System.out.println("Got here");
    }*/
    if (gameOver) {
      int finalScore = score + (levelCompleted *bonus);
      System.out.println("Your final score was " + finalScore );
    }
    if (gameOver){
      int finalScore = score2 + (levelCompleted2 * bonus2);
      System.out.println("Your final score was " + finalScore);
    }

  }

}
