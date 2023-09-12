package Binary_Watch;

import Helpers.PrintArrayOrList;

import java.util.List;

public class Test_Binary_Watch {
    public static void main(String[] args) {
        test(0);
        test(1);
        test(2);
        test(3);
        test(4);
        test(5);
        test(8);
        test(9);
    }

    private static void test(Integer integer){
        List<String> result = Binary_Watch.binary_Watch(integer);

        System.out.println("Given: " + integer.toString());
        System.out.println("Result: " + PrintArrayOrList.listToString(result));
    }
}
