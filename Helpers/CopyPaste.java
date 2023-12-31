package Helpers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CopyPaste {

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

    private static <T extends Number> T module(T nr1, T nr2){
        if(nr1 instanceof Float){
            return (T)(Number) (nr1.floatValue() % nr2.floatValue());
        } else if(nr1 instanceof Double){
            return (T)(Number) (nr1.doubleValue() % nr2.doubleValue());
        } else if(nr1 instanceof Integer){
            return (T)(Number) (nr1.intValue() % nr2.intValue());
        } else if(nr1 instanceof Long){
            return (T)(Number) (nr1.longValue() % nr2.longValue());
        } else if(nr1 instanceof Byte){
            return (T)(Number) (nr1.byteValue() % nr2.byteValue());
        } else if(nr1 instanceof Short){
            return (T)(Number) (nr1.shortValue() % nr2.shortValue());
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

    private static <T extends Number> T square(T nr){
        if(nr instanceof Float){
            return (T)(Number) ((Double)(Math.sqrt(nr.doubleValue()))).floatValue();
        } else if(nr instanceof Double){
            return (T)(Number) ((Double)(Math.sqrt(nr.doubleValue()))).doubleValue();
        } else if(nr instanceof Integer){
            return (T)(Number) ((Double)(Math.sqrt(nr.doubleValue()))).intValue();
        } else if(nr instanceof Long){
            return (T)(Number) ((Double)(Math.sqrt(nr.doubleValue()))).longValue();
        } else if(nr instanceof Byte){
            return (T)(Number) ((Double)(Math.sqrt(nr.doubleValue()))).byteValue();
        } else if(nr instanceof Short){
            return (T)(Number) ((Double)(Math.sqrt(nr.doubleValue()))).shortValue();
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

    private static <T extends Number> Comparator<T> comparator(T nr1){
        if(nr1 instanceof Float){
            return new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    return Float.compare(o1.floatValue(), o2.floatValue());
                }
            };
        } else if(nr1 instanceof Double){
            return new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    return Double.compare(o1.doubleValue(), o2.doubleValue());
                }
            };
        } else if(nr1 instanceof Integer){
            return new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    return Integer.compare(o1.intValue(), o2.intValue());
                }
            };
        } else if(nr1 instanceof Long){
            return new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    return Long.compare(o1.longValue(), o2.longValue());
                }
            };
        } else if(nr1 instanceof Byte){
            return new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    return Byte.compare(o1.byteValue(), o2.byteValue());
                }
            };
        } else if(nr1 instanceof Short){
            return new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    return Short.compare(o1.shortValue(), o2.shortValue());
                }
            };
        }
        return null;
    }

    private static <T> List<T> cutList(List<T> list, int from, int to){
        List<T> result = new ArrayList<>();
        for(int i = from; i <= to; i++){
            result.add(list.get(i));
        }
        return result;
    }

    //copy an array of a generic Type
    //result = (T[]) (Array.newInstance(array.getClass().getComponentType(), array.length));
    //T[][] result = (T[][]) Array.newInstance(matrix[0][0].getClass(), matrix.length, matrix.length);

    //Not good, because it can lead to small calculation mistakes
    /*private static <T extends Number> T floatToGenericType(T nr1, float value2){
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
    }*/


    //Old Versions, worse
    /*private static <T extends Number> T sum(T nr1, T nr2){
        Float f = 0f;
        Double d = 0d;
        Integer i = 0;
        Long l = 0l;
        Byte b = 0;
        Short s = 0;
        T sum = null;
        if(nr1.getClass().getComponentType() == f.getClass().getComponentType()){
            sum = (T)(Number) (nr1.floatValue() + nr2.floatValue());
        } else if(nr1.getClass().getComponentType() == d.getClass().getComponentType()){
            sum = (T)(Number) (nr1.doubleValue() + nr2.doubleValue());
        } else if(nr1.getClass().getComponentType() == i.getClass().getComponentType()){
            sum = (T)(Number) (nr1.intValue() + nr2.intValue());
        } else if(nr1.getClass().getComponentType() == l.getClass().getComponentType()){
            sum = (T)(Number) (nr1.longValue() + nr2.longValue());
        } else if(nr1.getClass().getComponentType() == b.getClass().getComponentType()){
            sum = (T)(Number) (nr1.byteValue() + nr2.byteValue());
        } else if(nr1.getClass().getComponentType() == s.getClass().getComponentType()){
            sum = (T)(Number) (nr1.shortValue() + nr2.shortValue());
        }
        return sum;
    }

    private static <T extends Number> T subtraction(T nr1, T nr2){
        Float f = 0f;
        Double d = 0d;
        Integer i = 0;
        Long l = 0l;
        Byte b = 0;
        Short s = 0;
        T sum = null;
        if(nr1.getClass().getComponentType() == f.getClass().getComponentType()){
            sum = (T)(Number) (nr1.floatValue() - nr2.floatValue());
        } else if(nr1.getClass().getComponentType() == d.getClass().getComponentType()){
            sum = (T)(Number) (nr1.doubleValue() - nr2.doubleValue());
        } else if(nr1.getClass().getComponentType() == i.getClass().getComponentType()){
            sum = (T)(Number) (nr1.intValue() - nr2.intValue());
        } else if(nr1.getClass().getComponentType() == l.getClass().getComponentType()){
            sum = (T)(Number) (nr1.longValue() - nr2.longValue());
        } else if(nr1.getClass().getComponentType() == b.getClass().getComponentType()){
            sum = (T)(Number) (nr1.byteValue() - nr2.byteValue());
        } else if(nr1.getClass().getComponentType() == s.getClass().getComponentType()){
            sum = (T)(Number) (nr1.shortValue() - nr2.shortValue());
        }
        return sum;
    }

    private static <T extends Number> T product(T nr1, T nr2){
        Float f = 0f;
        Double d = 0d;
        Integer i = 0;
        Long l = 0l;
        Byte b = 0;
        Short s = 0;
        T sum = null;
        if(nr1.getClass().getComponentType() == f.getClass().getComponentType()){
            sum = (T)(Number) (nr1.floatValue() * nr2.floatValue());
        } else if(nr1.getClass().getComponentType() == d.getClass().getComponentType()){
            sum = (T)(Number) (nr1.doubleValue() * nr2.doubleValue());
        } else if(nr1.getClass().getComponentType() == i.getClass().getComponentType()){
            sum = (T)(Number) (nr1.intValue() * nr2.intValue());
        } else if(nr1.getClass().getComponentType() == l.getClass().getComponentType()){
            sum = (T)(Number) (nr1.longValue() * nr2.longValue());
        } else if(nr1.getClass().getComponentType() == b.getClass().getComponentType()){
            sum = (T)(Number) (nr1.byteValue() * nr2.byteValue());
        } else if(nr1.getClass().getComponentType() == s.getClass().getComponentType()){
            sum = (T)(Number) (nr1.shortValue() * nr2.shortValue());
        }
        return sum;
    }

    private static <T extends Number> T division(T nr1, T nr2){
        Float f = 0f;
        Double d = 0d;
        Integer i = 0;
        Long l = 0l;
        Byte b = 0;
        Short s = 0;
        T sum = null;
        if(nr1.getClass().getComponentType() == f.getClass().getComponentType()){
            sum = (T)(Number) (nr1.floatValue() / nr2.floatValue());
        } else if(nr1.getClass().getComponentType() == d.getClass().getComponentType()){
            sum = (T)(Number) (nr1.doubleValue() / nr2.doubleValue());
        } else if(nr1.getClass().getComponentType() == i.getClass().getComponentType()){
            sum = (T)(Number) (nr1.intValue() / nr2.intValue());
        } else if(nr1.getClass().getComponentType() == l.getClass().getComponentType()){
            sum = (T)(Number) (nr1.longValue() / nr2.longValue());
        } else if(nr1.getClass().getComponentType() == b.getClass().getComponentType()){
            sum = (T)(Number) (nr1.byteValue() / nr2.byteValue());
        } else if(nr1.getClass().getComponentType() == s.getClass().getComponentType()){
            sum = (T)(Number) (nr1.shortValue() / nr2.shortValue());
        }
        return sum;
    }

    public static <T extends Number> boolean compare(T nr1, T nr2){
        Float f = 0f;
        Double d = 0d;
        Integer i = 0;
        Long l = 0l;
        Byte b = 0;
        Short s = 0;
        boolean result = false;
        if(nr1.getClass().getComponentType() == f.getClass().getComponentType()){
            if(nr1.floatValue() < nr2.floatValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1.getClass().getComponentType() == d.getClass().getComponentType()){
            if(nr1.doubleValue() < nr2.doubleValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1.getClass().getComponentType() == i.getClass().getComponentType()){
            if(nr1.intValue() < nr2.intValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1.getClass().getComponentType() == l.getClass().getComponentType()){
            if(nr1.longValue() < nr2.longValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1.getClass().getComponentType() == b.getClass().getComponentType()){
            if(nr1.byteValue() < nr2.byteValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1.getClass().getComponentType() == s.getClass().getComponentType()){
            if(nr1.shortValue() < nr2.shortValue()){
                return true;
            } else{
                return false;
            }
        }
        return result;
    }*/
}
