package First_Bad_Version;

public class First_Bad_Version {

    //Finds the first bad Version. It uses as help the Version class
    public static Integer first_Bad_Version(Version[] array){
        //I assume that the BadVersion has a high number. So that it isn't to long ago.
        //Therefor I don't use the binary search first.
        //First I go from the top all 5% quartiles and look in which it is, than I do inside that one a binary search.
        if(!array[array.length - 2].isBadVersion()){
            return array.length-1;
        }
        int fivePercent = array.length/20;
        if(fivePercent < 2){
            fivePercent = 2;
        }
        int result = array.length-1;
        result -= fivePercent;
        while(result >= 0 && array[result].isBadVersion()){
            result -= fivePercent;
        }
        if(result < 0){
            result = 0;
        }
        //binary search
        int bottom = result;
        int top = result+fivePercent;
        int min = bottom;
        int max = top;
        if(top > array.length-1){
            top = array.length-1;
        }
        while (true){
            result = (bottom+top)/2;
            if(array[result].isBadVersion()){
                max = result;
                top = result;
            } else{
                min = result;
                bottom = result;
            }
            if(max - min == 1){
                return max;
            }
        }
    }
}
