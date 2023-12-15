

import java.util.*;

public class vebo1 {
    static PriorityQueue<Integer> minPrio = new PriorityQueue<>();
    static PriorityQueue<Integer> maxPrio = new PriorityQueue<>(Collections.reverseOrder());

    static void add(int a) {
        if (minPrio.isEmpty() || a > minPrio.peek()) {
            minPrio.offer(a);
        } else {
            maxPrio.offer(a);
        }
        if (maxPrio.size() > minPrio.size() + 1) {
            minPrio.offer(maxPrio.poll());
        } else if (minPrio.size() > maxPrio.size() + 1) {
            maxPrio.offer(minPrio.poll());
        }
    }

    static void remove() {
        if (minPrio.size() > maxPrio.size()) {
            minPrio.poll();
            return;
        }
        maxPrio.poll();
    }

    static int trungvi() {
        if (minPrio.isEmpty() && maxPrio.isEmpty()) {
            return 0;
        }
        if (minPrio.size() > maxPrio.size()) {
            return minPrio.peek();
        }
        return maxPrio.peek();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            add(u);
        }
        for (int i = 0; i < m; i++) {
            int tmp = sc.nextInt();
            if (tmp == 1) {
                int height = sc.nextInt();
                add(height);
            } else if (tmp == 2) {
                remove();
            } else {
                System.out.println(trungvi());
            }

        }
    }
}