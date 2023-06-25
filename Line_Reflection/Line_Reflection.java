package Line_Reflection;

import java.util.ArrayList;
import java.util.List;

public class Line_Reflection {

    //Is there any line parallel to the y axis possible, so each point gets mirrored?
    public static <T extends Number> Boolean line_Reflection(T[][] array){
        List<Point<T>> list = new ArrayList<Point<T>>();
        T middle = subtraction(array[0][0], array[0][0]);
        for(int i = 0; i < array.length; i++){
            list.add(new Point<T>(array[i][0], array[i][1]));
            middle = sum(middle, array[i][0]);
        }
        middle = division(middle, array.length); //mirror x position
        for(int i = 0; i < list.size(); i++){
            boolean skip = false;
            if(!list.get(i).hasMirror){
                for(int j = i + 1; j < list.size(); j++){
                    if(!list.get(j).hasMirror){
                        if(list.get(i).isMirror(list.get(j), middle) && list.get(i).y.equals(list.get(j).y)){
                            list.get(j).hasMirror = true;
                            skip = true;
                            continue;
                        }
                    }
                }
            } else{
                continue;
            }
            if(!skip){
                return false;
            }
        }
        return true;
    }

    private static class Point <T extends Number>{
        private T x;
        private T y;
        private boolean hasMirror;

        private Point(T x, T y){
            this.x = x;
            this.y = y;
            hasMirror = false;
        }

        private boolean isMirror(Point point, T middle){
            if(point.x.equals(subtraction(sum(middle, middle), x))){
                return true;
            } else {
                return false;
            }
        }
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

    private static <T extends Number> T division(T nr1, Integer nr2){
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
}
