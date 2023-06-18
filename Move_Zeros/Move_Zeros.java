package Move_Zeros;

public class Move_Zeros {

    //Move all zeros to the end of an array (Tested on Float)
    public static <T extends Number> void move_Zeros(T[] array){
        int amountZeros = 0;
        int counter = 0;
        T zero = null;
        for(int i = 0; i < array.length; i++){
            //for all standard variable notations (f: float, d: double, l: long)
            if(array[i].equals(0f) || array[i].equals(0) || array[i].equals(0d) || array[i].equals(0l)){
                if(zero == null){
                    zero = array[i];
                }
                amountZeros++;
            } else{
                if(counter != i){
                    array[counter] = array[i];
                }
                counter++;
            }
        }

        for(int i = 0; i < amountZeros; i++){
            array[array.length - 1 - i] = zero;
        }

    }
}
