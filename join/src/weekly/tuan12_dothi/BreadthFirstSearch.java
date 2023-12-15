package weekly.tuan12_dothi;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreadthFirstSearch {

    static int[] findShortestReach(ArrayList<ArrayList<Integer>> graph, int start) {
        int[] costs = new int[graph.size()];
        boolean[] visit = new boolean[graph.size()];
        int UNIT_COST = 6;
        for (int i = 0; i < costs.length; ++i) {
            costs[i] = -1;
            visit[i] = false;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visit[start] = true;
        costs[start] = 0;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int i = 0; i < graph.get(curr).size(); i++) {
                if (!visit[graph.get(curr).get(i)]) {
                    queue.add(graph.get(curr).get(i));
                    costs[graph.get(curr).get(i)] = costs[curr] + UNIT_COST ;
                    visit[graph.get(curr).get(i)] = true;
                }
            }
        }


        return costs;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        for (int q = 0; q < Q; ++q) {
            int N, M, start;
            N = scanner.nextInt();
            M = scanner.nextInt();
            ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i <= N; ++i) {
                graph.add(new ArrayList<Integer>());
            }
            for (int i = 0; i < M; ++i) {
                int n1, n2;
                n1 = scanner.nextInt();
                n2 = scanner.nextInt();
                graph.get(n1).add(n2);
                graph.get(n2).add(n1);
            }
            start = scanner.nextInt();
            /*
            for (int i = 0; i < N; ++i) {
                Collections.sort(graph.get(i));
            }
            for (int i = 1; i <= N; ++i) {
                System.out.println("Node: " + i);
                System.out.println(graph.get(i).toString());
            }
            System.out.println("Start: " + start);
            */
            int[] costs = findShortestReach(graph, start);
            for (int i = 1; i < costs.length; ++i) {
                if (i == start) continue;
                System.out.print(costs[i] + " ");
            }
            System.out.println();
        }
    }
}

