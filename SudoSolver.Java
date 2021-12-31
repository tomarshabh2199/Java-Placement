import java.util.*;
import java.io.*;

class Sudo{

    public boolean isSafe(char[][] board, int row, int col, int number) {

        //column
        for(int i=0; i< board.length; i++){
            if(board[i][col]== (char)(number+'0')){
                return false;
            }
        }


        //row
        for(int j=0; j<board.length; j++){
            if(board[row][j]== (char)(number+'0')){
                return false;
            }
        }

        //grid
        int startrow=(row/3)*3;
        int startcol=(col/3)*3;

        for(int i= startrow; i<startrow+3; i++){
            for(int j=startcol; j< startcol+3; j++){
                if(board[i][j]== (char)(number+'0')){
                    return false;
                }
            }
        }
       return true;
    }

    public boolean helper(char[][] board, int row, int col){
        //base condition
        if(row==board.length){
            return true;
        }
        int nextrow=0;
        int nextcol=0;
        
        if(col==board.length-1){
            nextrow=row+1;
            nextcol=0;
        }

        else{
            nextrow=row;
            nextcol=col+1;
        }

        if(board[row][col] != '.'){
            if(helper(board, nextrow, nextcol)){
                return true;
            }
        }

        else{
            for(int i=1; i<=9; i++){
                if(isSafe(board, row, col, i)){
                    board[row][col]= (char)(i+'0');
                    if(helper(board, nextrow, nextcol)){
                        return true;
                    }
                    else{
                        board[row][col]='.';
                    }
                }
            }
        }
      return false;
    }

    public void SudoSolver(char [][] board)
    {
        helper(char[][] board, 0,0);
    }
}