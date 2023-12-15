package weekly.tuan13;

import java.io.*;
import java.util.*;

class Pair implements Comparable<Pair> {
    int node;
    int value;

    public Pair(int n, int v) {
        node = n;
        value = v;
    }

    public int compareTo(Pair b) {
        if (value < b.value) {
            return -1;
        } else if (value == b.value) {
            return 0;
        } else return 1;

    }
}

public class prim {
    public static PriorityQueue<Pair> q = new PriorityQueue<Pair>();
    public static ArrayList<ArrayList<Pair>> adj = new ArrayList<ArrayList<Pair>>();
    static boolean[] visited;
    static int weight = 0;

    public static int prims(int S) {
        weight = 0;
        q.add(new Pair(S, 0));
        while (q.size() > 0) {
            Pair current = q.poll();
            if (!visited[current.node]) {
                for (int i = 0; i < adj.get(current.node).size(); i++) {
                    Pair tmp = adj.get(current.node).get(i);
                    if (!visited[tmp.node]) {
                        q.add(tmp);
                    }
                }
                weight += current.value;
                visited[current.node] = true;
            }
        }
        return weight;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M, S;
        N = sc.nextInt();
        M = sc.nextInt();
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<Pair>());
        }
        for (int i = 0; i < M; i++) {
            int x, y, r;
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
            r = sc.nextInt();
            adj.get(x).add(new Pair(y, r));
            adj.get(y).add(new Pair(x, r));
        }
        S = sc.nextInt() - 1;
        int res = prims(S);
        System.out.println(res);
    }
}

