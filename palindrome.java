import java.util.Scanner;

public class palindrome {
    public boolean pal(String a) {
        char[] ch = a.toCharArray();
        int s = 0;
        int e = a.length() - 1;
        while (s < e) {
            if (ch[s] != ch[e]) {
                return false;
            }
            s++;
            e--;
        }
        return true;

    }

    public static void main(String[] args) {
        palindrome r = new palindrome();
        if (r.pal("momi")) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");

        }
    }
}
