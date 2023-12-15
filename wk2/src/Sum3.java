import edu.princeton.cs.algs4.*;
public class Sum3 {
    public static void main(String [] args){

        In in = new In("D:\\UET\\hk3\\DSA - Cau truc du lieu va giai thuat\\algs4-data\\2Kints.txt");
        int[] a = in.readAllInts();
        int cnt = 0;
        for(int i = 0; i < a.length;i++){
            for(int j = i+1; j< a.length;j++){
                for(int k= j+1; k< a.length;k++){
                    if(a[i] + a[j] + a[k] == 0){
                        cnt++;

                        System.out.println(a[i] + " "+ a[j] + " "+ a[k]);
                    }
                }
            }
        }
        System.out.println(cnt);

    }
}
