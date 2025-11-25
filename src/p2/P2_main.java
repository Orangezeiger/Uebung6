package p2;

public class P2_main {

    static int[] array1 = {1,2,4,6,7,5,2,3,4,6};
    static int[] array2 = {1,2,4,7,5,3,6};


    public static void main(String[] args) {
        System.out.println(pairwiseDifferent(array1));
        System.out.println();
        System.out.println(pairwiseDifferent(array2));
    }

    public static boolean pairwiseDifferent(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
