package h3;

public class H3_main {
    public static void main(String[] args) {
        int[] a = {-1,-2,-2,0}, b={0,-2,-1,-2};
        System.out.println(compareArraysVal(a,b));
        System.out.println(compareArraysVal(c,b));
        System.out.println(compareArraysVal(d,b));
        System.out.println(compareArraysVal(b,c));
        System.out.println(compareArraysVal(a,c));
        System.out.println(compareArraysVal(a,e));
        System.out.println(compareArraysVal(e,c));
    }

    public static boolean  compareArraysVal(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        } else {
            for (int k : a) {
                int aCounter = 0, bCounter = 0;
                for (int j = 0; j < a.length; j++) {
                    if (k == b[j]) {
                        bCounter++;
                    }
                    if (k == a[j]) {
                        aCounter++;
                    }
                }
                if (aCounter != bCounter) {
                    return false;
                }
            }
        }
        return true;
    }
}
