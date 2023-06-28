package Maximum_Product_Subarray;

public class Maximum_Product_Subarray {

    //What is the maximum product of any possible coninues subarray.
    public static <T extends Number> T maximum_Product_Subarray(T[] array){
        Integer firstNegative = -1;
        Integer lastNegative = -1;
        Integer amountNegative = 0;
        T zero = subtraction(array[0], array[0]);
        for(int i = 0; i < array.length; i++){
            if(compare(array[i], zero)){
                if(firstNegative.equals(-1)){
                    firstNegative = i;
                } else{
                    lastNegative = i;
                }
                amountNegative++;
            }
        }
        if(amountNegative%2 == 0){
            T result = division(array[0], array[0]);
            for(int i = 0; i < array.length; i++){
                result = product(result, array[i]);
            }
            return result;
        } else{
            if(lastNegative.equals(-1)){
                T memory = division(array[0], array[0]);
                T memory2 = division(array[0], array[0]);
                for(int i = 0; i < firstNegative; i++) {
                    memory = product(memory, array[i]);
                }
                for(int i = firstNegative+1; i < array.length; i++) {
                    memory2 = product(memory2, array[i]);
                }
                if(compare(memory, memory2)){
                    return memory2;
                } else{
                    return memory;
                }
            } else{
                T memory = division(array[0], array[0]);
                T memory2 = division(array[0], array[0]);
                T result = division(array[0], array[0]);
                for(int i = 0; i < firstNegative+1; i++) {
                    memory = product(memory, array[i]);
                }
                for(int i = lastNegative; i < array.length; i++) {
                    memory2 = product(memory2, array[i]);
                }
                if(compare(memory2, memory)){
                    for(int i = firstNegative+1; i < array.length; i++) {
                        result = product(result, array[i]);
                    }
                } else{
                    for(int i = 0; i < lastNegative-1; i++) {
                        result = product(result, array[i]);
                    }
                }
                return result;
            }
        }
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
}
