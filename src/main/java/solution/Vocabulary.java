package solution;

import java.util.HashMap;

public class Vocabulary {
   // HashMap<Character, String>  morseToEnglish = immutable Map.of();
    public static HashMap<Character, String> vocabularyEngMorse;
    public static HashMap<String, Character> vocabularyMorseEng;

    public static void initializeVocabulary() {

        // TODO: read about immutable map Map.of('a',"*-")
        //'b',"-***")
        vocabularyEngMorse = new HashMap<Character, String>();
        vocabularyEngMorse.put(' ', " ");
        vocabularyEngMorse.put('a', "*-");
        vocabularyEngMorse.put('b', "-***");
        vocabularyEngMorse.put('c', "-*-*");
        vocabularyEngMorse.put('d', "-**");
        vocabularyEngMorse.put('e', "*");
        vocabularyEngMorse.put('f', "**-*");
        vocabularyEngMorse.put('g', "--*");
        vocabularyEngMorse.put('h', "****");
        vocabularyEngMorse.put('i', "**");
        vocabularyEngMorse.put('j', "*---");
        vocabularyEngMorse.put('k', "-*-");
        vocabularyEngMorse.put('l', "*-**");
        vocabularyEngMorse.put('m', "--");
        vocabularyEngMorse.put('n', "-*");
        vocabularyEngMorse.put('o', "---");
        vocabularyEngMorse.put('p', "*--*");
        vocabularyEngMorse.put('q', "--*-");
        vocabularyEngMorse.put('r', "*-*");
        vocabularyEngMorse.put('s', "***");
        vocabularyEngMorse.put('t', "-");
        vocabularyEngMorse.put('u', "**-");
        vocabularyEngMorse.put('v', "***-");
        vocabularyEngMorse.put('w', "*--");
        vocabularyEngMorse.put('x', "-**-");
        vocabularyEngMorse.put('y', "-*--");
        vocabularyEngMorse.put('z', "--**");
        vocabularyEngMorse.put('0', "-----");
        vocabularyEngMorse.put('1', "*----");
        vocabularyEngMorse.put('2', "**---");
        vocabularyEngMorse.put('3', "***--");
        vocabularyEngMorse.put('4', "****-");
        vocabularyEngMorse.put('5', "*****");
        vocabularyEngMorse.put('6', "-****");
        vocabularyEngMorse.put('7', "--***");
        vocabularyEngMorse.put('8', "---**");
        vocabularyEngMorse.put('9', "----*");
        vocabularyEngMorse.put('ä', "*-*-");
        vocabularyEngMorse.put('á', "*--*-");
        vocabularyEngMorse.put('å', "*--*-");
        vocabularyEngMorse.put('é', "**-**");
        vocabularyEngMorse.put('ñ', "--*--");
        vocabularyEngMorse.put('ö', "---*");
        vocabularyEngMorse.put('ü', "**--");

        //Reversing keys and values of English-Morse dictionary, to get Morse-English dictionary
        vocabularyMorseEng = new HashMap<String, Character>();
        for (char i : vocabularyEngMorse.keySet()) {
            vocabularyMorseEng.put(vocabularyEngMorse.get(i), i);
        }
    }

    public static String translateToMorse(char c) {
        return vocabularyEngMorse.get(c);
    }

    public static char translateToEng(String s) {
        return vocabularyMorseEng.get(s);
    }

}
