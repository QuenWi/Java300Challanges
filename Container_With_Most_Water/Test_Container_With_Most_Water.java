package Container_With_Most_Water;

import Helpers.PrintArrayOrList;

public class Test_Container_With_Most_Water {

    public static void main(String[] args) {
        Double[] array = {4d, 4.4d, 3.2d, 7d, 4.3d, 4.4d, 2d, 3.7d, 5d, 4.3d, 4.1d, 5.5d, 2d};
        Double result = Container_With_Most_Water.container_With_Most_Water(array);

        System.out.println("Given: " + PrintArrayOrList.arrayToString(array));
        System.out.println("Result: " + result.toString());
    }
}
