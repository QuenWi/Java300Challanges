package Contains_Duplicate;

import Helpers.PrintArrayOrList;

public class Test_Contains_Duplicate {

    public static void main(String[] args) {
        test(new Character[]{'A', 'B', 'C', 'D', 'E'});
        test(new Character[]{'A', 'B', 'C', 'D', 'E', 'A'});
    }

    private static void test(Character[] array){
        Boolean result = Contains_Duplicate.contains_Duplicate(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result.toString());
    }
}
