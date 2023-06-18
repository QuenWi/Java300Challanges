package XSum;

import Helpers.PrintArrayOrList;

public class XSum {

    //Find in an Array X elements, which have exactly the Sum.
    //Implementation of 2Sum, 3Sum, 4Sum.
    public static <T extends Number> Integer[] xSum(T[] array, T sum, int amount){
        Integer[] result = new Integer[amount];
        T memory;

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
                end = true;
                for(int i = 0; i < result.length; i++){
                    if(!result[i].equals(last[i])){
                        end = false;
                        break;
                    }
                }
            }
        }

        //No solution found
        for(int i = 0; i < result.length; i++){
            result[i] = -1;
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
