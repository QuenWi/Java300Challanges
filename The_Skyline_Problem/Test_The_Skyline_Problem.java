package The_Skyline_Problem;

import Helpers.PrintArrayOrList;

import java.util.List;

public class Test_The_Skyline_Problem {

    public static void main(String[] args) {
        Integer[][] skyscrapers = new Integer[][]{
                {12, 15, 2},
                {13, 16, 3},
                {14, 17, 4},
                {16, 18, 2},
                {1, 6, 2},
                {3, 5, 5},
                {4, 7, 1},
                {8, 12, 4},
                {9, 11, 2},
        };
        test(skyscrapers);
        //nodes: {{1, 0}, {1, 2}, {3, 2}, {3, 5}, {5, 5}, {5, 2}, {6, 2}, {6, 1}, {7, 1}, {7, 0},
        // {8, 0}, {8, 4}, {12, 4}, {12, 2}, {13, 2}, {13, 3}, {14, 3}, {14, 4}, {17, 4}, {17, 2}, {18, 2}, {18, 0}}
    }

    private static void test(Integer[][] skyscrapers){
        List<List<Integer>> result = The_Skyline_Problem.the_Skyline_Problem(skyscrapers);

        System.out.println("Given: ");
        for (Integer[] array : skyscrapers){
            System.out.println(String.format("(x1: %s, x2: %s, height: %s)", array[0], array[1], array[2]));
        }
        System.out.println("Result: " + PrintArrayOrList.listMatrixToString(result));
    }
}
