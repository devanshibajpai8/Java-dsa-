public class trie_shortest_prefix {
    public static trienode root;

    public trie_shortest_prefix() {
        root = new trienode();
    }

    public class trienode {
        trienode[] children;
        int count;

        public trienode() {
            this.children = new trienode[26];
            this.count = 0;

        }
    }

    public void insert(String word) {
        trienode current = root;
        current.count++;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (current.children[index] == null) {
                trienode node = new trienode();
                current.children[index] = node;
                current = node;
            } else {
                current.children[index].count++;
                current = current.children[index];
            }
        }
    }

    public static String search(String word) {
        trienode temp = root;
        int i = 0;
        for (i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (temp.children[index] != null && temp.children[index].count == 1) {
                break;
            }
            temp = temp.children[index];

        }
        return word.substring(0, i + 1);
    }

    static String[] find(String[] arr,int N )
    {
        root=new trienode('');
        for(int i=0;i<arr.length;i++)
        {
            insert(arr[i]);
        }
        String ans[]=new String[N];
        for(int i=0;i<N;i++)
        {
            ans[i]=pre(arr[i]);
        }
        return ans;
    }

}
