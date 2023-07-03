package Find_the_Second_Largest_Number_in_an_Array;

import Helpers.PrintArrayOrList;

public class Test_Find_the_Second_Largest_Number_in_an_Array {

    public static void main(String[] args) {
        test(new Byte[]{3, 45, 23, 84, 32, 12, 21});
    }

    private static void test(Byte[] array){
        Byte result = Find_the_Second_Largest_Number_in_an_Array.find_the_Second_Largest_Number_in_an_Array(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result.toString());
    }
}
