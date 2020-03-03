package alternative;

import com.sun.org.apache.xpath.internal.operations.Equals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AlternativeSolution {
    public static HashMap<Character, String> vocabulary;
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        initializeVocabulary();
        String answer = welcome();

        if (answer.equals("1")) {
            System.out.println("Type in your english phrase");

            String input = reader.readLine().toLowerCase();
            char[] toCharArray = input.toCharArray();

            // Printing array
            for (char c : toCharArray) {
                //translate(c);
                System.out.print(translateToMorse(c) + " ");
            }
        } else if (answer.equals("2")) {
            System.out.println("Type in your morse phrase with spaces between codes. Use dashes(-) and asterisks(*).");

            String input = reader.readLine();

            //TODO: how to separate words? It looks ugly now
            String split[] = input.split(" ", 0);
            for (String s : split)
                System.out.print(translateToEng(s));
        }

        reader.close();
    }

    private static String welcome() throws IOException {

        System.out.println("Welcome to SamuelFB translation. How could we help you?");
        System.out.println("To translate from Enlish to Morse type 1");
        System.out.println("To translate from Morse to English type 2");

        String selection = reader.readLine();

        return selection;
    }
    // TODO: read about immutable map Map.of('a', "*-")
                                            //'b', "-***")
    private static void initializeVocabulary() {
        vocabulary = new HashMap<Character, String>();
        vocabulary.put(' ', " ");
        vocabulary.put('a', "*-");
        vocabulary.put('b', "-***");

    }

    public static String translateToMorse(char c) {
        HashMap<Character, String> vocabularyNew = vocabulary;

        Set<Map.Entry<Character, String>> entrySet = vocabularyNew.entrySet();
        String value = "";

        for (Map.Entry<Character,String> pair : entrySet) {
            if (pair.getKey().equals(c))
            {
                value = pair.getValue();// find out value
            }
        }

        return value;
    }

    public static char translateToEng(String c) {
        HashMap<Character, String> vocabularyNew = vocabulary;

        Set<Map.Entry<Character, String>> entrySet = vocabularyNew.entrySet();
        char value = 0;

        for (Map.Entry<Character,String> pair : entrySet) {
            if (pair.getValue().equals(c))
            {
                value = pair.getKey();// find out value
            }
        }

        return value;
    }
}
