import java.util.Arrays;
import java.util.Scanner;

public class Pairs {

    public static int demso(int[] a, int k){
        int cnt = 0;
        Arrays.sort(a);
        for(int i = 0; i< a.length-1;i++){
            for(int j = i+1; j< a.length;j++){
                if(a[j] - a[i] == k) cnt++;


            }
        }
        return cnt;
    }

    public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] a = new int[n];
                for(int i = 0;  i < n; i++){
                    a[i] = sc.nextInt();
                }
                int count = demso(a,k);
                System.out.println(count);

            }
        }



