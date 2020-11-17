package example;

import java.util.Set;

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        Set <Character> vowels = Set.of('a','e', 'i', 'o','u');
        for (int i = 0; i < str.length(); i = i + 1) {
         char   ch = str.charAt(i);
            if (vowels.contains(ch)){
                vowelsCount = vowelsCount+1;

            }
        }
        return vowelsCount;
    }

}