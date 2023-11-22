package Unique_Binary_Search_Trees;

public class Test_Unique_Binary_Search_Trees {

    public static void main(String[] args) {
        test(2);
        test(3);
        test(5);
    }

    private static void test(Integer amountOfElements){
        Integer result = Unique_Binary_Search_Trees.unique_Binary_Search_Trees(amountOfElements);

        System.out.println("Given: " + amountOfElements.toString());
        System.out.println("Result: " + result.toString());
    }
}
