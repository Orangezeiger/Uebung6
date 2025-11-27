package h1;

import java.util.Arrays;

public class H1_main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {4,3,2,1};
        int[] c = {1,2,3};
        int[] d = {9,3,1};

        System.out.println(isMirrorArray(a,b));
        System.out.println(isMirrorArray(b,a));
        System.out.println(isMirrorArray(a,c));
        System.out.println(isMirrorArray(d,c));
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
