package XSum_Shortest;

public class XSum_Shortest {

    //Find in an Array X elements, which is closest to the sum.
    //Implementation of 2Sum, 3Sum, 4Sum.
    public static <T extends Number> Integer[] xSum_Shortest(T[] array, T sum, int amount){
        Integer[] result = new Integer[amount];
        T memory;

        T shortest = subtraction(array[0], array[0]);;
        Integer[] result_Shortest = new Integer[amount];

        if(!(array.length < amount)){
            for(int i = 0; i < result.length; i++){
                result[i] = i;
            }
            Integer[] last = new Integer[amount];
            for(int i = 0; i < result.length; i++){
                last[last.length-1-i] = array.length-1-i;
            }
            boolean end = false;
            boolean firstTime = true;

            for(int i = 0; i < amount; i++){
                shortest = sum(shortest, array[i]);
                result_Shortest[i] = i;
            }

            while(!end){
                if(firstTime){ //skip the first time
                    result[result.length-1]++;
                    if(result[result.length-1] >= array.length){
                        int move = 1;
                        while(result[result.length-1-move] >= array.length-1-move){
                            move++;
                        }
                        result[result.length-1-move]++;
                        while(move != 0){
                            result[result.length-1-move+1] = result[result.length-1-move]+1;
                            move--;
                        }
                    }
                } else{
                    firstTime = false;
                }

                memory = subtraction(array[0], array[0]);
                for(int i = 0; i < result.length; i++){
                    memory = sum(memory, array[result[i]]);
                }
                if(memory.equals(sum)){
                    return result;
                }

                if(compare(subtraction(memory, sum), subtraction(shortest, sum))){
                    //System.out.println(subtraction(memory, sum) + " < " + subtraction(shortest, sum));
                    for(int i = 0; i < amount; i++){
                        result_Shortest[i] = result[i];
                    }

                    shortest = subtraction(array[0], array[0]);
                    for(int i = 0; i < amount; i++){
                        shortest = sum(shortest, array[result_Shortest[i]]);
                    }
                }

                end = true;
                for(int i = 0; i < result.length; i++){
                    if(!result[i].equals(last[i])){
                        end = false;
                        break;
                    }
                }
            }
        }

        return result_Shortest;
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

    public static <T extends Number> boolean compare(T nr1, T nr2){
        boolean result = false;
        if(nr1 instanceof Float){
            if(Math.abs(nr1.floatValue()) < Math.abs(nr2.floatValue())){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Double){
            if(Math.abs(nr1.doubleValue()) < Math.abs(nr2.doubleValue())){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Integer){
            if(Math.abs(nr1.intValue()) < Math.abs(nr2.intValue())){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Short){
            if(Math.abs(nr1.longValue()) < Math.abs(nr2.longValue())){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Byte){
            if(Math.abs(nr1.byteValue()) < Math.abs(nr2.byteValue())){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Short){
            if(Math.abs(nr1.shortValue()) < Math.abs(nr2.shortValue())){
                return true;
            } else{
                return false;
            }
        }
        return result;
    }
}
