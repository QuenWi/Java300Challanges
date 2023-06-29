package Count_of_Smaller_Numbers_After_Self;

import Helpers.PrintArrayOrList;
import Longest_Increasing_Subsequence.Longest_Increasing_Subsequence;

public class Test_Count_of_Smaller_Numbers_After_Self {

    public static void main(String[] args) {
       test(new Float[]{1f, 0.5f, 0.6f, 2f, 1.2f, 6f, 8f, 1.4f, 1.1f, 1.2f, 4f, 3.3f, 4.5f, 6f, 1.3f, 3.4f, 3.3f, 3.5f, 3.6f});
    }

    private static void test(Float[] array){
        Integer[] result = Count_of_Smaller_Numbers_After_Self.count_of_Smaller_Numbers_After_Self(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + PrintArrayOrList.arrayToString(result));
    }

}
