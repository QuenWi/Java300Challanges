package Search_Insert_Position;

import Helpers.PrintArrayOrList;

public class Test_Search_Insert_Position {

    public static void main(String[] args) {
        Double[] array = {-1d, -0.5d, 0.3d, 1d, 1.3d, 1.5d, 1.6d, 1.8d};
        Double wanted1 = 1d;
        Double wanted2 = 0.2d;
        Double wanted3 = 1.9d;
        Double wanted4 = 1.7d;
        Integer result1 = Search_Insert_Position.search_Intert_Position(array, wanted1);
        Integer result2 = Search_Insert_Position.search_Intert_Position(array, wanted2);
        Integer result3 = Search_Insert_Position.search_Intert_Position(array, wanted3);
        Integer result4 = Search_Insert_Position.search_Intert_Position(array, wanted4);

        System.out.println("Given" + PrintArrayOrList.arrayToString(array));
        System.out.println("Result for " + wanted1.toString() + ": " + result1.toString());
        System.out.println("Result for " + wanted2.toString() + ": " + result2.toString());
        System.out.println("Result for " + wanted3.toString() + ": " + result3.toString());
        System.out.println("Result for " + wanted4.toString() + ": " + result4.toString());
    }
}
