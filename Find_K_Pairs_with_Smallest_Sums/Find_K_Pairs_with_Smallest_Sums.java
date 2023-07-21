package Find_K_Pairs_with_Smallest_Sums;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Find_K_Pairs_with_Smallest_Sums {

    //Return the k smallest pairs.
    public static <T extends Number> T[][] find_K_Pairs_with_Smallest_Sums(T[] array1, T[] array2, Integer k){
        if(k > array1.length * array2.length){
            return null;
        }
        T[][] result = (T[][])Array.newInstance(array1.getClass(), k);
        List<Point<T>> all = new ArrayList<>();
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                all.add(new Point<T>(array1[i], array2[j]));
            }
        }
        all.sort(new Comparator<Point<T>>() {
            @Override
            public int compare(Point<T> o1, Point<T> o2) {
                return Float.compare(sum(o1.x, o1.y).floatValue(), sum(o2.x, o2.y).floatValue());
            }
        });
        for(int i = 0; i < k; i++){
            T[] memory = (T[])Array.newInstance(array1[0].getClass(), 2);
            memory[0] = all.get(i).x;
            memory[1] = all.get(i).y;
            result[i] = memory;
        }
        return result;
    }

    static class Point <T extends Number>{
        T x;
        T y;

        Point(T x, T y){
            this.x = x;
            this.y = y;
        }
    }

    private static <T extends Number> T sum(T nr1, T nr2){
        if(nr1 instanceof Float){
            return (T)(Number) (nr1.floatValue() + nr2.floatValue());
        } else if(nr1 instanceof Double){
            return (T)(Number) (nr1.doubleValue() + nr2.doubleValue());
        } else if(nr1 instanceof Integer){
            return (T)(Number) (nr1.intValue() + nr2.intValue());
        } else if(nr1 instanceof Long){
            return (T)(Number) (nr1.longValue() + nr2.longValue());
        } else if(nr1 instanceof Byte){
            return (T)(Number) (nr1.byteValue() + nr2.byteValue());
        } else if(nr1 instanceof Short){
            return (T)(Number) (nr1.shortValue() + nr2.shortValue());
        }
        return null;
    }
}
