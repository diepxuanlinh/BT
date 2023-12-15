import edu.princeton.cs.algs4.*;
public class Sum2 {
    public static void main(String [] args){
        In in1 = new In("D:\\UET\\hk3\\DSA - Cau truc du lieu va giai thuat\\algs4-data\\1Kints.txt"); // tạo luồng đọc từ file
        In in2 = new In("D:\\UET\\hk3\\DSA - Cau truc du lieu va giai thuat\\algs4-data\\2Kints.txt");
        In in4 = new In("D:\\UET\\hk3\\DSA - Cau truc du lieu va giai thuat\\algs4-data\\4Kints.txt");
        In in8 = new In("D:\\UET\\hk3\\DSA - Cau truc du lieu va giai thuat\\algs4-data\\8Kints.txt");
        int[] a1 = in1.readAllInts();
        int[] a2 = in2.readAllInts();
        int[] a4 = in4.readAllInts();
        int[] a8 = in8.readAllInts();

        int cnt1, cnt2, cnt4, cnt8;
        cnt1 = cnt2 = cnt4 = cnt8 = 0;
        for(int i = 0; i< a1.length;i++){
            for(int j = i+1; j< a1.length;j++){
                if(a1[i] + a1[j] == 0) {
                    cnt1++;
                }
            }
        }
        for(int i = 0; i< a2.length;i++){
            for(int j = i+1; j< a2.length;j++){
                if(a2[i] + a2[j] == 0) {
                    cnt2++;
                }
            }
        }
        for(int i = 0; i< a4.length;i++){
            for(int j = i+1; j< a4.length;j++){
                if(a4[i] + a4[j] == 0) {
                    cnt4++;
                }
            }
        }
        for(int i = 0; i< a8.length;i++){
            for(int j = i+1; j< a8.length;j++){
                if(a8[i] + a8[j] == 0) {
                    cnt8++;
                }
            }
        }
        System.out.println("Tong so cap co tong bang 0 trong 1Kints.txt la : " + cnt1);
        for(int i = 0; i< a1.length;i++){
            for(int j = i+1; j< a1.length;j++){
                if(a1[i] + a1[j] == 0) {
                    System.out.println(a1[i] + " " + a1[j]);
                }
            }
        }
        System.out.println("Tong so cap co tong bang 0  trong 2Kints.txt la : " + cnt2);
        for(int i = 0; i< a2.length;i++){
            for(int j = i+1; j< a2.length;j++){
                if(a2[i] + a2[j] == 0) {
                    System.out.println(a2[i] + " " + a2[j]);
                }
            }
        }
        System.out.println("Tong so cap co tong bang 0 trong 4Kints.txt la : "+  cnt4);
        for(int i = 0; i< a4.length;i++){
            for(int j = i+1; j< a4.length;j++){
                if(a4[i] + a4[j] == 0) {
                    System.out.println(a4[i] + " " + a4[j]);
                }
            }
        }
        System.out.println("Tong so cap co tong bang 0 trong 8Kints.txtla : " + cnt8);
        for(int i = 0; i< a8.length;i++){
            for(int j = i+1; j< a8.length;j++){
                if(a8[i] + a8[j] == 0) {
                    System.out.println(a8[i] + " " + a8[j]);
                }
            }
        }
    }

}
