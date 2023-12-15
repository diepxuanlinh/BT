package weekly.tuan4Linkedlist;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    static void printLinkedList(SinglyLinkedListNode head) {

        while (head.next != null) {
            System.out.println(head.data);
            head = head.next;
        }
        if (head.next == null) {
            System.out.println(head.data);
            return;
        }


    }

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (llist == null) {
            llist = newNode;
            return llist;

        }

        newNode.next = llist;
        return newNode;


    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode headNode = head;
        if (head == null) {
            head = newNode;
            return head;
        }
        while (headNode.next != null) {
            headNode = headNode.next;
        }
        headNode.next = newNode;
        return head;
    }

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
        SinglyLinkedListNode tmp = llist;
        if (llist == null) {

            llist = new SinglyLinkedListNode(data);
            return llist;


        } else if (position == 0) {
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            newNode.next = llist;
            return newNode;
        }
        for (int i = 0; i < position; i++) {
            tmp = tmp.next;
        }
        SinglyLinkedListNode rightPos = tmp.next.next;
        tmp.next = new SinglyLinkedListNode(data);
        tmp.next.next = rightPos;
        return llist;


    }

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        // Write your code here

        if (position == 0) {
            llist = llist.next;
            return llist;

        }
        SinglyLinkedListNode tmp = llist;
        for (int i = 0; i < position - 1; i++) {
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
        return llist;
    }

    public static void reversePrint(SinglyLinkedListNode llist) {
        if (llist == null) {
            return;
        }
        reversePrint(llist.next);
        System.out.println(llist.data);
    }

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        SinglyLinkedListNode pre = null;
        SinglyLinkedListNode curr = llist;
        SinglyLinkedListNode next = null;
        while (curr.next != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        llist = pre;
        return llist;
        // Write your code here

    }

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while (head1.next != null && head2.next != null) {
            if (head1.data != head2.data) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;


        }
        if (head1.next != null || head2.next != null) {
            return false;
        }
        return true;


    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        PriorityQueue<Integer> sort = new PriorityQueue<>();
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        if (head1.data < head2.data) {
            head1.next = mergeLists(head1.next, head2);
            return head1;

        } else {
            head2.next = mergeLists(head1, head2.next);
            return head2;
        }


    }


    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {

        int n = 0;
        SinglyLinkedListNode tmp = llist;
        while (tmp != null) {
            n++;
            tmp = tmp.next;

        }
        positionFromTail = n - positionFromTail;


        for (int i = 0; i < positionFromTail -1 ; i++) {
            llist = llist.next;
        }


        return llist.data;


    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        printLinkedList(llist.head);

        scanner.close();
    }
}
