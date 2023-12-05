import java.util.ArrayList;
import java.util.Scanner;


public class Game {
  // custom output color for computer answers
  static final String ANSI_RESET = "\u001B[0m";
  static final String ANSI_RED = "\u001B[31m";
  static final String ANSI_GREEN = "\u001B[32m";
  static final String ANSI_YELLOW = "\u001B[33m";
  static final String ANSI_PURPLE = "\u001B[35m\t";


  public ArrayList<String> names = new ArrayList<>();
  private Scanner sc;

  public int firstPlayer; // randomly selected first player
  int currentPlayer;
  boolean validInput; // if last input was valid or not

  int computerMove;

  public Game(Scanner sc) {
    this.sc = sc;
  }

  public int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
  }

  public void twoPlayerGame() {
    currentPlayer = firstPlayer;
    while (true) {

      System.out.print(names.get(currentPlayer) + ": ");
      input();
      Board.displayBoard();
      if (Board.pieces == 1){
        System.out.println(ANSI_GREEN + names.get(0) + " won!!" + ANSI_RESET);
        break;
      }



      validInput = false;
      currentPlayer = Math.abs(currentPlayer-1);
    }
    sc.close();
  }

  public void playAgainstComputer() {
    currentPlayer = 0;
    while (true) {

      System.out.print(names.get(currentPlayer) + ": ");
      input();
      Board.displayBoard();

      if (Board.pieces == 1){
        System.out.println(ANSI_GREEN + names.get(0) + " won!!" + ANSI_RESET);
        break;
      }
      currentPlayer = Math.abs(currentPlayer-1);

      System.out.print(names.get(1));
      computerMove = getRandomNumber(1, (int)(Board.pieces / 2));
      System.out.println(ANSI_RED + computerMove + ANSI_RESET);
      Board.removePieces(Integer.toString(computerMove));
      Board.displayBoard();

      if (Board.pieces == 1){
        System.out.println(ANSI_RED + "The computer won!!" + ANSI_RESET);
        break;
      }
      currentPlayer = Math.abs(currentPlayer-1);


      validInput = false;

    }
    sc.close();
  }

  public void input(){
    while (!validInput) {
      validInput = Board.removePieces(sc.nextLine());
    }
  }


}
