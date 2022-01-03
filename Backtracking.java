import java.util.*;
import java.io.*;

class Backtracking{

    // 1.Print all permutations of a string

    public static void printPermutation(String str, String perm, int idx){
    
        // Base case
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }

        for(int i=0; i < str.length(); i++){
            char currChar = str.charAt(i);
            char newString = str.substring(0,i) + str.substring(i+1);
            printPermutation(newString, perm+currChar, idx+1);
        }
    }

    // 2. N queen problem
    // 4*4 board

        public boolean isSafe(int row, int col, char[][] board){

            //horizontally check
            for(int j=0; j<board.length; j++){
                if(board[row][j] == 'Q'){
                    return false;
                }
            }
            //vertically check
            for(int i=0; i<board.length; i++){
                if(board[i][col] == 'Q'){
                    return false;
                }
            }
            //upper left corner
            int r= row;
            for(int c= col; c>=0 && r>=0; c--; r--){
                if(board[r][c] == 'Q'){
                    return false;
                }
            }
            //upper right corner
            r= row;
            for(int c= col; c<board.length && r>=0; c++, r--){
                if(board[r][c] == 'Q'){
                    return false;
                }
            }

            //lower left corner
            r= row;
            for(int c= col; c>=0 && r<board.length; c--, r++){
                if(board[r][c] == 'Q'){
                    return false;
                }
            }

            //lower right corner
            r= row;
            for(int c= col; c<board.length && r<board.length; c++, r++){
                if(board[r][c] == 'Q'){
                    return false;
                }
            }
            return true;
        }

        public void saveBoard(char[][] board, List<List<String>> allBoards){
            String row ="";
            List<String> newBoard = new ArrayList<>();

            for(int i=0; i<board.length; i++){
                row=""; 
                for(int j=0; j<board[0].length; j++){
                    if(board[i][j]==' Q')
                        row += 'Q';
                    else
                        row += '.';
                }
                newBoard.add(row);
            }
            allBoards.add(newBoard);
        }

        public void helper(char[][] board, List<List<String>> allBoards, int col){

            //Base case 
            if(col == board.length){
                saveBoard(board, allBoards);
                return;
            }

            for(int row=0; row < board.length; row++){
                if(isSafe(row,col,board)){
                    board[row][col]='Q';
                    helper(board, allBoards, col+1);
                    board[row][col]='.';
                }
            }
        }

        public List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args){
        String str = "ABC";
        printPermutation(str, "", 0);

    }
}