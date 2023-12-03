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
    System.out.print(pieces + " --- ");
    for (int i = 0; i < pieces; i++) {
      System.out.print("| ");
    }
    System.out.println();
  }

  public static boolean removePieces(int n) {
    if ((n <= (pieces / 2)) && n > 0) {
      pieces -= n;
      return true;

    } else {
      System.out.println("Invalid Input");
      return false;
    }
  }

}
