package Minimum_Size_Subarray_Sum;

import java.lang.reflect.Array;

public class Minimum_Size_Subarray_Sum {

    //Get the minimum subarray which sum is higher than the given parameter.
    public static <T extends Number> T[] minimum_Size_Subarray_Sum(T[] array, T sum2){
        int position = 0;
        int minSize = 0;
        boolean end = false;

        for(int i = 1; i < array.length; i++){
            if(end == false){
                for(int l = i; l < array.length; l++){
                    T sum3 = subtraction(array[0], array[0]);
                    for(int j = 0; j < i; j++){
                        sum3 = sum(sum3, array[l - j]);
                    }
                    if(sum3.floatValue() >= sum2.floatValue()){
                        minSize = i;
                        position = l;
                        end = true;
                        break;
                    }
                }
            } else{
                break;
            }
        }

        //System.out.println("minSize: " + minSize);
        //System.out.println("position: " + position);

        T[] result = (T[]) Array.newInstance(array.getClass().getComponentType(), minSize);
        for(int i = 0; i < minSize; i++){
            result[i] = array[i + position];
        }
        return result;
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
}
