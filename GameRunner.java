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


    System.out.println("Do you want to play multiplayer or against a computer?: m - multiplayer / c - computer");
    String input = sc.nextLine();

    // mode select
    if (input.equals("m")){
      Game nim = new Game(sc);
      nim.firstPlayer = ((int)(Math.random()+0.5));
      System.out.print("Enter Player 1 Name: ");
      nim.names.add(sc.nextLine());
      System.out.print("Enter Player 2 Name: ");
      nim.names.add(sc.nextLine());
      nim.twoPlayerGame();
    }
    else if(input.equals("c")){
      Game nim = new Game(sc);
      System.out.print("Enter Player Name: ");
      nim.names.add(sc.nextLine());
      nim.names.add("Computer Played: ");
      nim.playAgainstComputer();
    }

  }
}
