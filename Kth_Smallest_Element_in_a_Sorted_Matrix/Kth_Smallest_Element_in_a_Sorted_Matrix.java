package Kth_Smallest_Element_in_a_Sorted_Matrix;

public class Kth_Smallest_Element_in_a_Sorted_Matrix {

    //In a n*n Matrix sorted, return the k'th element
    public static <T extends Number> T kth_Smallest_Element_in_a_Sorted_Matrix(T[][] matrix, Integer wanted){
        int rowLength = matrix[0].length;
        return matrix[wanted/rowLength][wanted%rowLength];
    }
}
