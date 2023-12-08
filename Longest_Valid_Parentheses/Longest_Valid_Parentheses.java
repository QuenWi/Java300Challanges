package Longest_Valid_Parentheses;

import java.util.List;
import java.util.Stack;

public class Longest_Valid_Parentheses {

    //What is the longest valid parantheses?
    public static Integer valid_Parentheses(List<Character> list){
        int counter;
        int result = 0;
        Stack<Character> characters;
        for(int i = 0; i < list.size(); i++){
            counter = 0;
            characters = new Stack<>();
            for(int j = i; j < list.size(); j++){
                counter++;
                if(list.get(j) == '('){
                    characters.push('(');
                }
                if(list.get(j) == ')'){
                    if(characters.isEmpty() || !(characters.pop() == '(')){
                        break;
                    }
                }
                if(list.get(j) == '{'){
                    characters.push('{');
                }
                if(list.get(j) == '}'){
                    if(characters.isEmpty() || !(characters.pop() == '{')){
                        break;
                    }
                }
                if(list.get(j) == '['){
                    characters.push('[');
                }
                if(list.get(j) == ']'){
                    if(characters.isEmpty() || !(characters.pop() == '[')){
                        break;
                    }
                }
                if(characters.isEmpty()){
                    if(counter > result){
                        result = counter;
                    }
                }
            }
        }

        return result;
    }
}
