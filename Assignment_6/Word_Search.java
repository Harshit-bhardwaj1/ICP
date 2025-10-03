import java.util.Scanner;

public class Word_Search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char board[][] = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }
        String word = sc.next();
        System.out.println(Exist(board, word));
    }
    public static boolean Exist(char[][] board, String word){
        int n= board.length;
        int m= board[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(check(board, word, i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean check(char[][] board, String word, int i, int j, int idx){
        if(idx==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(idx)){
            return false;
        }

        char temp= board[i][j];
        board[i][j]='#';

        boolean found = check(board, word, i + 1, j, idx + 1)
                     || check(board, word, i - 1, j, idx + 1)
                     || check(board, word, i, j + 1, idx + 1)
                     || check(board, word, i, j - 1, idx + 1);
        
        board[i][j]=temp;
        return found;
    }
}


// TC :- O(n⋅m⋅4^L) (or tighter bound O(n * m * 3^L))

// Space Complexity: O(L)