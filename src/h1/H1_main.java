package h1;

import java.util.Arrays;

public class H1_main {
    public static void main(String[] args) {
        int[] a = {2,4,-6,8,10};
        int[] b = {10,8,-6,4,2};

        System.out.println(isMirrorArray(a,b));
    }

    public static boolean isMirrorArray(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        } else {
            for (int i = 0; i < a.length;i++) {
                if (a[i] != b[b.length-i-1]) {
                    return false;
                }
            }
            return true;
        }
    }
}
