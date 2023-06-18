package Candy;

public class Candy {

    //Imagine each element is a ranking. You always should get less candy than a better neightbour and more than a worse
    //Here used the System that sees lower numbers as better marks and higher numbers as worse marks.
    public static <T extends Number> int[] candy(T[] array){
        int[] result = new int[array.length];
        for(int i = 1; i < array.length; i++){
            if(array[i].equals(array[i-1])){
                result[i] = result[i-1];
            } else if(array[i].doubleValue() > array[i-1].doubleValue()){
                result[i] = result[i-1] - 1;
            } else{
                result[i] = result[i-1] + 1;
            }
        }
        int smallest = 0;
        for(int i = 1; i < array.length; i++){
            if(result[i] < smallest){
                smallest = result[i];
            }
        }
        for(int i = 0; i < array.length; i++){
            result[i] -= smallest - 1;
        }
        return result;
    }

}
