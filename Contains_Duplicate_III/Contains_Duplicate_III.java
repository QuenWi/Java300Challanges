package Contains_Duplicate_III;

public class Contains_Duplicate_III {

    //Does the array has a two values that have a distance in the array k and a value difference of l?
    public static <T extends Number> Boolean contains_Duplicate_III(T[] array, T maxValueDiff, Integer maxPositionDiff){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j <= i + maxPositionDiff; j++){
                if(j < array.length){
                    if(compare(absolute(subtraction(array[i], array[j])), maxPositionDiff)){
                        //System.out.println(array[i] + " " + array[j]);
                        return true;
                    }
                }
            }
        }
        return false;
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
