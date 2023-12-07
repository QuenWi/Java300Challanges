package Implement_a_Stack_Using_an_Array_in_Java;

import Implement_Queue_using_Stacks.Implement_Queue_using_Stacks;

import java.lang.reflect.Array;

public class Implement_a_Stack_Using_an_Array_in_Java {

    //implement a stack using an array
    public void implement_a_Stack_Using_an_Array_in_Java(){
        StackViaArray<Integer> stackViaArray = new StackViaArray<Integer>(10);
        stackViaArray.push(1);
        stackViaArray.push(2);
        stackViaArray.push(3);
        System.out.println(stackViaArray);
        stackViaArray.pop();
        System.out.println(stackViaArray);
        stackViaArray.push(4);
        stackViaArray.pop();
        stackViaArray.push(5);
        System.out.println(stackViaArray);
    }

    private class StackViaArray<E>{
        E[] data;
        int position;

        private void push(E element){
            position++;
            data[position] = element;
        }

        private void pop(){
            data[position] = null;
            position--;
        }

        @Override
        public String toString(){
            String s = "";
            for(int i = position; i >= 0; i--){
                s += data[i] + ", ";
            }
            return s;
        }

        private StackViaArray(int size){
            data = (E[]) Array.newInstance(Object.class, size);
            position = -1;
        }
    }
}
