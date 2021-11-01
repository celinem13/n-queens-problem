import java.util.*;
public class Board {
    public int n;
    public int[][] board;
    // 1 = queens
    // 0 = empty spot

     public Board(){
         int nSize = 8;
         int[][] nSizedBoard = new int[nSize][nSize];
         for (int i = 0; i < nSize; i++){
             for (int j = 0; j < nSize; j++){
                 nSizedBoard[i][j] = 0;
             }
         }
         board = nSizedBoard;
     }

    public Board(int givenN){
        int nSize = givenN;
        int[][] nSizedBoard = new int[nSize][nSize];
        for (int i = 0; i < nSize; i++){
            for (int j = 0; j < nSize; j++){
                nSizedBoard[i][j] = 0;
            }
        }
        board = nSizedBoard;
    }

    public void changeNum(int xCoord, int yCoord, int num){
         board[xCoord][yCoord] = num;
    }

    public int getN() {
        return n;
    }

    public void printBoard() {
        for (int i = 0; i < getN(); i++){
            for (int j = 0; j < getN(); j++){
                System.out.print(board[i][j] + "||");
            }
            System.out.println();
        }
    }

    public static Board randomBoard(int num){
         Random random = new Random();
         Board b = new Board(num);
         for (int i = 0; i < num; i++){
             b.changeNum(i, random.nextInt(num), 1);
         }
        return b;
    }
}
