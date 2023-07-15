package Maximum_Gap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Maximum_Gap {

    //What is the maximum distance between two sequencial elements in the array, if it would be sorted.
    //Without sorting it.
    public static <T extends Number> T maximum_Gap(T[] array){
        T result = null;
        T min = array[0];
        T max = array[0];
        for(int i = 0; i < array.length; i++){
            if(compare(array[i], min)){
                min = array[i];
            }
            if(compare(max, array[i])){
                max = array[i];
            }
        }
        T distance =  division(subtraction(max, min), square(((Integer)array.length)).doubleValue());
        T memory = min;
        List<Bucket<T>> list = new ArrayList<>();
        while(compare(memory, max)){
            list.add(new Bucket<T>(memory, sum(memory, distance)));
            memory = sum(memory, distance);
        }
        for(T item : array){
            for(Bucket<T> bucket : list){
                if(bucket.includes(item)){
                    break;
                }
            }
        }
        for(Bucket<T> bucket : list){
            memory = bucket.getDistances();
            if(memory != null){
                if(result == null){
                    result = memory;
                } else if(compare(result, memory)){
                    result = memory;
                }
            }
        }

        T lastMin = null;
        T lastMax = null;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).minElement != null){
                if(lastMax == null){
                    lastMax = list.get(i).maxElement;
                } else{
                    lastMin = list.get(i).minElement;
                }
            }
            if(lastMin != null){
                if(compare(result, subtraction(lastMax, lastMin))){
                    result = subtraction(lastMax, lastMin);
                }
                lastMax = list.get(i).maxElement;
                lastMin = null;
            }

        }
        return result;
    }

    private static class Bucket <T extends Number>{
        T min;
        T max;
        T minElement;
        T maxElement;

        List<T> list;

        Bucket(T min, T max){
            this.min = min;
            this.max = max;
            minElement = null;
            maxElement = null;
            list = new ArrayList<>();
        }

        boolean includes(T element){
            if((compare(element, max) || max.equals(element)) && (compare(min, element) || min.equals(element))){
                list.add(element);
                return true;
            }
            return false;
        }

        T getDistances(){
            T result = null;
            if(list.size() != 0){
                list.sort(comparator(list.get(0)));
                for(int i = 1; i < list.size(); i++){
                    if(result == null || compare(result, subtraction(list.get(i), list.get(i-1)))){
                        result = subtraction(list.get(i), list.get(i-1));
                    }
                }
                minElement = list.get(0);
                maxElement = list.get(list.size()-1);
            }
            return result;
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

    private static <T extends Number> T subtraction(T nr1, T nr2){
        if(nr1 instanceof Float){
            return (T)(Number) (nr1.floatValue() - nr2.floatValue());
        } else if(nr1 instanceof Double){
            return (T)(Number) (nr1.doubleValue() - nr2.doubleValue());
        } else if(nr1 instanceof Integer){
            return (T)(Number) (nr1.intValue() - nr2.intValue());
        } else if(nr1 instanceof Long){
            return (T)(Number) (nr1.longValue() - nr2.longValue());
        } else if(nr1 instanceof Byte){
            return (T)(Number) (nr1.byteValue() - nr2.byteValue());
        } else if(nr1 instanceof Short){
            return (T)(Number) (nr1.shortValue() - nr2.shortValue());
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

    private static <T extends Number> T absolute(T nr){
        if(nr instanceof Float){
            return (T)(Number) (Math.abs(nr.floatValue()));
        } else if(nr instanceof Double){
            return (T)(Number) (Math.abs(nr.doubleValue()));
        } else if(nr instanceof Integer){
            return (T)(Number) (Math.abs(nr.intValue()));
        } else if(nr instanceof Long){
            return (T)(Number) (Math.abs(nr.longValue()));
        } else if(nr instanceof Byte){
            return (T)(Number) (Math.abs(nr.byteValue()));
        } else if(nr instanceof Short){
            return (T)(Number) (Math.abs(nr.shortValue()));
        }
        return null;
    }

    private static <T extends Number> T square(T nr){
        if(nr instanceof Float){
            return (T)(Number) ((Double)(Math.sqrt(nr.doubleValue()))).floatValue();
        } else if(nr instanceof Double){
            return (T)(Number) ((Double)(Math.sqrt(nr.doubleValue()))).doubleValue();
        } else if(nr instanceof Integer){
            return (T)(Number) ((Double)(Math.sqrt(nr.doubleValue()))).intValue();
        } else if(nr instanceof Long){
            return (T)(Number) ((Double)(Math.sqrt(nr.doubleValue()))).longValue();
        } else if(nr instanceof Byte){
            return (T)(Number) ((Double)(Math.sqrt(nr.doubleValue()))).byteValue();
        } else if(nr instanceof Short){
            return (T)(Number) ((Double)(Math.sqrt(nr.doubleValue()))).shortValue();
        }
        return null;
    }

    public static <T extends Number> boolean compare(T nr1, T nr2){
        boolean result = false;
        if(nr1 instanceof Float){
            if(nr1.floatValue() < nr2.floatValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Double){
            if(nr1.doubleValue() < nr2.doubleValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Integer){
            if(nr1.intValue() < nr2.intValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Short){
            if(nr1.longValue() < nr2.longValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Byte){
            if(nr1.byteValue() < nr2.byteValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Short){
            if(nr1.shortValue() < nr2.shortValue()){
                return true;
            } else{
                return false;
            }
        }
        return result;
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
