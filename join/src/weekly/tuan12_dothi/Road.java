package weekly.tuan12_dothi;


import java.util.*;


public class Road {

    private static int count;

    private static long roadsAndLibraries(int x, int y, List<List<Integer>> cities, boolean[] visited) {
        long cost = 0;
        for (int i = 0; i < cities.size(); i++) {
            if (!visited[i]) {
                count = 0;
                dfs(i, cities, visited);
                if (x > y) {
                    cost += x + y * (count - 1);
                } else {
                    cost += x * count;
                }
            }
        }

        return cost;
    }

    private static void dfs(int i, List<List<Integer>> adj, boolean[] visited) {
        visited[i] = true;
        count++;
        List<Integer> list = adj.get(i);
        for (int j = 0; j < list.size(); j++) {
            if (!visited[list.get(j)]) {
                dfs(list.get(j), adj, visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int n = in.nextInt();
            List<List<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
            }
            boolean[] visited = new boolean[n];
            int m = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            for (int a1 = 0; a1 < m; a1++) {
                int city_1 = in.nextInt();
                int city_2 = in.nextInt();
                adj.get(city_1 - 1).add(city_2 - 1);
                adj.get(city_2 - 1).add(city_1 - 1);
            }
            System.out.println(roadsAndLibraries(x, y, adj, visited));
        }
        in.close();
    }
}