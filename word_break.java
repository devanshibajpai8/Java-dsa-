import java.util.Arrays;
import java.util.List;

class word_break {
    public static boolean wordBreak(List<String> dict, String word) {
        if (word.length() == 0) {
            return true;
        }

        for (int i = 1; i <= word.length(); i++) 
        {
            String prefix = word.substring(0, i);
            if (dict.contains(prefix) && wordBreak(dict, word.substring(i))) 
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        List<String> dict = Arrays.asList("this", "th", "is", "famous", "Word",
                "break", "b", "r", "e", "a", "k", "br", "bre", "brea", "ak", "problem");

        // input string
        String word = "Wordbreakproblemb";

        if (wordBreak(dict, word)) {
            System.out.println("The string can be segmented");
        } else {
            System.out.println("The string can't be segmented");
        }
    }
}