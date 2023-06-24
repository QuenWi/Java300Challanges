package Russian_Doll_Envelopes;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Russian_Doll_Envelopes {

    //How many Dolls can you maximum put into eachother.
    public static <T extends Number> Integer russian_Doll_Envolopes(T[][] array){
        List<Envolope<T>> list = new ArrayList<Envolope<T>>();
        for(int i = 0; i < array.length; i++){
            list.add(new Envolope<T>(array[i][0], array[i][1]));
        }
        list.sort(new ForCompare<T>());
        Integer[] dolls = new Integer[array.length];
        dolls[0] = 1;
        Integer memory;
        Integer result = 1;
        for(int i = 0; i < array.length; i++){
            memory = 1;
            for(int j = i; j >= 0; j--){
                if(compare2(list.get(i).width, list.get(j).width)){
                    if(dolls[j] >= memory){
                        memory = dolls[j] + 1;
                    }
                }
            }
            dolls[i] = memory;
            if(memory > result){
                result = memory;
            }
        }
        return result;
    }

    private static class Envolope <T extends Number>{
        private T width;
        private T height;

        private Envolope(T width, T height){
            this.height = height;
            this.width = width;
        }
    }

    private static class ForCompare <T extends Number> implements Comparator<Envolope<T>>{

        @Override
        public int compare(Envolope<T> o1, Envolope<T> o2) {
            if(o1.height.floatValue() > o2.height.floatValue()){
                return 1;
            } else if(o1.height.floatValue() < o2.height.floatValue()) {
                return -1;
            } else {
                if (o1.height.floatValue() > o2.height.floatValue()) {
                    return 1;
                } else if (o1.height.floatValue() < o2.height.floatValue()) {
                    return -1;
                }
                return 0;
            }
        }
    }


    public static <T extends Number> boolean compare2(T nr1, T nr2){
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
