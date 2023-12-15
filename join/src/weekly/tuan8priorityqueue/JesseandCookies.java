package weekly.tuan8priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class JesseandCookies {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N, K;
        N = scanner.nextInt();
        K = scanner.nextInt();

        PriorityQueue<Integer> pqueue = new PriorityQueue(N);
        for (int i = 0; i < N; i++) {
            pqueue.add(scanner.nextInt());
        }
        int cnt = 0;


        while (pqueue.size() != 0 && pqueue.peek() < K) {
            int s1 = pqueue.poll();
            int s2 = pqueue.poll();
            pqueue.add(s1 + 2 * s2);
           cnt++;
        }
        if(pqueue.peek() < K){
            System.out.println(-1);
        }
        else {
            System.out.println(cnt);
        }

    }
}
