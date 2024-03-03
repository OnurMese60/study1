import java.lang.reflect.Array;

public class Groups {
    public static void groups(int Array[]) {
        int A = 0;
        int B = 0;
        int C = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] >= 200 && 299 >=Array[i] ) {
                A++;
            }
            if (Array[i] >= 300 && 399 >=Array[i] ) {
                B++;
            }
            if (Array[i] >= 400) {
                C++;
            }
        }
        System.out.println("A ->" + " " + A);
        System.out.println("B ->" + " " + B);
        System.out.println("C ->" + " "+C);
    }
}

