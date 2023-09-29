import java.util.Arrays;
import java.util.Scanner;
public class ClosestNumbers {
    static void sogannhat(int[] a){
        Arrays.sort(a);
        int min = a[1] - a[0];
        for(int i = 0; i < a.length -1;i++){
            int j = i+1;
            if(a[j]-a[i] <min) min = a[j]- a[i];

        }
        for(int i = 0; i < a.length - 1;i++){
            int j = i+1;
            if(a[j] - a[i] == min) System.out.print(a[i] + " " + a[j] +" ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;  i < n; i++){
            a[i] = sc.nextInt();
        }
        sogannhat(a);

    }
}
