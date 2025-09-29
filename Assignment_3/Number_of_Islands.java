import java.util.Scanner;

public class Number_of_Islands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char grid[][] = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println(numIslands(grid));
    }
    public static int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void dfs(char[][] grid, int i, int j) {
        if (j < 0 || i < 0 || i > grid.length - 1 || j > grid[0].length - 1 || '0' - grid[i][j] == 0) {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}


// Time Complexity :- O(m × n)

// Space Complexity :- O(m × n) in worst case.