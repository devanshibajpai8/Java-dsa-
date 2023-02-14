import java.util.Arrays;

class string_shuffled {

    static String sortString(String str) {

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        str = String.valueOf(charArray);
        return str;
    }

    static boolean shuffleCheck(String f, String s, String result) {
        f = sortString(f);
        s = sortString(s);
        result = sortString(result);
        int i = 0, j = 0, k = 0;
        if (f.length() + s.length() != result.length()) {
            return false;
        }
        while (k != result.length()) {
            if (i < f.length() && f.charAt(i) == result.charAt(k))
                i++;
            else if (j < s.length() && s.charAt(j) == result.charAt(k))
                j++;

            else {
                return false;
            }
            k++;
        }

        if (i < f.length() || j < s.length()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String f = "XYz";
        String s = "123";
        String[] results = { "1XYz32", "Y13zX2", "Y2133zX" };
        for (String result : results) {
            if (shuffleCheck(f, s, result) == true) {
                System.out.println(result + " is a valid shuffle of " + f + " and " + s);
            } else {
                System.out.println(result + " is not a valid shuffle of " + f + " and " + s);
            }
        }
    }
}