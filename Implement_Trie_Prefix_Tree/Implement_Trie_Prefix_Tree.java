package Implement_Trie_Prefix_Tree;

import Helpers.PrintArrayOrList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Implement_Trie_Prefix_Tree {

    public char character;
    public HashMap<Character, Implement_Trie_Prefix_Tree> connections = new HashMap<Character, Implement_Trie_Prefix_Tree>();

    public void insert(Character[] array){
        if(!connections.containsKey(array[0])){
            connections.put(array[0], new Implement_Trie_Prefix_Tree());
            connections.get(array[0]).character = array[0];
        }
        if(array.length != 1){
            connections.get(array[0]).insert(Arrays.copyOfRange(array, 1, array.length));
        }
    }

    public boolean search(Character[] array){
        if(connections.containsKey(array[0])){
            if(array.length != 1){
                return connections.get(array[0]).search(Arrays.copyOfRange(array, 1, array.length));
            } else{
                return true;
            }
        } else{
            return false;
        }
    }

    public List<Character> startWith(Implement_Trie_Prefix_Tree start, Implement_Trie_Prefix_Tree wanted){
        Save save = new Save();
        save.characters = null;
        startWithControlNode(start, wanted, save, new ArrayList<>());
        save.characters.remove(0);
        return save.characters;
    }

    private void startWithControlNode(Implement_Trie_Prefix_Tree node, Implement_Trie_Prefix_Tree wanted, Save save, List<Character> path){
        if(node == wanted){
            save.characters = path;
        }
        if(save.characters == null){
            path.add(node.character);
            for(Implement_Trie_Prefix_Tree implementTriePrefixTree : node.connections.values()){
                startWithControlNode(implementTriePrefixTree, wanted, save, new ArrayList<>(List.copyOf(path)));
            }
        }
    }

    private class Save{
        List<Character> characters;
    }
}
