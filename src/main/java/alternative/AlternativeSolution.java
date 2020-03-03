package alternative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class AlternativeSolution {
    public static HashMap<Character, String> vocabularyEngMorse;
    public static HashMap<String, Character> vocabularyMorseEng;
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        initializeVocabulary();
        String answer = welcome();

        if (answer.equals("1")) {
            System.out.println("Type in your english phrase");

            String input = reader.readLine().toLowerCase();
            char[] toCharArray = input.toCharArray(); //Making input String to char[] array

            // for each element in Char Array we print out the translated version
            for (char c : toCharArray) {
                System.out.print(translateToMorse(c) + " ");
            }
        } else if (answer.equals("2")) {
            System.out.println("Type in your morse phrase with spaces between codes. Use dashes(-) and asterisks(*).");

            //TODO: catch if user tries latin letters
            String input = reader.readLine();

            //TODO: how to separate words? It looks ugly now
            //spliting input i separate strings with " "
            String[] split = input.split(" ", 0);

            // for each element in split find the translation and print it out
            for (String s : split)
                System.out.print(translateToEng(s));
        }

        reader.close();
    }

    private static String welcome() throws IOException {
        System.out.println("Welcome to SamuelFB translation. How could we help you?");
        System.out.println("To translate from Enlish to Morse type 1");
        System.out.println("To translate from Morse to English type 2");

        return reader.readLine();
    }

    // TODO: read about immutable map Map.of('a', "*-")
                                            //'b', "-***")
    private static void initializeVocabulary() {
        vocabularyEngMorse = new HashMap<Character, String>();
        vocabularyEngMorse.put(' ', " ");
        vocabularyEngMorse.put('a', "*-");
        vocabularyEngMorse.put('b', "-***");

        //Reversing keys and values of Englich-Morse dictionary, to get Morse-Rnglish dictionary
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
