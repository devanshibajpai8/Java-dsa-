public class string_dupl {

    public void palindrome(String st) {
        int n = st.length();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i+1; j < n; j++) {
                if (st.charAt(i) == st.charAt(j)) {
                    count++;
                    System.out.println(st.charAt(i) + " " + count);
                }
            }
        }

    }

    public static void main(String[] args) {
        String a = "aabbcc";
        string_dupl r = new string_dupl();
        r.palindrome(a);
    }

}
