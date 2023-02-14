public class trie_word_break {
    public trienode root;

    public trie_word_break() {
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

    public boolean wordbreak(String str) {
        int n = str.length();
        if (n == 0) {
            return true;
        }
        for (int i = 1; i <= n; i++) {
            if (search(str.substring(0, i)) && wordbreak(str.substring(i, n))) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        trie_word_break trie = new trie_word_break();
        String dic[] = { "mobile", "samsung", "sam", "sung", "ma", "mango", "icecream", "and", "go", "i", "like", "ice",
                "cream" };
        int n = dic.length;
        for (int i = 0; i < n; i++) {
            trie.insert(dic[i]);
        }
        System.out.println("All strings inserted successfully\n");
        System.out.println(trie.wordbreak("ilikesam") ? "yes" : "no");
        System.out.println(trie.wordbreak("ilikesam") ? "yes" : "no");
        System.out.println(trie.wordbreak("ilikesam") ? "yes" : "no");

    }

}
