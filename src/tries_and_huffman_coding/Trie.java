package tries_and_huffman_coding;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode('\0');
    }

    private void addHelper(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminal = true;
        }

        int childIndex = word.charAt(0) - 'A';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
        }
        addHelper(child, word.substring(1));
    }

    public void add(String word) {
        addHelper(root, word);
    }
}
