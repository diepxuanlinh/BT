package weekly.tuan13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Pairdij implements Comparable<Pairdij> {
    public int x;
    public int c;

    Pairdij(int x, int c) {
        this.x = x;
        this.c = c;
    }

    public int compareTo(Pairdij o) {
        if (this.c < o.c) {
            return -1;
        } else if (this.c == o.c) {
            return 0;
        } else return 1;
    }

}

public class dijkstra {
    static ArrayList<HashMap<Integer, Integer>> adj;
    static int[] shortd;

    public static void dijkstra(int s) {
        shortd = new int[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            shortd[i] = Integer.MAX_VALUE;
        }
        shortd[s] = 0;
        boolean[] markvisit = new boolean[adj.size()];
        PriorityQueue<Pairdij> queue = new PriorityQueue<>();
        queue.add(new Pairdij(s, 0));
        while (!queue.isEmpty()) {
            Pairdij curr = queue.poll();
            if (!markvisit[curr.x]) {
                markvisit[curr.x] = true;
                Iterator<Map.Entry<Integer, Integer>> entries = adj.get(curr.x).entrySet().iterator();
                while (entries.hasNext()) {
                    Map.Entry<Integer, Integer> entry = entries.next();
                    if (curr.c + entry.getValue() < shortd[entry.getKey()]) {
                        shortd[entry.getKey()] = curr.c + entry.getValue();
                    }
                    if (!markvisit[entry.getKey()]) {
                        Pairdij pair = new Pairdij(entry.getKey(), shortd[entry.getKey()]);
                        queue.add(pair);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(in.readLine());
            for (int i = 0; i < t; i++) {
                String[] stmp = in.readLine().split(" ");
                int n = Integer.parseInt(stmp[0]);
                int m = Integer.parseInt(stmp[1]);

                adj = new ArrayList<HashMap<Integer, Integer>>();
                for (int j = 0; j < n; j++) {
                    adj.add(new HashMap<>());
                }

                for (int j = 0; j < m; j++) {
                    stmp = in.readLine().split(" ");
                    int x = Integer.parseInt(stmp[0]);
                    int y = Integer.parseInt(stmp[1]);
                    int r = Integer.parseInt(stmp[2]);
                    x--;
                    y--;

                    if (!adj.get(x).containsKey(y) || adj.get(x).get(y) > r) {
                        adj.get(x).put(y, r);
                    }
                    if (!adj.get(y).containsKey(x) || adj.get(y).get(x) > r) {
                        adj.get(y).put(x, r);
                    }
                }

                int s = Integer.parseInt(in.readLine());
                s--;
                dijkstra(s);
                StringBuilder out = new StringBuilder("");
                for (int j = 0; j < n; j++) {
                    if (s != j) {
                        if (shortd[j] == Integer.MAX_VALUE) {
                            out.append("-1 ");
                        } else {
                            out.append(shortd[j]);
                            out.append(" ");
                        }
                    }
                }
                out.append("\n");
                System.out.print(out.toString());
            }
        } catch (Exception e) {
        }
    }
}




