package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Vocabulary.initializeVocabulary();
        String answer = welcome();

        if (answer.equals("1")) {
            System.out.println("Type in your english phrase");

            String input = reader.readLine().toLowerCase();
            char[] toCharArray = input.toCharArray(); //Making input String to char[] array

            //for each element in Char Array we print out the translated version
            for (char c : toCharArray) {
                System.out.print(Vocabulary.translateToMorse(c) + " ");
            }
        } else if (answer.equals("2")) {
            System.out.println("Type in your morse phrase with spaces between codes. Use dashes(-) and asterisks(*).");

            //TODO: catch if user tries latin letters
            //catch if "  " (two spaces)
            String input = reader.readLine();

            //TODO: how to separate words? It looks ugly now
            //splitting input in separate strings with " "
            String[] split = input.split(" ", 0);

            //for each element in split find the translation and print it out
            for (String s : split)
                System.out.print(Vocabulary.translateToEng(s));
        }

        reader.close();
    }

    private static String welcome() throws IOException {
        System.out.println("Welcome to SamuelFB translation. How could we help you?");
        System.out.println("To translate from English to Morse type 1");
        System.out.println("To translate from Morse to English type 2");

        return reader.readLine();
    }
}
