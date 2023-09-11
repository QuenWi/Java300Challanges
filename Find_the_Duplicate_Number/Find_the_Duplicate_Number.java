package Find_the_Duplicate_Number;

public class Find_the_Duplicate_Number {

    //Given is an unsorted Integer Array, with all the numbers between 1 and n. But one number is included twice.
    public static Integer find_the_Duplicate_Number(Integer[] array){
        int givenSum = 0;
        for(Integer i : array){
            givenSum += i;
        }
        int wantedSum = (array.length-1)/2 * ((array.length-1)/2 + (array.length-1)/2+1);
        if((array.length-1) % 2 == 1){  //1 + 2 + 3 + 4 + 5
            wantedSum += array.length-1;
        }
        return givenSum -wantedSum;
    }
}
