package Remove_Duplicates_from_Sorted_Array_Advanced;

public class Remove_Duplicates_from_Sorted_Array_Advanced {

    //Allow in a sorted Array only a certain amount of multiple equal elements.
    public static <T> int remove_duplicates_from_sorted_array_advanced(T[] array, int maxMultiples){
        boolean first = true;
        int counter = 1;
        if(array.length == 0){
            return 0;
        }
        int result = 1;

        for(int i = 1; i < array.length; i++){
            if(!array[i].equals(array[result - 1])) { //We have here an Object, not an primitive variable
                counter = 1;
                if (result != i) {
                    array[result] = array[i];
                }
                result++;
            } else{
                if(counter != maxMultiples){
                    counter++;
                    if (result != i) {
                        array[result] = array[i];
                    }
                    result++;
                }
            }
        }
        return result;
    }
}
