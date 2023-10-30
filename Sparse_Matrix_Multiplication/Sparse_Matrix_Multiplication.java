package Sparse_Matrix_Multiplication;

import java.lang.reflect.Array;

public class Sparse_Matrix_Multiplication {

    //calculate a matrix multiplication
    public static <T extends Number> T[][] sparse_Matrix_Multiplication(T[][] matrix1, T[][] matrix2){
        T[][] result = (T[][]) Array.newInstance(matrix1[0][0].getClass(), matrix1.length, matrix2[0].length);
        for(int y = 0; y < result.length; y++){
            for(int x = 0; x < result[0].length; x++){
                setEntry(matrix1, matrix2, result, x, y);
            }
        }
        return result;
    }

    private static <T extends Number> void setEntry(T[][] matrix1, T[][] matrix2, T[][] result, int x, int y){
        T entry = subtraction(matrix1[0][0], matrix1[0][0]);
        for(int i = 0; i < matrix2.length; i++){
            entry = sum(entry, product(matrix1[y][i], matrix2[i][x]));
        }
        result[y][x] = entry;
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
}
