package Find_K_Pairs_with_Smallest_Sums;

import Helpers.PrintArrayOrList;

public class Test_Find_K_Pairs_with_Smallest_Sums {

    public static void main(String[] args) {
        test(new Float[]{2f, 5.5f, 8f, 12.2f}, new Float[]{2f, 5.5f, 6.5f, 19f, 21f}, 50);
        test(new Float[]{2f, 5.5f, 8f, 12.2f}, new Float[]{2.4f, 5.7f, 6.5f, 19f, 21f}, 5);
        test(new Float[]{2f, 5.5f, 8f, 12.2f}, new Float[]{2f, 5.5f, 6.5f, 19f, 21f}, 12);
        test(new Float[]{200f, 500.5f}, new Float[]{2f, 6.5f, 19f, 21f}, 7);
        test(new Float[]{3f}, new Float[]{2f, 6.5f, 19f, 21f, 33f}, 4);
    }

    private static void test(Float[] array1, Float[] array2, Integer k){
        Float[][] result = Find_K_Pairs_with_Smallest_Sums.find_K_Pairs_with_Smallest_Sums(array1, array2, k);

        System.out.println(String.format("Given: Array1 = %s, Array2 = %s, k = %s",
                PrintArrayOrList.arrayToString(array1), PrintArrayOrList.arrayToString(array2), k.toString()));
        System.out.println("Result: " + PrintArrayOrList.arrayMatrixToString(result));
    }
}
