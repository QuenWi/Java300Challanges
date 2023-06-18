package Container_With_Most_Water;

public class Container_With_Most_Water {

    //If every Number is a height of a wall, then between which two walls you can trap the most water?
    public static <T extends Number> T container_With_Most_Water(T[] array){
        float max = 0;
        float memory;
        for(int i = 1; i < array.length; i++){
            if(array[i-1].floatValue() < array[i].floatValue()){
                memory = array[i-1].floatValue();
            } else{
                memory = array[i].floatValue();
            }
            if(memory > max){
                max = memory;
            }
        }

        return floatToGenericType(array[0], max);
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
