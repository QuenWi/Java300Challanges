package Add_Two_Numbers;

import Helpers.PrintArrayOrList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test_Add_Two_Numbers {

    public static void main(String[] args) {
        LinkedList<Integer> nr1 = new LinkedList<Integer>(){{
            add(1); add(2); add(3); add(4);
        }}; //4321
        LinkedList<Integer> nr2 = new LinkedList<Integer>(){{
            add(9); add(0); add(8); add(7);
        }}; //7809
        LinkedList<Integer> nr3 = new LinkedList<Integer>(){{
            add(1); add(8);
        }}; //81

        test(nr1, nr2); //12130
        test(nr1, nr3); //4402
    }

    private static void test(LinkedList<Integer> nr1, LinkedList<Integer> nr2){
        LinkedList<Integer> result = Add_Two_Numbers.add_Two_Numbers(nr1, nr2);

        System.out.println("Given: " + PrintArrayOrList.listToString(nr1) + " and " + PrintArrayOrList.listToString(nr2));
        System.out.println("Result: " + PrintArrayOrList.listToString(result));
    }
}
