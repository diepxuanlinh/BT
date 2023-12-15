package weekly.tuan6_tuan7_sort;

import java.util.Scanner;

public class stringreverse {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        //char[] a = new char[A.length()];
        boolean ispalin = true;
        for(int i = 0; i < A.length();i++){
            if(A.charAt(i) != A.charAt(A.length() - 1 - i)) {
                ispalin = false;
                break;
            }


        }
        if(ispalin){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }



        /* Enter your code here. Print output to STDOUT. */


    }
}





