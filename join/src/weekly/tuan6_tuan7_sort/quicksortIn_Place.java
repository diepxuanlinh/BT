package weekly.tuan6_tuan7_sort;

import java.util.Scanner;

public class quicksortIn_Place {
    public static int partition(int[] arr, int left, int right){
        int p = arr[right];
        int i = left - 1;
        for(int j  = left; j < right ;j++){
            if(arr[j] <= p){
                i++;
                swap(arr, i, j);

            }
        }
        i++;
        swap(arr, i, right);

        return i;



    }
    public static int media (int[] arr, int left, int right){
        int p = partition(arr, left, right);
        if(arr.length % 2 == 0 && p == arr.length / 2) return p;
        if(arr.length % 2 == 1 && p == arr.length / 2 + 1) return p;
        if(left >= right) return p;
        media(arr, left, p-1);
        media(arr, p+1,right);
        return -1;



    }

    public static void swap(int[] arr, int id, int old){
        int tmp = arr[id];
        arr[id] = arr[old];
        arr[old] =  tmp;
    }
    static void print(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");

        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(media(arr, 0, n-1));



    }
}
