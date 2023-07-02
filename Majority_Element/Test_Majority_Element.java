package Majority_Element;

import Helpers.PrintArrayOrList;

public class Test_Majority_Element {

    public static void main(String[] args) {
        test(new Double[] {4d, 4d, 3d, 2d, 2d, 4d, 5d, 4d});
        test(new Double[] {4d, 4d, 3d, 2d, 2d, 4d, 5d});
    }

    private static void test(Double[] array){
        Double result = Majority_Element.mafority_Element(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        if(result!= null){
            System.out.println("Result: " + result.toString());
        }else{
            System.out.println("Result: null");
        }

    }
}
