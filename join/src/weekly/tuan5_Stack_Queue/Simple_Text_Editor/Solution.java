package weekly.tuan5_Stack_Queue.Simple_Text_Editor;


import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<String> st = new Stack<String>();
        String last = "";
        st.push(last);
        for (int i = 0; i < n; i++) {
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    String newstr = sc.next();

                    last = st.peek();

                    st.push(last + newstr);
                    break;

                case 2:
                    int k = sc.nextInt();
                    last = st.peek();
                    String temp = last.substring(0, last.length() - k);
                    st.push(temp);
                    break;

                case 3:
                    k = sc.nextInt();
                    System.out.println(st.peek().charAt(k - 1));
                    break;

                case 4:
                    st.pop();
                    break;
            }
        }
    }
}