import java.lang.Math;

public class Board {
  static int pieces;

  public static void populate() {
    int min = 10;
    int max = 50;
    pieces = (int) (Math.random() * (max - min + 1)) + min;
    System.out.println("Board setup with " + pieces + " pieces.");
  }

  public static void displayBoard() {

    for (int i = 0; i < pieces; i++) {
      System.out.print(" | ");
    }
    System.out.println("");
  }
}
