package Helpers;

import java.util.List;
import java.util.Objects;

public class PrintArrayOrList {
    public static<T> String arrayToString(T[] array){
        if(array == null){
            return "null";
        }
        if(array.length > 0){
            String s = "[";
            boolean first = true;
            for(T item : array){
                if(first){
                    first = false;
                    s += item.toString();
                } else{
                    s += ", " + item.toString();
                }
            }
            s += "]";
            return s;
        }
        return "[]";
    }

    public static String listToString(List<?> list){
        if(list == null){
            return "null";
        }
        if(list.size() > 0){
            String s = "[";
            boolean first = true;
            for(Object item : list){
                if(first){
                    first = false;
                    s += item.toString();
                } else{
                    s += ", " + item.toString();
                }
            }
            s += "]";
            return s;
        }
        return "[]";
    }
}
