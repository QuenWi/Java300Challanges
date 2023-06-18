package Remove_Element;

public class Remove_Element {

    //remove in array this all entries equal to this element
    public static <T> int remove_Element(T[] array, T remove){
        int size = 0;
        for(int i = 0; i < array.length; i++){
            if(!remove.equals(array[i])){
                if(i != size){
                    array[size] = array[i];
                }
                size++;
            }
        }
        return size;
    }
}
