package Find_And_Replace_in_String;

public class Find_And_Replace_in_String {

    //If at position i we have the string source, than we replace that string with the string target
    public static String find_And_Replace_in_String(String string, Integer[] indexes, String[] sources, String[] targets){
        if(indexes.length == sources.length && sources.length == targets.length){
            String result = string;
            for(int i = 0; i < indexes.length; i++){
                if(string.contains(sources[i])){
                    if(string.indexOf(sources[i]) == indexes[i]){
                        result = result.replace(sources[i], targets[i]);
                    }
                }
            }
            return result;
        } else{
            System.err.println("Error, the arrays need to have the same length!");
            return string;
        }
    }
}
