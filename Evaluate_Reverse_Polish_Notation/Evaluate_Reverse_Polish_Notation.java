package Evaluate_Reverse_Polish_Notation;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {

    //making a calculator
    public void evaluate_Reverse_Polish_Notation(){
        Calculator calculator = new Calculator();
        calculator.push("4");
        calculator.push("12");
        calculator.push("/");
        System.out.println(calculator.result);
        calculator.push("1");
        calculator.push("3");
        calculator.push("+");
        System.out.println(calculator.result);
        calculator.push("*");
        System.out.println(calculator.result);
        calculator.push("10");
        calculator.push("5");
        calculator.push("-");
        System.out.println(calculator.result);
    }

    private class Calculator{
        Stack<Integer> numbers;
        Integer result;

        void push(String input){
            if(input.equals("+")){
                if(result == null){
                    int memory = numbers.pop();
                    result = memory + numbers.pop();
                } else{
                    result += numbers.pop();
                }
            } else if(input.equals("-")){
                if(result == null){
                    int memory = numbers.pop();
                    result = memory - numbers.pop();
                } else{
                    result -= numbers.pop();
                }
            } else if(input.equals("*")){
                if(result == null){
                    int memory = numbers.pop();
                    result = memory * numbers.pop();
                } else{
                    result *= numbers.pop();
                }
            } else if(input.equals("/")){
                if(result == null){
                    int memory = numbers.pop();
                    result = memory / numbers.pop();
                } else{
                    result /= numbers.pop();
                }
            } else{
                numbers.push(Integer.parseInt(input));
            }
        }

        public Calculator() {
            result = null;
            numbers = new Stack<>();
        }
    }
}
