public class string_rotation {

    public boolean rotation(String st, String str) {
        int n = st.length();
        int m = str.length();
        if (n != m) {
            System.out.println("The strings are not rotation of each other");
        }
        int i = 0, j = 0;
        while (j < m && i < n) {
            if (st.charAt(i) == str.charAt(j)) {
                while (i <= n - 1) {
                    if (st.charAt(i) == str.charAt(j)) {
                        if (j == (m - 1)) {
                            j = 0;
                            i++;
                            break;
                        }
                        i++;
                        j++;
                    } else {
                        return false;
                    }
                }
            } else {
                j++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "devanshi";
        String b = "nshideva";
        string_rotation r = new string_rotation();
        boolean o = r.rotation(a, b);
        if (o == true) {
            System.out.println("strings are in rotation");
        } else {
            System.out.println("strings are not in rotation");
        }
    }

}
