package academy.learnprogramming;

public class MethodChallenge {

  public static void main(String[] args) {

    int position= calculateHighScorePosition(1500);
    displayHighScorePosition("Andrei", position);

    position= calculateHighScorePosition(900);
    displayHighScorePosition("Marcus", position);

    position= calculateHighScorePosition(400);
    displayHighScorePosition("Michael", position);

    position= calculateHighScorePosition(50);
    displayHighScorePosition("Marty", position);

    position= calculateHighScorePosition(1000);
    displayHighScorePosition("Matt", position);

    position= calculateHighScorePosition(500);
    displayHighScorePosition("Carol", position);

    position= calculateHighScorePosition(100);
    displayHighScorePosition("Nick", position);

  }


  public static void displayHighScorePosition(String playerName, int position){
    System.out.println(playerName + " manged to get into position "
        + position + " on the high score table");

  }
  public static int calculateHighScorePosition (int score) {
    /*if (score >= 1000) {
      return 1;
    } else if (score >= 500) {
      return 2;
    }else if (score >= 100){
      return 3;
    } else {
      return 4;
    }*/
    int position = 4; //assuming position 4 will be returned

    if (score >= 1000){
      position = 1;
    } else if (score >= 500) {
      position = 2;
    } else if (score >= 100) {
      position = 3;
    }
    return position;

  }

}
