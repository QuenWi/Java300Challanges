package Min_Stack;

public class Test_Min_Stack {

    public static void main(String[] args) {
        test();
    }

    private  static void test(){
        Min_Stack<Float> minStack = new Min_Stack<Float>();
        minStack.push(4f);
        minStack.push(4.4f);
        minStack.push(3.5f);
        minStack.push(5.1f);
        System.out.println(minStack.pop());
        System.out.println(minStack.pop());
        System.out.println(minStack.peek());
        minStack.push(3.3f);
        minStack.push(5.3f);
        minStack.push(4.8f);
        System.out.println(minStack.pop());
        System.out.println(minStack.peek());
        System.out.println(minStack.getMin());
    }
}
