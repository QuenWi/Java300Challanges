package Next_Permutation;

import Helpers.PrintArrayOrList;

public class Test_Next_Permutation {

    public static void main(String[] args) {
        test(new Float[] {1.3f, 3f, 6f, 3.4f, 5.5f, 8.3f, 6.3f, 2f, 1f});
        test(new Float[] {3f, 2f, 1f});
    }

    private static void test(Float[] array){
        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        Next_Permutation.next_Permutation(array);
        System.out.println("Result: " + PrintArrayOrList.arrayToString(array));
    }
}
