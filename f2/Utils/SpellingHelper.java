package Utils;

public class SpellingHelper {
    public static String bigFirstLetter(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
