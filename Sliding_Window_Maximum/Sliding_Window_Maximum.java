package Sliding_Window_Maximum;

import java.util.LinkedList;
import java.util.List;

public class Sliding_Window_Maximum<T> {
    private T[] array;
    private LinkedList<T> result = new LinkedList<>();
    private int counter = 0;
    private int size;

    public Sliding_Window_Maximum(T[] array, Integer size) {
        this.array = array;
        this.size = size;
    }

    public void next(){
        if(counter < array.length){
            result.addLast(array[counter]);
            counter++;
            if(result.size() > size){
                result.removeFirst();
            }
        } else if(result.size() != 0){
            result.removeFirst();
        } else{
            counter = 0;
            result.addLast(array[counter]);
            counter++;
        }
    }

    public List<T> getResult() {
        return result;
    }
}
