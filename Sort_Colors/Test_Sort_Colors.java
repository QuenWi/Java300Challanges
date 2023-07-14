package Sort_Colors;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.List;

public class Test_Sort_Colors {

    public static void main(String[] args) {
        List<Colored_Object> list = new ArrayList<Colored_Object>(List.of(
                new Colored_Object(Color.GREEN),
                new Colored_Object(Color.RED),
                new Colored_Object(Color.BLUE),
                new Colored_Object(Color.GREEN),
                new Colored_Object(Color.RED),
                new Colored_Object(Color.WHITE),
                new Colored_Object(Color.BLACK),
                new Colored_Object(Color.BLUE),
                new Colored_Object(Color.GREEN),
                new Colored_Object(Color.BLUE),
                new Colored_Object(Color.WHITE),
                new Colored_Object(Color.GREEN),
                new Colored_Object(Color.RED)
        ));
        test(list);
    }

    private static void test(List<Colored_Object> list){
        System.out.println("Given: " + PrintArrayOrList.listToString(list));
        Sort_Colors.sort_Colors(list);
        System.out.println("Result: " + PrintArrayOrList.listToString(list));
    }
}
