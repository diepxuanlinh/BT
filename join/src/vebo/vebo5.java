package vebo;

import java.util.Scanner;

class SegmentTree {
    int[] arr;
    int[] tree;

    public SegmentTree(int[] arr) {
        this.arr = arr;
        this.tree = new int[4 * arr.length];
        build(1, 0, arr.length - 1);
    }

    private void build(int node, int start, int end) {
        if (start == end) {
            tree[node] = arr[start];
        } else {
            int mid = (start + end) / 2;
            build(2 * node, start, mid);
            build(2 * node + 1, mid + 1, end);
            tree[node] = Math.min(tree[2 * node], tree[2 * node + 1]);
        }
    }

    public void update(int node, int start, int end, int idx, int val) {
        if (start == end) {
            arr[idx] = val;
            tree[node] = val;
        } else {
            int mid = (start + end) / 2;
            if (start <= idx && idx <= mid) {
                update(2 * node, start, mid, idx, val);
            } else {
                update(2 * node + 1, mid + 1, end, idx, val);
            }
            tree[node] = Math.min(tree[2 * node], tree[2 * node + 1]);
        }
    }

    public int query(int node, int start, int end, int l, int r) {
        if (r < start || end < l) {
            return Integer.MAX_VALUE;
        }
        if (l <= start && end <= r) {
            return tree[node];
        }
        int mid = (start + end) / 2;
        int left = query(2 * node, start, mid, l, r);
        int right = query(2 * node + 1, mid + 1, end, l, r);
        return Math.min(left, right);
    }
}

public class vebo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        SegmentTree segTree = new SegmentTree(arr);


        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int queryType = scanner.nextInt();
            if (queryType == 1) {

                int l = scanner.nextInt() - 1;
                int r = scanner.nextInt() - 1;
                int result = segTree.query(1, 0, n - 1, l, r);
                System.out.println(result);
            } else if (queryType == 2) {

                int id = scanner.nextInt() - 1;
                int v = scanner.nextInt();
                segTree.update(1, 0, n - 1, id, v);
            }
        }

        scanner.close();
    }
}