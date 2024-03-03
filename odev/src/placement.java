public class placement {
    public static int placement1(int Array[]) {
        int min = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (min > Array[i])
                min = Array[i];
        }
        return min;
    }
    public static int placement2(int Array2[]){
        int min = placement1(Array2);
        int min2 = Array2[0];
        for (int i = 0; i < Array2.length; i++) {
            if(min2 > Array2[i] && Array2[i]>min)
            min2 = Array2[i];

        }

        return  min2;
    }
    public static int placement3(int Array3[]){
        int min2 = placement2(Array3);
        int min3= Array3[0];
        for (int i = 0; i < Array3.length; i++) {
            if (min3 > Array3[i] && Array3[i]>min2)
            min3=Array3[i];

        }
        return min3;
    }
}
