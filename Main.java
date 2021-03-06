/**
 * Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the string.
 * If there are two or more words that are the same length, return the first word from the string with that length.
 * Ignore punctuation and assume sen will not be empty. Words may also contain numbers, for example "Hello world123 567"
 */

import java.util.*;

class Main {

    public static String LongestWord(String sen) {
        // code goes here
        String[] senArr = sen.toLowerCase().split("[^a-z0-9]");
        String longestWord = "";
        for(String word : senArr){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }

        }
        return longestWord;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }

}
