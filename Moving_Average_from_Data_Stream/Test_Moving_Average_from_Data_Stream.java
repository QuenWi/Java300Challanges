package Moving_Average_from_Data_Stream;

import Helpers.PrintArrayOrList;

public class Test_Moving_Average_from_Data_Stream {

    public static void main(String[] args) {
        test(new Double[]{2.2d, 3.7d, -1.4d, 5.4d, 0.3d, 1.4d, 8.1d, 1.3d, -2.4d, 4.4d, -3.7d, 4.9d}, 4);
        test(new Double[]{2.2d, -1.4d, 0.3d, 1.4d, 1.3d, -2.4d, 4.4d, -3.7d}, 3);
    }

    private static void test(Double[] array, Integer width){
        Double[] result = Moving_Average_from_Data_Stream.moving_Average_from_Data_Stream(array, width);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array) + ", width " + width);
        System.out.println("Result: " + PrintArrayOrList.arrayToString(result));
    }
}
