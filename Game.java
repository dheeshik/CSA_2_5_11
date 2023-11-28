import java.util.Scanner;

public class Game {
  public Game() {
    System.out.println();
  }

  public void play() {
    while (true) {
      System.out.println("Player 1 start: ");
      Scanner sc = new Scanner(System.in); // Create a Scanner object

      int userInput = sc.nextInt(); // Read user input
      Board.pieces -= userInput;
      Board.displayBoard();
    }
  }
}
