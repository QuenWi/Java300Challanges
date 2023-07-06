package Rearrange_String_k_Distance_Apart;

public class Test_Rearrange_String_k_Distance_Apart {

    public static void main(String[] args) {
        test("I will see what this does.", 4);
        test("This one is not possible to create.", 6);
        test("When you write much text than you can see the pattern in, which the" +
                "algorithm works.", 3);
    }

    private static void test(String string, Integer distance){
        String result = Rearrange_String_k_Distance_Apart.rearrange_String_k_Distance_Apart(string, distance);

        System.out.println("Given: \"" + string + "\" and " + distance);
        System.out.println("Result: " + result);
    }
}
