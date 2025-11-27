package h3;

public class H3_main {
    public static void main(String[] args) {
        int[] a = {1,2,3}, b={1,2,4}, c={1,3,2}, d={1,2}, e={1,2,3}, f={1,1,2};
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
        } else{
            for (int i = 0; i < a.length; i++) {
                int aCounter = 0, bCounter = 0;
                for (int j = 0; j < a.length; j++) {
                    if (a[i] == b[j]) {
                        bCounter++;
                    }
                    if (a[i] == a[j]) {
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
