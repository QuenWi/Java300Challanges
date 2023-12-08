package Implement_a_Queue_using_an_Array_in_Java;

import java.lang.reflect.Array;

public class Implement_a_Queue_using_an_Array_in_Java {

    //Implementing a Queue using an Array
    public void implement_a_Queue_using_an_Array_in_Java(){
        QueueViaArray<Integer> queueViaArray = new QueueViaArray<Integer>(10);
        queueViaArray.push(1);
        queueViaArray.push(2);
        queueViaArray.push(3);
        System.out.println(queueViaArray);
        queueViaArray.pop();
        System.out.println(queueViaArray);
        queueViaArray.push(4);
        queueViaArray.pop();
        queueViaArray.push(5);
        System.out.println(queueViaArray);
        for(int i = 6; i < 12; i++){
            queueViaArray.pop();
            queueViaArray.push(i);
        }
        System.out.println(queueViaArray);
    }

    private class QueueViaArray<E>{
        E[] data;
        int bottomPos, topPos;

        private void push(E element){
            data[topPos] = element;
            topPos++;
            if(topPos == data.length){
                topPos = 0;
            }
        }

        private void pop(){
            data[bottomPos] = null;
            bottomPos++;
            if(bottomPos == data.length){
                bottomPos = 0;
            }
        }

        @Override
        public String toString(){
            String s = "";
            int i = bottomPos;
            while(i != topPos){
                s += data[i].toString() + ", ";
                i++;
                if(i == data.length){
                    i = 0;
                }
            }
            return s;
        }

        public QueueViaArray(int size) {
            data = (E[]) (Array.newInstance(Object.class, size));
            bottomPos = 0;
            topPos = 0;
        }
    }
}
