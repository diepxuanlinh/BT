import edu.princeton.cs.algs4.In;

import java.util.Arrays;
import java.util.Scanner;

public class nhi_phan {
    static int index(int[] a, int number, int l, int r) {
        int mid = 0;
        Arrays.sort(a);
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (a[mid] == number) {
                return mid;

            } else if (a[mid] < number) {
                l = mid + 1;
            } else r = mid - 1;
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int index = index(a, num, 0, a.length);
        System.out.println(index);


    }
}
