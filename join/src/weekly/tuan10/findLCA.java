//package weekly.tuan10;
//
//import java.util.Scanner;
//
//
//
////class Node {
////    Node left;
////    Node right;
////    int data;
////
////    Node(int data) {
////        this.data = data;
////        left = null;
////        right = null;
////    }
////}
//
//class isbinarysearch {
//   static int min(Node root) {
//        if (root == null) {
//            return Integer.MAX_VALUE;
//        }
//        if (root.left == null) {
//            return root.data;
//        }
//        return min(root.left);
//    }
//
//   static int max(Node root) {
//        if (root == null) {
//            return Integer.MIN_VALUE;
//        }
//        if (root.right == null) {
//            return root.data;
//        }
//        return max(root.right);
//    }
//
//    static boolean checkBST(Node root) {
//        if(root == null){
//            return true;
//        }
//        if(root.data > max(root.left) && checkBST(root.left) || root.data < min(root.right) && checkBST(root.right) ){
//            return true;
//        }
//        return false;
//
//    }
//
//}
//
//class findLCA {
//
//    public static Node lca(Node root, int v1, int v2) {
//        if (root == null) return root;
//        if (root.data > v1 && root.data > v2) {
//            return lca(root.left, v1, v2);
//        }
//        if (root.data < v1 && root.data < v2) {
//            return lca(root.right, v1, v2);
//        }
//        return root;
//
//        // Write your code here.
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
//        int v1 = scan.nextInt();
//        int v2 = scan.nextInt();
//        scan.close();
//        Node ans = lca(root, v1, v2);
//        System.out.println(ans.data);
//    }
//}
//
//
//
//
