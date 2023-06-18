package Trapping_Rain_Water;


import Helpers.PrintArrayOrList;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.Comparator;

public class Trapping_Rain_Water {

    //How much rainwater can be trapped between this different hights?
    public static <T extends Number> T[] trapping_Rain_Water(T[] array){

        //T[] leftToRight = (T[]) (new Number[array.length]);
        T[] leftToRight = (T[]) (Array.newInstance(array.getClass().getComponentType(), array.length));
        leftToRight[0] = array[0];
        T[] rightToLeft = (T[]) (Array.newInstance(array.getClass().getComponentType(), array.length));
        rightToLeft[rightToLeft.length-1] = array[rightToLeft.length-1];

        T[] result = (T[]) (Array.newInstance(array.getClass().getComponentType(), array.length));

        T memory = array[0];
        for(int i = 1; i < array.length; i++) {
            if (array[i].doubleValue() > memory.doubleValue()) {
                memory = array[i];
            }
            leftToRight[i] = memory;
        }

        memory = array[array.length-1];
        for(int i = 1; i < array.length; i++) {
            if (array[array.length - 1 - i].doubleValue() > memory.doubleValue()) {
                memory = array[array.length - 1 - i];
            }
            rightToLeft[array.length - 1 - i] = memory;
        }

        float memory2;

        for(int i = 0; i < array.length; i++){
            if(leftToRight[i].doubleValue() > rightToLeft[i].doubleValue()){
                memory2 = rightToLeft[i].floatValue() - array[i].floatValue();
                result[i] = floatToGenericType(array[0], memory2);
            } else{
                memory2 = leftToRight[i].floatValue() - array[i].floatValue();
                result[i] = floatToGenericType(array[0], memory2);
            }
        }

        return result;
    }

    private static <T extends Number> T floatToGenericType(T nr1, float value2){
        Float value = value2;
        if(nr1 instanceof Float){
            return (T)(Number) (value);
        } else if(nr1 instanceof Double){
            return (T)(Number) (value.doubleValue());
        } else if(nr1 instanceof Integer){
            return (T)(Number) (value.intValue());
        } else if(nr1 instanceof Long){
            return (T)(Number) (value.longValue());
        } else if(nr1 instanceof Byte){
            return (T)(Number) (value.byteValue());
        } else if(nr1 instanceof Short){
            return (T)(Number) (value.shortValue());
        }
        return null;
    }
}
