import java.util.ArrayList;
import java.util.Scanner;

public class Game {

  public ArrayList<String> names = new ArrayList<String>();
  Scanner sc;

  public int firstPlayer;
  int currentPlayer;
  boolean validInput;

  public Game(Scanner sc) {
    this.sc = sc;
  }

  public void play() {
    currentPlayer = firstPlayer;
    while (true) {

      System.out.print(names.get(currentPlayer) + ": ");
      while (!validInput) {
        validInput = Board.removePieces(sc.nextInt());
      }
      Board.displayBoard();
      currentPlayer = Math.abs(firstPlayer-1);

      if (Board.pieces == 1){
        System.out.println(names.get(currentPlayer) + " won!!") ;
        break;
      }
      validInput = false;
    }
    sc.close();
  }

}
