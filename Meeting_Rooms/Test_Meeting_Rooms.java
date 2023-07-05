package Meeting_Rooms;

import Helpers.Interval;

import java.util.ArrayList;
import java.util.List;

public class Test_Meeting_Rooms {

    public static void main(String[] args) {
        List<Interval<Float>> list = new ArrayList<>();
        list.add(new Interval<Float>(6.2f, 8f));
        list.add(new Interval<Float>(2.5f, 3.3f));
        list.add(new Interval<Float>(1f, 2f));
        list.add(new Interval<Float>(4f, 5.5f));
        test(list);
        list.add(new Interval<Float>(3f, 3.8f));
        test(list);
    }

    private static void test(List<Interval<Float>> list){
        Boolean result = Meeting_Rooms.meeting_Rooms(list);

        System.out.println("Given: " + Interval.listToString(list));
        System.out.println("Result: " + result);
    }
}
