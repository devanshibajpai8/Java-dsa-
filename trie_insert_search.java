public class trie_insert_search {
    public trienode root;

    public trie_insert_search() {
        root = new trienode();
    }

    public class trienode {
        trienode[] children;
        boolean isword;

        public trienode() {
            this.children = new trienode[26];
            this.isword = false;

        }
    }

    public void insert(String word) {
        trienode current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (current.children[index] == null) {
                trienode node = new trienode();
                current.children[index] = node;
                current = node;
            } else {
                current = current.children[index];
            }
        }
        current.isword = true;
    }

    public boolean search(String word) {
        trienode temp = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (temp.children[index] != null) {
                temp = temp.children[index];
            } else {
                return false;
            }
        }
        return (temp.isword);
    }

    public static void main(String[] args) {
        trie_insert_search trie = new trie_insert_search();
        trie.insert("cat");
        trie.insert("son");
        trie.insert("cab");
        System.out.println("All strings inserted successfully\n");
        boolean s = trie.search("son");
        System.out.print("Is the searched element present in the areray:");
        System.out.println(s);

    }

}
