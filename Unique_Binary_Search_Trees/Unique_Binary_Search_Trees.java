package Unique_Binary_Search_Trees;

public class Unique_Binary_Search_Trees {

    //How many structures of trees you can with n elements? (only the shape of  the trees mater)
    public static Integer unique_Binary_Search_Trees(Integer amountOfElements){
        Integer result = possibilities(amountOfElements);

        return result;
    }

    public static int possibilities(int elementsLeft){
        if(elementsLeft == 1){
            return 1;
        } else if(elementsLeft == 0){
            return 0;
        }
        else{
            elementsLeft--;
            int sum = 0;
            for(int i = 0; i <= elementsLeft; i++){
                if(i != elementsLeft-i){
                    sum += possibilities(i);
                    sum += possibilities(elementsLeft-i);
                } else{
                    sum += possibilities(i);
                }
            }
            return sum;
        }
    }
}
