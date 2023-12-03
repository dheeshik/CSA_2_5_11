import java.util.Scanner;

/**
 * Project 2.5.11
 *
 * GameRunner Class for the Game of Nim
 */
public class GameRunner {
  public static void main(String[] args) {
    System.out.println("Welcome to the Game of Nim!");

    Board.populate(); // static method call

    Board.displayBoard();
    Scanner sc = new Scanner(System.in);



    Game nim = new Game(sc);
    nim.firstPlayer = ((int)(Math.random()+0.5));
    System.out.print("Enter Player 1 Name: ");
    nim.names.add(sc.nextLine());
    System.out.print("Enter Player 2 Name: ");
    nim.names.add(sc.nextLine());
    nim.play();

  }
}
