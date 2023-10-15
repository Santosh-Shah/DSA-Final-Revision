package tries_and_huffman_coding;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode('\0');
    }

    private void addHelper(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminal = true;
            return;
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

    public boolean search(String word) {
        return searchHelper(root, word);
    }

    private boolean searchHelper(TrieNode root, String word) {
        // Base case
        if (word.length() == 0) {
            return root.isTerminal;
        }

        int childIndex = word.charAt(0) - 'A';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            return false;
        }
        return searchHelper(child, word.substring(1));
    }
}
