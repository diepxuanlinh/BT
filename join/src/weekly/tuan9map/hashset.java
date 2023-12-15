package weekly.tuan9map;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class  hashset {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        HashSet hashSet = new HashSet<>();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
            String tmp = pair_left[i] + " " + pair_right[i];
            if(!hashSet.contains(tmp)){
                hashSet.add(tmp);
            }

            System.out.println(hashSet.size());

        }



    }
}
