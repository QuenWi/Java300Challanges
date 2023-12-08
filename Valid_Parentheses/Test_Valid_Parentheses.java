package Valid_Parentheses;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Test_Valid_Parentheses {

    public static void main(String[] args) {
        List<Character> list = new ArrayList<Character>(){{
            add(']'); add('[');
        }};
        test(list);
        list = new ArrayList<Character>(){{
            add('['); add('('); add(']'); add(')');
        }};
        test(list);
        list = new ArrayList<Character>(){{
            add('['); add('('); add(')'); add(']');
        }};
        test(list);
        list = new ArrayList<Character>(){{
            add('['); add('('); add(')');
        }};
        test(list);
        list = new ArrayList<Character>(){{
            add('['); add('('); add(')'); add('['); add('('); add(')'); add(']');
        }};
        test(list);
        list = new ArrayList<Character>(){{
            add('['); add('('); add(')'); add('['); add('('); add(')'); add(']'); add(']');
        }};
        test(list);
    }

    private static void test(List<Character> list){
        Boolean result = Valid_Parentheses.valid_Parentheses(list);

        System.out.println("Given: " + PrintArrayOrList.listToString(list));
        System.out.println("Result: " + result.toString());
    }
}
