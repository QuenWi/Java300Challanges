package Move_Zeros;

import Helpers.PrintArrayOrList;
import Remove_Element.Remove_Element;

import java.util.ArrayList;
import java.util.List;

public class Test_Move_Zeros {
    public static void main(String[] args) {
        List<Float> list = new ArrayList<Float>();
        for(int i = 0; i < 10; i++){
            list.add((float)i);
        }
        for(int i = 0; i < 5; i++){
            list.add((float)(i)*2);
        }
        for(int i = 0; i < 3; i++){
            list.add((float)(i)*3);
        }
        test(list);
    }

    private static void test(List<Float> list){
        Float[] array = list.toArray(Float[]::new); //Just an array for testing
        System.out.println("Before: " + PrintArrayOrList.arrayToString(array));
        Move_Zeros.move_Zeros(array);
        System.out.println("After: " + PrintArrayOrList.arrayToString(array));
    }
}
