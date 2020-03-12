package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Solution {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Vocabulary.initializeVocabulary();
        boolean doneOperation = false;
        boolean allGoodInput = true;

        // Prompt option until user selects exit
        while (!doneOperation) {
            // show menu
            String menuChoise = welcome();

            if (menuChoise.equals("0")) {
                System.out.println("You chose to exit. See you again.");
                doneOperation = true;
            } else if (menuChoise.equals("1")) {
                System.out.println("Type in your english phrase");

                String engInput = reader.readLine().toLowerCase();
                char[] toCharArray = engInput.toCharArray(); //Making input String to char[] array

                //for each element in Char Array we print out the translated version
                for (char c : toCharArray) {
                    System.out.print(Vocabulary.translateToMorse(c) + " ");
                }
            } else if (menuChoise.equals("2")) {
                System.out.println("Type in your morse phrase with spaces between codes. Use dashes(-) and asterisks(*).");

                try {
                    String morseInput = reader.readLine();
                    String strDoubleSpace = "  ";

                    // check for "  " (two spaces) and if there is a starting space
                    if (morseInput.contains(strDoubleSpace) || morseInput.startsWith(" ")) {
                        System.out.println("Please enter correct input");
                        allGoodInput = false;

                    } else {
                        for (int i=0;i<morseInput.length();i++) {
                            //catch if user tries Latin letters
                            if (morseInput.charAt(i) == '*' || morseInput.charAt(i) == '-' || morseInput.charAt(i) == ' ') {
                                //System.out.println("Correct input: ["+ input.charAt(i) + "]");
                                allGoodInput = true;
                            } else {
                                System.out.println("Incorrect input: ["+ morseInput.charAt(i) + "]");
                                System.out.println("Please enter only (*, -, or single space) as input.");
                                allGoodInput = false;
                                break; // break, if one wrong char found
                            }
                        }
                    }
                    if(allGoodInput) {
                        //splitting input in separate strings with " "
                        String[] split1 = morseInput.split(" ", 0);

                        //for each element in split find the translation and print it out
                        //Error message to user if there is too long element.
                        for (String s : split1) {
                            if(s.length() <= 6) {
                                System.out.print(Vocabulary.translateToEng(s));
                            } else {
                                System.out.println("Too many characters input, no matching morse code for this set: [" + s + "]. Probably your forgot space between elements?");
                            }
                        }
                    } // if AllGood condition
                } catch(InputMismatchException e) {
                    System.out.println("\t Exception occurred in Morse code input");
                }
            } else {
                System.out.println("\t Invalid option entered...select again.");
            }
        }//while ends

        reader.close();
    }

    private static String welcome() throws IOException {
        System.out.println("\nWelcome to SamuelFB translation. How could we help you?");
        System.out.println("To translate from English to Morse, type 1");
        System.out.println("To translate from Morse to English, type 2");
        System.out.println("To exit from this menu, type 0");

        return reader.readLine();
    }
}
