package Group_Shifted_Strings;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Test_Group_Shifted_Strings {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("xyz");
        list.add("yza");
        list.add("mlk");
        list.add("a");
        list.add("b");
        list.add("Z");
        list.add("efghj");
        list.add("lmnoq");
        list.add("lmnop");
        List<List<String>> result = Group_Shifted_Strings.group_Shifted_Strings(list);
        test(list);
    }

    private static void test(List<String> list){
        List<List<String>> result = Group_Shifted_Strings.group_Shifted_Strings(list);
        System.out.println("Given: " + PrintArrayOrList.listToString(list));
        System.out.println("Result: " + PrintArrayOrList.listMatrixToString(result));
    }
}
