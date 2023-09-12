package First_Missing_Positive;

public class First_Missing_Positive {

    //What is the first missing positive Integer in an Integer Array?
    public static Integer first_Missing_Positive(Integer[] array){
        boolean[] given = new boolean[array.length+2];
        for(Integer i : array){
            if(i > -1 && i < given.length) {
                given[i] = true;
            }
        }
        for(int i = 1; i < given.length; i++){
            if(given[i] != true){
                return i;
            }
        }
        return -1;
    }
}
