package Product_of_Array_Except_Self;

import Helpers.PrintArrayOrList;

public class Test_Product_of_Array_Except_Self {
    public static void main(String[] args) {
        test(new Float[] {1f, 2f, 3f, 4f, 5f, 6f});
    }

    private static void test(Float[] array){
        Float[] result = Product_of_Array_Except_Self.product_of_array_except_self(array);

        System.out.println("Array: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + PrintArrayOrList.arrayToString(result));
    }
}
