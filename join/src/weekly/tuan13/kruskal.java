package weekly.tuan13;

import java.io.*;

import java.util.*;

import java.util.stream.*;

class Edge implements Comparable<Edge> {
    int u;
    int v;
    int weight;

    public Edge(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        if(this.weight < o.weight){
            return -1;
        }
        else if(this.weight == o.weight) return 0;
        else return 1;
        //Integer.compare(weight, o.weight);
    }
}

class Result {


    public static int[] root;

    public static int getparent(int x) {
        if (root[x] < 0) {
            return x;
        } else return getparent(root[x]);
    }

    public static int kruskals(int gNodes, List<Integer> gFrom, List<Integer> gTo, List<Integer> gWeight) {
        root = new int[gNodes + 1];
        for (int i = 0; i <= gNodes; i++) {
            
            root[i] = -1;
        }
        Queue<Edge> q = new PriorityQueue<>();
        for (int i = 0; i < gFrom.size(); i++) {
            q.add(new Edge(gFrom.get(i), gTo.get(i), gWeight.get(i)));
        }
        int sum = 0;
        int cnt = gNodes;
        while (cnt >= 2) {
            Edge e = q.poll();
            int x = getparent(e.u);
            int b = getparent(e.v);
            if (x != b) {
                if (root[x] >= root[b]) {
                    root[b] += root[x];
                    root[x] = b;

                } else {

                    root[x] += root[b];
                    root[b] = x;
                }
                cnt--;
                sum += e.weight;
            }
        }
        return sum;
    }


}

public class kruskal {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] gNodesEdges = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int gNodes = Integer.parseInt(gNodesEdges[0]);
        int gEdges = Integer.parseInt(gNodesEdges[1]);

        List<Integer> gFrom = new ArrayList<>();
        List<Integer> gTo = new ArrayList<>();
        List<Integer> gWeight = new ArrayList<>();

        IntStream.range(0, gEdges).forEach(i -> {
            try {
                String[] gFromToWeight = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                gFrom.add(Integer.parseInt(gFromToWeight[0]));
                gTo.add(Integer.parseInt(gFromToWeight[1]));
                gWeight.add(Integer.parseInt(gFromToWeight[2]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int res = Result.kruskals(gNodes, gFrom, gTo, gWeight);

        // Write your code here.
        bufferedWriter.write(String.valueOf(res));

        bufferedReader.close();
        bufferedWriter.close();
    }
}

