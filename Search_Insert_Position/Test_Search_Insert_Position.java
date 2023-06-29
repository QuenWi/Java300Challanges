package Search_Insert_Position;

import Helpers.PrintArrayOrList;

public class Test_Search_Insert_Position {

    public static void main(String[] args) {
        test(new Double[] {-1d, -0.5d, 0.3d, 1d, 1.3d, 1.5d, 1.6d, 1.8d}, 1d);
        test(new Double[] {-1d, -0.5d, 0.3d, 1d, 1.3d, 1.5d, 1.6d, 1.8d}, 0.2d);
        test(new Double[] {-1d, -0.5d, 0.3d, 1d, 1.3d, 1.5d, 1.6d, 1.8d}, 1.9d);
        test(new Double[] {-1d, -0.5d, 0.3d, 1d, 1.3d, 1.5d, 1.6d, 1.8d}, 1.7d);
    }

    private static void test(Double[] array, Double wanted){
        Integer result = Search_Insert_Position.search_Intert_Position(array, wanted);

        System.out.println("Given" + PrintArrayOrList.arrayToString(array));
        System.out.println("Result for " + wanted.toString() + ": " + result.toString());
    }
}
