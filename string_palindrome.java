public class string_palindrome {

    public int palindrome(String st) {
        int n = st.length();
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (st.charAt(i++) != st.charAt(j--)) {
                System.out.println("not a palindrome");
                return 0;
            }

        }
        System.out.println("it is a palindrome");
        return 0;

    }

    public static void main(String[] args) {
        String a = "devanhi";
        string_palindrome r = new string_palindrome();
        r.palindrome(a);
    }

}
