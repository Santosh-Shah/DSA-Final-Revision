package tries_and_huffman_coding;

public class TrieTest {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.add("NOTE");
        t.add("HELLO");
        System.out.println(t.search("HELL"));
    }
}
