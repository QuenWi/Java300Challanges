package Median_of_Two_Sorted_Arrays;

public class Median_of_Two_Sorted_Arrays {

    //Gets the median of two sorted arrays.

    //FALSE
    public static <T extends Number> T median_of_Two_Sorted_Arrays(T[] array1, T[] array2){
        int counter = 0;
        int counterArray1 = 0;
        int counterArray2 = 0;
        boolean firstArray = true;
        boolean overfit = false;
        int length = array1.length + array2.length;
        while(counter < length/2){
            if (counterArray1 >= array1.length) {
                overfit = true;
                firstArray = false;
                counterArray2++;
            } else if (counterArray2 >= array2.length) {
                overfit = true;
                firstArray = true;
                counterArray1++;
            }
             else if(compare(array1[counterArray1], array2[counterArray2])){
                firstArray = true;
                counterArray1++;
            } else{
                firstArray = false;
                counterArray2++;
            }
            counter++;
        }
        if(length%2 == 1){
            if(firstArray){
                return array1[counterArray1];
            } else {
                return array2[counterArray2];
            }
        } else{
            if (overfit) {
                if(firstArray){
                    return average(array1[counterArray1], array1[counterArray1-1]);
                } else{
                    return average(array1[counterArray2], array1[counterArray2-1]);
                }
            } else{
                return average(array1[counterArray1], array2[counterArray2]);
            }
        }
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

    private static <T extends Number> T average(T nr1, T nr2){
        if(nr1 instanceof Float){
            return (T)(Number) ((nr1.floatValue() + nr2.floatValue())/2);
        } else if(nr1 instanceof Double){
            return (T)(Number) ((nr1.doubleValue() + nr2.doubleValue())/2);
        } else if(nr1 instanceof Integer){
            return (T)(Number) ((nr1.intValue() + nr2.intValue())/2);
        } else if(nr1 instanceof Long){
            return (T)(Number) ((nr1.longValue() + nr2.longValue())/2);
        } else if(nr1 instanceof Byte){
            return (T)(Number) ((nr1.byteValue() + nr2.byteValue())/2);
        } else if(nr1 instanceof Short){
            return (T)(Number) ((nr1.shortValue() + nr2.shortValue())/2);
        }
        return null;
    }
}
