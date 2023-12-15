import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;
import edu.princeton.cs.algs4.*;

public class UF2 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        In in = new In(args[0]);


        int components = N; // Số lượng thành phần liên thông ban đầu là N
        int cnt = 0;
        boolean fail = true;

        while (!StdIn.isEmpty()) {


            int p = StdIn.readInt();
            int q = StdIn.readInt();
            cnt++;

            if (!uf.connected(p, q)) {
                uf.union(p, q);
                components--;


                if (components == 1) {
                    StdOut.println(cnt);
                    fail = false;
                    return;
                }
            }

        }

       if(fail) StdOut.println("FAILED");
    }
}