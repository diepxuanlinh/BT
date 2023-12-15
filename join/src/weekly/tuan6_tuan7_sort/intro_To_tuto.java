package weekly.tuan6_tuan7_sort;

import java.util.Scanner;

public class intro_To_tuto {


    public static int introTutorial(int V, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (V == arr[i]) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        System.out.println(introTutorial(v, ar));


    }
}


