package Product_of_Array_Except_Self;

import java.lang.reflect.Array;

public class Product_of_Array_Except_Self {

    //Calculate the product of all element of the array, except the item at this specific space.
    public static <T extends Number> T[] product_of_array_except_self(T[] array){
        T[] result = (T[]) (Array.newInstance(array.getClass().getComponentType(), array.length));
        T product = division(array[0], array[0]); //1
        for(int i = 1; i < array.length; i++){
            product = product(product, array[i]);
        }
        result[0] = product;
        for(int i = 1; i < array.length; i++){
            product = division(product, array[i]);
            product = product(product, array[i-1]);
            result[i] = product;
        }
        return result;
    }

    private static <T extends Number> T product(T nr1, T nr2){
        if(nr1 instanceof Float){
            return (T)(Number) (nr1.floatValue() * nr2.floatValue());
        } else if(nr1 instanceof Double){
            return (T)(Number) (nr1.doubleValue() * nr2.doubleValue());
        } else if(nr1 instanceof Integer){
            return (T)(Number) (nr1.intValue() * nr2.intValue());
        } else if(nr1 instanceof Long){
            return (T)(Number) (nr1.longValue() * nr2.longValue());
        } else if(nr1 instanceof Byte){
            return (T)(Number) (nr1.byteValue() * nr2.byteValue());
        } else if(nr1 instanceof Short){
            return (T)(Number) (nr1.shortValue() * nr2.shortValue());
        }
        return null;
    }

    private static <T extends Number> T division(T nr1, T nr2){
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
}
