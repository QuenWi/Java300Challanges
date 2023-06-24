package Russian_Doll_Envelopes;

import Helpers.PrintArrayOrList;

public class Test_Russian_Doll_Envelopes {

    public static void main(String[] args) {
        Float[][] array = {{1f, 1f}, {2f, 0.5f},{1.1f, 1.3f},{0.3f, 0.5f},{1f, 2f},{2f, 1f},{1.3f, 1.4f},{1.6f, 0.9f}};
        Integer result = Russian_Doll_Envelopes.russian_Doll_Envolopes(array);

        System.out.println("Given: " + PrintArrayOrList.arrayMatrixToString(array));
        System.out.println("Result: " + result.toString());
    }
}

