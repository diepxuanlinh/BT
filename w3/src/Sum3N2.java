
import edu.princeton.cs.algs4.*;
import java.util.Arrays;

public class Sum3N2 {
    public static void main(String[] args) {

        In in = new In("D:\\UET\\hk3\\DSA - Cau truc du lieu va giai thuat\\algs4-data\\2Kints.txt");
        int[] a = in.readAllInts();
        Arrays.sort(a,0,a.length);

        int cnt = 0;
        for (int i = 0; i < a.length - 2; i++) {
            int j = i + 1;
            for (int k = a.length - 1; k > i + 1; k--) {
                while (j < k) {
                    if (a[i] + a[j] + a[k] == 0) {
                        cnt++;
                        j++;
                        k--;
                    } else if (a[i] + a[j] + a[k] < 0) j++;
                    else break;

                }
            }
        }
        System.out.println(cnt);


    }
}
