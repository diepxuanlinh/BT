//package weekly.tuan10;
//
//import java.util.*;
//import java.io.*;
//
//class Node {
//    Node left;
//    Node right;
//    int data;
//
//    Node(int data) {
//        this.data = data;
//        left = null;
//        right = null;
//    }
//}
//
//class Treebinarysearch {
//    public static int height(Node root) {
//        if (root == null) return 0;
//        else {
//            int leftheight = height(root.left);
//            int rightheight = height(root.right);
//
//            // Write your code here.
//            if (leftheight > rightheight) return leftheight + 1;
//            else {
//                return rightheight + 1;
//            }
//        }
//    }
//
//    public static Node insert(Node root, int data) {
//        if (root == null) {
//            root = new Node(data);
//            return root;
//        } else {
//            Node curr;
//            if (data < root.data) {
//                curr = insert(root.left, data);
//                root.left = curr;
//            }
//            else {
//                curr = insert(root.right, data);
//                root.right = curr;
//            }
//            return root;
//        }
//
//
//    }
//
//
//    public static Node insert(Node root, int data) {
//        if (root == null) {
//            return new Node(data);
//        } else {
//            Node cur;
//            if (data <= root.data) {
//                cur = insert(root.left, data);
//                root.left = cur;
//            } else {
//                cur = insert(root.right, data);
//                root.right = cur;
//            }
//            return root;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int t = scan.nextInt();
//        Node root = null;
//        while (t-- > 0) {
//            int data = scan.nextInt();
//            root = insert(root, data);
//        }
//        scan.close();
//        int height = height(root);
//        System.out.println(height);
//    }
//}
//
