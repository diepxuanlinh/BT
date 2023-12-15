import java.util.Arrays;
import java.util.Scanner;

public class Sherlock_and_Array {



    static boolean check(int[] a, int n) {
        int sum = 0;
        int lsum = 0;
        int rsum = 0;
        for (int i = 0 ;i < a.length; i++) {
            rsum += a[i];
            }
        if(rsum-a[0] == 0)
            return true;
        rsum = rsum-a[0];
        for (int i = 1 ;i < a.length; i++) {
            lsum +=a[i-1];
            rsum -=a[i];
            if(lsum == rsum) return true;
        }


        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        while (cnt > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            if (check(a,n)) System.out.println("YES");
            else System.out.println("NO");
            cnt--;

        }

    }
}
