package Implement_Stack_using_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_using_Queues {

    //Implement a stack only using queues
    public void implement_Stack_using_Queues(){
        StackViaQueues stackViaQueues = new StackViaQueues();
        stackViaQueues.push(1);
        stackViaQueues.push(2);
        stackViaQueues.push(3);
        System.out.println(stackViaQueues);
        stackViaQueues.pop();
        System.out.println(stackViaQueues);
        stackViaQueues.push(4);
        stackViaQueues.pop();
        stackViaQueues.push(5);
        System.out.println(stackViaQueues);
    }


    private class StackViaQueues{
        Queue<Integer> data;
        Queue<Integer> memory;

        private void push(Integer integer){
            memory = new LinkedList<>();
            memory.add(integer);
            for(Integer i : data){
                memory.add(i);
            }
            data = memory;
        }

        private void pop(){
            memory.poll();
        }

        @Override
        public String toString(){
            memory = new LinkedList<>();
            String s = "";
            while(!data.isEmpty()){
                s += data.element() + ", ";
                memory.add(data.element());
                data.poll();
            }
            data = memory;
            return s;
        }

        private StackViaQueues() {
            data = new LinkedList<>();
        }
    }


}
