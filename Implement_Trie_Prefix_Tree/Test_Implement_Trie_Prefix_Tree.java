package Implement_Trie_Prefix_Tree;

public class Test_Implement_Trie_Prefix_Tree {

    public static void main(String[] args) {
        test();
    }

    private static void test(){
        Implement_Trie_Prefix_Tree implementTriePrefixTree = new Implement_Trie_Prefix_Tree();
        implementTriePrefixTree.insert(new Character[]{'a', 'n', 'd'});
        implementTriePrefixTree.insert(new Character[]{'a', 'n', 'a'});
        implementTriePrefixTree.insert(new Character[]{'a', 'n', 'n', 'a'});
        implementTriePrefixTree.insert(new Character[]{'p', 'e', 'a', 'r'});
        System.out.println("\"apple\" in Trie: " + implementTriePrefixTree.search(new Character[]{'a', 'p', 'p', 'l', 'e'}));
        System.out.println("\"and\" in Trie: " + implementTriePrefixTree.search(new Character[]{'a', 'n', 'd'}));
        System.out.println("\"anna\" in Trie: " + implementTriePrefixTree.search(new Character[]{'a', 'n', 'n', 'a'}));
        System.out.println("\"annna\" in Trie: " + implementTriePrefixTree.search(new Character[]{'a', 'n', 'n', 'n', 'a'}));

        System.out.println("In \"pear\" comes before the \"r\": " + implementTriePrefixTree.startWith(implementTriePrefixTree,
                implementTriePrefixTree.connections.get('p').connections.get('e').connections.get('a').connections.get('r')));
    }
}
