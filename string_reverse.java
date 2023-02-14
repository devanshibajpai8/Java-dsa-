public class string_reverse {

    public void reverse(String st) {
        int n = st.length();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(st.charAt(i));
        }
    }

    public static void main(String[] args) {
        String a = "devanshi";
        string_reverse r = new string_reverse();
        r.reverse(a);
    }

}
