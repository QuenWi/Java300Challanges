package Top_K_Frequent_Elements;

import Helpers.PrintArrayOrList;

public class Test_Top_K_Frequent_Elements {

    public static void main(String[] args) {
        test(new Character[]{'a', 'b', 'c', 'e', 'a', 'h', 'c', 'd', 'a', 'b', 'g', 'd', 'h', 'b', 'c', 'd', 'b'}, 3);
        test(new Character[]{'a', 'b', 'c', 'e', 'a', 'h', 'c', 'd', 'a', 'b', 'g', 'd', 'h', 'b', 'c', 'j'}, 3);
        test(new Character[]{'a', 'b', 'c', 'e', 'a', 'b', 'c', 'd', 'a', 'b', 'c', 'd', 'h', 'b', 'c', 'd'}, 7);
    }

    private static void test(Character[] array, Integer k){
        Character[] result = Top_K_Frequent_Elements.top_K_Frequent_Elements(array, k);

        System.out.println("Given: k " + k + ", array " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + PrintArrayOrList.arrayToString(result));
    }
}
