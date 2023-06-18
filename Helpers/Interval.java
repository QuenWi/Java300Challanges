package Helpers;

import java.util.ArrayList;
import java.util.List;

public class Interval<E extends Number>{
    private E topLimit;
    private E bottomLimit;

    public Interval(){}

    public Interval(E bottomLimit, E topLimit) {
        this.topLimit = topLimit;
        this.bottomLimit = bottomLimit;
    }

    public boolean includes(E obj){
        boolean result = false;
        if(bottomLimit instanceof Float){
            if(obj.floatValue() <= topLimit.floatValue() && obj.floatValue() >= bottomLimit.floatValue()){
                return true;
            } else{
                return false;
            }
        } else if(bottomLimit instanceof Double){
            if(obj.doubleValue() <= topLimit.doubleValue() && obj.doubleValue() >= bottomLimit.doubleValue()){
                return true;
            } else{
                return false;
            }
        } else if(bottomLimit instanceof Integer){
            if(obj.intValue() <= topLimit.intValue() && obj.intValue() >= bottomLimit.intValue()){
                return true;
            } else{
                return false;
            }
        } else if(bottomLimit instanceof Long){
            if(obj.longValue() <= topLimit.longValue() && obj.longValue() >= bottomLimit.longValue()){
                return true;
            } else{
                return false;
            }
        } else if(bottomLimit instanceof Byte){
            if(obj.byteValue() <= topLimit.byteValue() && obj.byteValue() >= bottomLimit.byteValue()){
                return true;
            } else{
                return false;
            }
        } else if(bottomLimit instanceof Short){
            if(obj.shortValue() <= topLimit.shortValue() && obj.shortValue() >= bottomLimit.shortValue()){
                return true;
            } else{
                return false;
            }
        }
        return result;
    }

    public <T extends Number> boolean includes(Interval<T> obj){
        boolean result = false;
        if(bottomLimit instanceof Float){
            if(obj.getBottomLimit().floatValue() <= topLimit.floatValue() && obj.getBottomLimit().floatValue() >= bottomLimit.floatValue()
            || obj.getTopLimit().floatValue() <= topLimit.floatValue() && obj.getTopLimit().floatValue() >= bottomLimit.floatValue()){
                return true;
            } else{
                return false;
            }
        } else if(bottomLimit instanceof Double){
            if(obj.getBottomLimit().doubleValue() <= topLimit.doubleValue() && obj.getBottomLimit().doubleValue() >= bottomLimit.doubleValue()
                    || obj.getTopLimit().doubleValue() <= topLimit.doubleValue() && obj.getTopLimit().doubleValue() >= bottomLimit.doubleValue()){
                return true;
            } else{
                return false;
            }
        } else if(bottomLimit instanceof Integer){
            if(obj.getBottomLimit().intValue() <= topLimit.intValue() && obj.getBottomLimit().intValue() >= bottomLimit.intValue()
                    || obj.getTopLimit().intValue() <= topLimit.intValue() && obj.getTopLimit().intValue() >= bottomLimit.intValue()){
                return true;
            } else{
                return false;
            }
        } else if(bottomLimit instanceof Long){
            if(obj.getBottomLimit().longValue() <= topLimit.longValue() && obj.getBottomLimit().longValue() >= bottomLimit.longValue()
                    || obj.getTopLimit().longValue() <= topLimit.longValue() && obj.getTopLimit().longValue() >= bottomLimit.longValue()){
                return true;
            } else{
                return false;
            }
        } else if(bottomLimit instanceof Byte){
            if(obj.getBottomLimit().byteValue() <= topLimit.byteValue() && obj.getBottomLimit().byteValue() >= bottomLimit.byteValue()
                    || obj.getTopLimit().byteValue() <= topLimit.byteValue() && obj.getTopLimit().byteValue() >= bottomLimit.byteValue()){
                return true;
            } else{
                return false;
            }
        } else if(bottomLimit instanceof Short){
            if(obj.getBottomLimit().shortValue() <= topLimit.shortValue() && obj.getBottomLimit().shortValue() >= bottomLimit.shortValue()
                    || obj.getTopLimit().shortValue() <= topLimit.shortValue() && obj.getTopLimit().shortValue() >= bottomLimit.shortValue()){
                return true;
            } else{
                return false;
            }
        }
        return result;
    }

    public E getTopLimit() {
        return topLimit;
    }
    public void setTopLimit(E topLimit) {
        this.topLimit = topLimit;
    }
    public E getBottomLimit() {
        return bottomLimit;
    }
    public void setBottomLimit(E bottomLimit) {
        this.bottomLimit = bottomLimit;
    }

    @Override
    public String toString(){
        if(bottomLimit.equals(topLimit)){
            return "[" + bottomLimit.toString() + "]";
        }
        return "[" + bottomLimit.toString() + ", " + topLimit.toString() + "]";
    }

    public static <T extends Number> String listToString(List<Interval<T>> list){
        if(list == null){
            return "null";
        }
        String s = "";
        if(list.size() != 0){
            s = "{" + list.get(0).toString();
            for(int i = 1; i < list.size(); i++){
                s += ", " + list.get(i).toString();
            }
            s += "}";
        }
        return s;
    }

    //creates a deep copy
    public static <T extends Number> List<Interval<T>> copyIntervalList(List<Interval<T>> list){
        if(list == null){
            return null;
        }
        List<Interval<T>> result = new ArrayList<Interval<T>>();
        for(Interval<T> item : list){
            result.add(new Interval<T>(item.getBottomLimit(), item.getTopLimit()));
        }
        return result;
    }
}


