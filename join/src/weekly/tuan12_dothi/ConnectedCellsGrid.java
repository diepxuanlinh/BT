package weekly.tuan12_dothi;


import java.util.*;


class Cell {
    public int r, c;

    public Cell(int i, int j) {
        r = i;
        c = j;
    }
}

public class ConnectedCellsGrid {

    static int[][] grid;
    static boolean[][] visited;
    static int N, M;
    static int[] nav = {-1, 0, 1};
    static int cnt = 0;
    static int[] dx = new int[] {-1, 0, 1};
    static int[] dy = new int[] {-1, 0, 1};
    static void DFS(int row, int col) {
        if(row < 0 || row >= N || col < 0 || col >= M ||visited[row][col] || grid[row][col] == 0 ) {
            return;
        }
        visited[row][col] = true;
        cnt++;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(dx[i] == 0 && dy[j] == 0) continue;
                DFS(row + dx[i], col + dy[j]);
            }
        }
    }
    static int count_connected(int row, int col) {
        cnt = 0;
        DFS(row, col);
        return cnt;
    }





    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        grid = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                grid[i][j] = scanner.nextInt();
                visited[i][j] = false;
            }
        }
        int max = 0;
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                if (grid[i][j] == 0 || visited[i][j]) continue;
                int cnt = count_connected(i, j);
                if (max < cnt) max = cnt;
            }
        }

        System.out.println(max);

    }
}