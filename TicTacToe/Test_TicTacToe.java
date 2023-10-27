package TicTacToe;

public class Test_TicTacToe {

    public static void main(String[] args) {
        test();
    }

    private static void test(){
        TicTacToe ticTacToe = new TicTacToe();
        System.out.println(ticTacToe.insert(1, 1));
        System.out.println(ticTacToe.insert(0, 1));
        System.out.println(ticTacToe.insert(1, 0));
        System.out.println(ticTacToe.insert(1, 2));
        System.out.println(ticTacToe.insert(2, 2));
        System.out.println(ticTacToe.insert(0, 0));
        System.out.println(ticTacToe.insert(0, 2));
        System.out.println(ticTacToe.insert(2, 0));
        System.out.println(ticTacToe.insert(2, 1));

        System.out.println(ticTacToe.insert(1, 1));
        System.out.println(ticTacToe.insert(1, 0));
        System.out.println(ticTacToe.insert(0, 0));
        System.out.println(ticTacToe.insert(2, 2));
        System.out.println(ticTacToe.insert(0, 1));
        System.out.println(ticTacToe.insert(0, 2));
        System.out.println(ticTacToe.insert(2, 1));
    }
}
