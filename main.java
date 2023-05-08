import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean gameOver = false;
    boolean isBoardFull = false;
    int winner = 0;
    String[][] board = {{"-", "-", "-"},{"-", "-", "-"},{"-", "-", "-"}};
    
    int player = 1;
    while(!gameOver && !isBoardFull){
      for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[i].length; j++){
          System.out.print(board[i][j] + " ");
        }
        System.out.println();
      }

      System.out.println("Player " + player + ", choose a square by writing the row, then col between 0 and 2");
      int row = scan.nextInt();
      int col = scan.nextInt();

      if (board[row][col].equals("-")) {
        board[row][col] = player == 1 ? "X" : "O";
        player = player == 1 ? 2 : 1;
      } else {
        System.out.println("Square already taken, try again");
      }

      for (int i = 0; i < board.length; i++) {
          if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && !board[i][0].equals("-")) {
              gameOver = true;
              winner = player == 1 ? 2 : 1;
              break;
          }
      }
      
      for (int i = 0; i < board[0].length; i++) {
          if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && !board[0][i].equals("-")) {
              gameOver = true;
              winner = player == 1 ? 2 : 1;
              break;
          }
      }
      
      if ((board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals("-")) ||
              (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals("-"))) {
          gameOver = true;
          winner = player == 1 ? 2 : 1;
          break;
      }

      isBoardFull = true;
      for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[i].length; j++) {
            if (board[i][j].equals("-")) {
                isBoardFull = false;
                break;
            }
        }
        if (!isBoardFull) {
            break;
        }
      }
    }
    
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
    
    if(winner != 0){
      System.out.print("Player " + winner + " has won!");
    }
    else{
      System.out.print("Tie!");
    }
  }
}
