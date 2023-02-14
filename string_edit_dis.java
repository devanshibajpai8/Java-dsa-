public class string_edit_dis {

    public void palindrome(String a, String b) {
        int n = a.length();
        int m = b.length();
        int count = 0;
        if (n == m) {
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == b.charAt(i)) {
                    count = 0;
                }
            }
        }
        if (n == m) {
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == b.charAt(i)) {
                    count = 0;
                } else {
                    for (int j = i; j < m; j++) {
                        char[] d = b.toCharArray();
                        if (a.charAt(i) == b.charAt(j)) {
                            char t = d[i];
                            d[i] = d[j];
                            d[j] = t;
                            count++;
                        }
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        String a = "geek";
        String b = "geek";
        string_edit_dis r = new string_edit_dis();
        r.palindrome(a, b);
    }

}
