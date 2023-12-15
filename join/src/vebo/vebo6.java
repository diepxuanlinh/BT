package vebo;

import java.util.PriorityQueue;
import java.util.Scanner;

class MyHeap {
    private int MAXSIZE = 1000001;
    private int[] arr = new int[MAXSIZE + 1];
    private int size;


    public MyHeap() {
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size <= 0) return true;
        return false;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }

        return arr[1];
    }

    public void swap(int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public void add(int u) {
        size++;
        arr[size] = u;
        int currId = size;
        int parentId = currId / 2;
        while (arr[parentId] > arr[currId] && parentId != 0) {
            swap(parentId, currId);
            currId = parentId;
            parentId = currId / 2;


        }
    }

    public int poll() {
        if (isEmpty()) {
            return -1;

        }
        int minRoot = arr[1];
        arr[1] = arr[size];
        size--;

        int currId = 1;

        while ((2 * currId) <= size) {

            int leftId = 2 * currId;
            int rightId = leftId + 1;
            int smallId = leftId;

            if ((arr[rightId] < arr[leftId]) && (rightId <= size)) {
                smallId = rightId;
            }
            if (arr[currId] > arr[smallId]) {
                swap(currId, smallId);
                currId = smallId;


            } else {
                break;
            }

        }
        return minRoot;
    }


}

public class vebo6 {
    public static void main(String[] args) {
        MyHeap myHeap = new MyHeap();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int k = sc.nextInt();


        for (int i = 0; i < n; i++) {

            myHeap.add(sc.nextInt());
        }
        int cnt = 0;
        while (!myHeap.isEmpty() && myHeap.peek() < k) {
            int s1 = myHeap.poll();
            if(s1 >=k){
                System.out.println(cnt);
                return;
            }
            if(myHeap.isEmpty()){
                System.out.println(-1);
                return;
            }
            

            int s2 = myHeap.poll();
            myHeap.add(s1 + 2 * s2);
            cnt++;

        }
        if (myHeap.peek() < k) {
            System.out.println(-1);
        } else {
            System.out.println(cnt);
        }
    }
}



