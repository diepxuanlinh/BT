package weekly.tuan5_Stack_Queue.Queue_using_Two_Stacks;


import java.util.LinkedList;
import java.util.Scanner;


public class Solution {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> listStack = new LinkedList<>();
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            switch (type) {
                case 1: {
                    listStack.add(sc.nextInt());
                    break;

                }
                case 2: {
                    if (!listStack.isEmpty()) {
                        listStack.pollFirst();
                    }
                    break;
                }
                case 3: {
                    System.out.println(listStack.getFirst());
                    break;
                }


            }

        }
    }
}