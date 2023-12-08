package Valid_Parentheses;

import java.util.List;
import java.util.Stack;

public class Valid_Parentheses {

    //Is a parentheses valid
    public static Boolean valid_Parentheses(List<Character> list){
        Stack<Character> characters = new Stack<>();
        for(Character character : list){
            if(character == '('){
                characters.push('(');
            }
            if(character == ')'){
                if(characters.isEmpty() || !(characters.pop() == '(')){
                    return Boolean.FALSE;
                }
            }
            if(character == '{'){
                characters.push('{');
            }
            if(character == '}'){
                if(characters.isEmpty() || !(characters.pop() == '{')){
                    return Boolean.FALSE;
                }
            }
            if(character == '['){
                characters.push('[');
            }
            if(character == ']'){
                if(characters.isEmpty() || !(characters.pop() == '[')){
                    return Boolean.FALSE;
                }
            }
        }
        if(!characters.isEmpty()){
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
