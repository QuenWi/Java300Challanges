package Search_a_2D_Matrix;

import Helpers.PrintArrayOrList;

public class Search_a_2D_Matrix {

    //Says if an element is in a sorted Matrix.
    //Sorted: the last element of each coloum is smaller than the first from the next. And in each coloum the elements are sorted.
    public static <T extends Number> Boolean search_a_2D_Matrix(T[][] matrix, T wanted){
        int bottom = 0;
        int top = matrix.length-1;
        int middle = -1;
        while(bottom != top){
            middle = (bottom+top)/2;
            if(compare(matrix[middle][0], wanted) && compare(wanted, matrix[middle+1][0])){
                break;
            }
            if(compare(matrix[middle][0], wanted)){
                if(bottom == middle){
                    middle = top;
                    break;
                } else{
                    bottom = middle;
                }
            } else{
                top = middle;
            }
        }
        T[] checkArray = matrix[middle];
        //System.out.println(PrintArrayOrList.arrayToString(checkArray));
        top = checkArray.length-1;
        bottom = 0;
        while(top != bottom){
            middle = (top + bottom)/2;
            if(wanted.equals(checkArray[middle])){
                return true;
            }
            if(compare(checkArray[middle], wanted)){
                if(bottom == middle){
                    if(wanted.equals(checkArray[top])){
                        return true;
                    }
                    break;
                }
                bottom = middle;
            } else{
                top = middle;
            }
        }
        return false;
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
