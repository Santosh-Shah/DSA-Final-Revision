package tries_and_huffman_coding;

public class TrieTest {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.add("NOTE");
        t.add("HELLO");
        t.remove("NOTE");
        System.out.println(t.search("NOTE"));
    }
}
