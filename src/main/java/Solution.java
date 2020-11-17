/**
 * Здесь был Вася 12.12.20
 */
class Solution {

    static String toCamelCase(String s) {
        if (s.isEmpty()) {
            return "";
        }
        String[] words = s.split("-|_");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            char ch = words[i].charAt(0);
            if (i > 0 && Character.isLowerCase(ch)) {
                String words2 = Character.toUpperCase(ch) + words[i].substring(1);
                result += words2;
            } else {
                result += words[i];
            }
        }
        return result;
    }
}
