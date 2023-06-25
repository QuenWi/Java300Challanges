package Line_Reflection;

import Helpers.PrintArrayOrList;

public class Test_Line_Reflection {

    public static void main(String[] args) {
        Float[][] array = {{1f, -2f}, {5f, -2f}, {7f, 4f}, {0.5f, 3.3f}, {3.5f, 8f}, {2.5f, 8f}, {-17f, 2f}, {23f, 2f}, {-1f, 4f}, {5.5f, 3.3f}}; //mirror 3
        //Float[][] array = {{0f, -2f}, {5f, -2f}, {7f, 4f}, {0.5f, 3.3f}, {3.5f, 8f}, {2.5f, 8f}, {-17f, 2f}, {23f, 2f}, {-1f, 4f}, {5.5f, 3.3f}}; //wrong
        //Float[][] array = {{1f, -2f}, {5f, -3f}, {7f, 4f}, {0.5f, 3.3f}, {3.5f, 8f}, {2.5f, 8f}, {-17f, 2f}, {23f, 2f}, {-1f, 4f}, {5.5f, 3.3f}}; //wrong
        Boolean result = Line_Reflection.line_Reflection(array);

        System.out.println("Given: " + PrintArrayOrList.arrayMatrixToString(array));
        System.out.println("Result: " + result);

    }
}
