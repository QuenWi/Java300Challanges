package Maximum_Gap;

import Helpers.PrintArrayOrList;

import java.util.Random;

public class Test_Maximum_Gap {

    public static void main(String[] args) {
        test(new Float[]{5f, 3f, 2f, 6f, 7f, 10f, 9f, 8.5f});
        Float[] array = new Float[25];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = (((Integer)random.nextInt(1000)).floatValue()/((Integer)100).floatValue());
        }
        test(array);
    }

    private static void test(Float[] array){
        Float result = Maximum_Gap.maximum_Gap(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result.toString());
    }
}
