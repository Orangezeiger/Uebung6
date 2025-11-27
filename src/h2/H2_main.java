package h2;

import java.util.Arrays;

public class H2_main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] c = {1,2,3,4};
        int[] b = {4,3,2,1};

        System.out.println(compareArray(a,b));
        System.out.println(compareArray(c,a));
        System.out.println(compareArray(c,b));
    }

    public static boolean compareArray(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        } else {
            for (int i = 0; i < a.length;i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}
