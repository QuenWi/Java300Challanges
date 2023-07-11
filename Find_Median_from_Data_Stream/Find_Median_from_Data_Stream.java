package Find_Median_from_Data_Stream;

import java.util.ArrayList;
import java.util.Comparator;

public class Find_Median_from_Data_Stream {

    //What is the median of an Array?
    public static <T extends Number> T find_Median_from_Data_Stream(T[] array){
        ArrayList<T> arrayList = new ArrayList<>();
        for(T item : array){
            arrayList.add(item);
        }
        arrayList.sort(comparator(array[0]));
        if(arrayList.size() % 2 == 1){
            return arrayList.get(arrayList.size()/2);
        } else{
            Integer i = 2;
            T sum = sum(arrayList.get(arrayList.size()/2), arrayList.get(arrayList.size()/2-1));
            return division(sum, i);
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

    private static <T extends Number, E extends Number> T division(T nr1, E nr2){
        if(nr1 instanceof Float){
            return (T)(Number) (nr1.floatValue() / nr2.floatValue());
        } else if(nr1 instanceof Double){
            return (T)(Number) (nr1.doubleValue() / nr2.doubleValue());
        } else if(nr1 instanceof Integer){
            return (T)(Number) (nr1.intValue() / nr2.intValue());
        } else if(nr1 instanceof Long){
            return (T)(Number) (nr1.longValue() / nr2.longValue());
        } else if(nr1 instanceof Byte){
            return (T)(Number) (nr1.byteValue() / nr2.byteValue());
        } else if(nr1 instanceof Short){
            return (T)(Number) (nr1.shortValue() / nr2.shortValue());
        }
        return null;
    }

    private static <T extends Number> Comparator<T> comparator(T nr1){
        if(nr1 instanceof Float){
            return new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    return Float.compare(o1.floatValue(), o2.floatValue());
                }
            };
        } else if(nr1 instanceof Double){
            return new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    return Double.compare(o1.doubleValue(), o2.doubleValue());
                }
            };
        } else if(nr1 instanceof Integer){
            return new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    return Integer.compare(o1.intValue(), o2.intValue());
                }
            };
        } else if(nr1 instanceof Long){
            return new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    return Long.compare(o1.longValue(), o2.longValue());
                }
            };
        } else if(nr1 instanceof Byte){
            return new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    return Byte.compare(o1.byteValue(), o2.byteValue());
                }
            };
        } else if(nr1 instanceof Short){
            return new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    return Short.compare(o1.shortValue(), o2.shortValue());
                }
            };
        }
        return null;
    }
}
