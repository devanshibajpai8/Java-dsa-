import javax.lang.model.util.ElementScanner14;

public class string_longest_palindrome {

    public void palin(String st,int i,int j) {
        
        while (i < j) {
            if (st.charAt(i) == st.charAt(j)) {
                i++;
                j--;
                System.out.println(st.charAt(i));
            } else {
                break;
            }
        }

    }

    public void palindrome(String st) {
        int n = st.length();
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (st.charAt(i) == st.charAt(j)) {
                palin(st,i,j);
            } else if (st.charAt(i) != st.charAt(j)) {
                i++;
                palin(st,i,j);
            } else if (st.charAt(i) != st.charAt(j)) {
                j--;
                palin(st,i,j);
            } else {
                System.out.println("not a palindrome");
            }

        }

    }

    public static void main(String[] args) {
        String a = "aaabbaav";
        string_longest_palindrome r = new string_longest_palindrome();
        r.palindrome(a);
    }

}
