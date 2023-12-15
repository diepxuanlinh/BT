package vebo;

import java.util.*;

public class vebo4 {


    public static int get(int id, int[] st, int u, int v, int l, int r) {
        if (r < u || v < l) {
            return 0;
        }
        if (l <= u && v <= r) {
            return st[id];
        }
        int mid = (u + v) / 2;
        int p1 = get(2 * id + 1, st, u, mid, l, r);
        int p2 = get(2 * id + 2, st, mid + 1, v, l, r);
        return Math.max(p1, p2);
    }

    public static void update(List<Integer> arr, int[] ST, int id, int u, int v) {
        if (u == v) {
            ST[id] = arr.get(u);
        } else {
            int mid = (u + v) / 2;
            update(arr, ST, 2 * id + 1, u, mid);
            update(arr, ST, 2 * id + 2, mid + 1, v);
            ST[id] = Math.max(ST[2 * id + 1], ST[2 * id + 2]);
        }
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ST = new int[n * 4];
        List Arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            Arr.add(tmp);
        }

        update(Arr, ST, 0, 0, n - 1);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(get(0, ST, 0, n - 1, l - 1, r - 1));
        }
    }

}