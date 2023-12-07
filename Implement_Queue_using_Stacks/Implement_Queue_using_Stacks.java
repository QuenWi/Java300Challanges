package Implement_Queue_using_Stacks;

import java.util.Stack;

public class Implement_Queue_using_Stacks {

    //implements a queue only using stacks
    public void implement_Queue_using_Stacks(){
        QueueViaStacks queueViaStacks = new QueueViaStacks();
        queueViaStacks.push(1);
        queueViaStacks.push(2);
        queueViaStacks.push(3);
        System.out.println(queueViaStacks);
        queueViaStacks.pop();
        System.out.println(queueViaStacks);
        queueViaStacks.push(4);
        queueViaStacks.pop();
        queueViaStacks.push(5);
        System.out.println(queueViaStacks);
    }

    private class QueueViaStacks{
        Stack<Integer> data;
        Stack<Integer> memory;

        private void push(Integer integer){
            memory = new Stack<>();
            while(!data.isEmpty()){
                memory.push(data.pop());
            }
            data.push(integer);
            while(!memory.isEmpty()){
                data.push(memory.pop());
            }
        }

        private void pop(){
            data.pop();
        }

        @Override
        public String toString(){
            String s = "";
            memory = new Stack<>();
            while(!data.isEmpty()){
                s += data.peek() + ", ";
                memory.push(data.pop());
            }
            while(!memory.isEmpty()){
                data.push(memory.pop());
            }
            return s;
        }

        public QueueViaStacks() {
            data = new Stack<>();
        }
    }
}
