package Number_of_Islands_II;

import Helpers.PrintArrayOrList;

import java.util.List;

public class Test_Number_of_Islands_II {

    public static void main(String[] args) {
        test(6, 6, new Integer[][]{{1,3}, {2, 3}, {4, 4}, {4, 5}, {5, 1}});
        test(6, 6, new Integer[][]{{1,1}, {2, 2}, {4, 4}, {3, 3}, {5, 5}});
        test(6, 6, new Integer[][]{{1,1}, {2, 2}, {4, 4}, {3, 3}, {5, 5}, {4, 5}});
    }

    private static void test(Integer width, Integer hight, Integer[][] land){
        Integer result = Number_of_Islands_II.number_of_Islands_II(width, hight, land);

        System.out.println(String.format("Given: %s, %s and %s", width.toString(), hight.toString(), PrintArrayOrList.arrayMatrixToString(land)));
        System.out.println("Result: " + result.toString());
    }
}
