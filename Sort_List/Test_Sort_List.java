package Sort_List;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Test_Sort_List {

    public static void main(String[] args) {
        test(new ArrayList<>(List.of(22d, 5d, 3.4d, 6.7d, 9d, 2d, 3.3d, 5.6d, 9.8d, 11d, 15d, 2d, 4d, 5.5d)), new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return Double.compare(o1, o2);
            }
        });
        test(new ArrayList<>(List.of(22d, 5d, 3.4d, 6.7d, 9d, 2d, 3.3d, 5.6d, 9.8d, 11d, 15d, 2d, 4d, 5.5d, 5.5d)), new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return Double.compare(o1, o2);
            }
        });
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 25; i++){
            list.add(random.nextInt(100));
        }
        test2(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        list = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            list.add(random.nextInt(1000));
        }
        test2(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
    }

    private static void test(List<Double> list, Comparator<Double> comparator){
        System.out.println("Given: " + PrintArrayOrList.listToString(list));
        Sort_List.sort_List(list, comparator);
        System.out.println("Result: " + PrintArrayOrList.listToString(list));
    }

    private static void test2(List<Integer> list, Comparator<Integer> comparator){
        System.out.println("Given: " + PrintArrayOrList.listToString(list));
        Sort_List.sort_List(list, comparator);
        System.out.println("Result: " + PrintArrayOrList.listToString(list));
    }
}
