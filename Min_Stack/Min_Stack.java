package Min_Stack;

public class Min_Stack <E extends Number>{

    Node top;

    public void push(E element){
        Node newNode = new Node(element, top);
        top = newNode;
    }

    public E pop(){
        E element = top.element;
        top = top.next;
        return element;
    }

    public E peek(){
        E element = top.element;
        return element;
    }

    public E getMin(){
        E element = top.element;
        Node checkNode = top;
        while(checkNode != null){
            if(compare(checkNode.element, element)){
                element = checkNode.element;
            }
            checkNode = checkNode.next;
        }
        return element;
    }

    private class Node{
        E element;
        Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
    }

    public Min_Stack() {
        top = null;
    }

    public static <T extends Number> boolean compare(T nr1, T nr2){
        boolean result = false;
        if(nr1 instanceof Float){
            if(nr1.floatValue() < nr2.floatValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Double){
            if(nr1.doubleValue() < nr2.doubleValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Integer){
            if(nr1.intValue() < nr2.intValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Short){
            if(nr1.longValue() < nr2.longValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Byte){
            if(nr1.byteValue() < nr2.byteValue()){
                return true;
            } else{
                return false;
            }
        } else if(nr1 instanceof Short){
            if(nr1.shortValue() < nr2.shortValue()){
                return true;
            } else{
                return false;
            }
        }
        return result;
    }
}
