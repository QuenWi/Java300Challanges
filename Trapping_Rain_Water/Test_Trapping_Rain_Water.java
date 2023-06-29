package Trapping_Rain_Water;

import Helpers.PrintArrayOrList;

public class Test_Trapping_Rain_Water {

    public static void main(String[] args) {
        test(new Float[] {1f, 3.4f, 2f, 4.5f, 4.6f, 3.2f, 3f, 4f, 2.5f, 2.2f, 2.1f, 3f, 1.6f, 1f});
    }

    private static void test(Float[] terrain){
        Float[] result = Trapping_Rain_Water.trapping_Rain_Water(terrain);

        System.out.println("Terrain: " + PrintArrayOrList.arrayToString(terrain));
        System.out.println("Rainwater: " + PrintArrayOrList.arrayToString(result));
    }
}
