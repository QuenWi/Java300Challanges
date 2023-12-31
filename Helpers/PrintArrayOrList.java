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
                    if(item == null){
                        s += "null";
                    } else{
                        s += item.toString();
                    }
                } else{
                    if(item == null){
                        s += ", null";
                    } else{
                        s += ", " + item.toString();
                    }
                }
            }
            s += "]";
            return s;
        }
        return "[]";
    }

    public static<T> String arrayMatrixToString(T[][] array){
        if(array == null){
            return "null";
        }
        if(array.length > 0){
            String s = "[";
            boolean first = true;
            for(T[] item : array){
                if(first){
                    first = false;
                    s += PrintArrayOrList.arrayToString(item);
                } else{
                    s += ", " + PrintArrayOrList.arrayToString(item);
                }
            }
            s += "]";
            return s;
        }
        return "[]";
    }

    public static<T> String arrayMapAsMatrixToString(T[][] array){
        if(array == null){
            return "null";
        }
        if(array.length > 0){
            String s = "[\n";
            boolean first = true;
            for(T[] item : array){
                if(first){
                    first = false;
                    s += PrintArrayOrList.arrayToString(item);
                } else{
                    s += ",\n" + PrintArrayOrList.arrayToString(item);
                }
            }
            s += "\n]";
            return s;
        }
        return "[]";
    }

    public static <T> String listToString(List<T> list){
        if(list == null){
            return "null";
        }
        if(list.size() > 0){
            String s = "[";
            boolean first = true;
            for(Object item : list){
                if(first){
                    first = false;
                    if(item == null){
                        s += "null";
                    } else{
                        s += item.toString();
                    }
                } else{
                    if(item == null){
                        s += ", null";
                    } else{
                        s += ", " + item.toString();
                    }
                }
            }
            s += "]";
            return s;
        }
        return "[]";
    }


    public static <T> String listMatrixToString(List<List<T>> list){
        if(list == null){
            return "null";
        }
        if(list.size() > 0){
            String s = "[";
            boolean first = true;
            for(List<T> item : list){
                if(first){
                    first = false;
                    s += PrintArrayOrList.listToString(item);
                } else{
                    s += ", " + PrintArrayOrList.listToString(item);
                }
            }
            s += "]";
            return s;
        }
        return "[]";
    }
}
