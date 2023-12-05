/**
 * Project 2.5.11
 * GameRunner Class for the Game of Nim
 * Created by: Dheeshik Ramachandran and Sidhant Mathur
 */
import java.util.Scanner; // for user input


public class GameRunner {
  public static void main(String[] args) {
    System.out.println("Welcome to the Game of Nim!");

    Board.populate(); // static method call to instantiate board with random amount of pieces

    Board.displayBoard();
    Scanner sc = new Scanner(System.in); // global scanner instance for user input


    System.out.println(Game.ANSI_PURPLE);
    System.out.println("Do you want to play multiplayer or against a computer?:\nm - multiplayer / c - computer" + Game.ANSI_RESET);
    String mode = sc.nextLine();

    // mode select
    if (mode.equals("m")){
      Game nim = new Game(sc);
      nim.firstPlayer = ((int)(Math.random()+0.5));
      System.out.print("Enter Player 1 Name: ");
      nim.names.add(sc.nextLine());
      System.out.print("Enter Player 2 Name: ");
      nim.names.add(sc.nextLine());
      nim.twoPlayerGame();
    }
    else if(mode.equals("c")){
      Game nim = new Game(sc);
      System.out.print("Enter Player Name: ");
      nim.names.add(sc.nextLine());
      nim.names.add("Computer Played: ");
      nim.playAgainstComputer();
    }

  }
}
