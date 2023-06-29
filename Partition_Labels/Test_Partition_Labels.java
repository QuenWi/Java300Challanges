package Partition_Labels;

import Helpers.PrintArrayOrList;

public class Test_Partition_Labels {

    public static void main(String[] args) {
        test("aabceabfcuiioimnnnmt");
    }

    private static void test(String string){
        Integer[] result = Partition_Labels.partition_Labels(string);

        System.out.println("Given: " + string);
        System.out.println("Result: " + PrintArrayOrList.arrayToString(result));

        System.out.printf("Leads to: ");
        int memory = 0;
        for(int i : result){
            System.out.printf("[" + string.substring(memory, i+memory) + "], ");
            memory += i;
        }
    }
}
