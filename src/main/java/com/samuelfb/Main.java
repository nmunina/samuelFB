package com.samuelfb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Johan
        System.out.println("Fyll i ditt meddelande:");

       // String msg;  - Det behövs inte. Vi kan initialisera derekt

        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        System.out.println("Initial message: " + msg+ "\n");

        //TODO: Morse to eng does not work properly. Ex. *-**-*
        //TODO: "----- " ? Not all the morse codes have *
        if (msg.contains("*")){
            ToEng(msg);
        }

        else {
            ToMorse(msg);
        }

        sc.close(); // closing scanner

    }

    // Johan
    // TODO: Probably println in main function? Otherwise we do not need return type
    // TODO: Methods start with small letters
    public static String ToEng(String message){

        String[] mCodes = {/*Stop*/ "*-*-*- ", /*quotation marks*/ "*-**-* ", /*comma*/ "--**-- ", /*question mark*/ "**--** ", /*parentheses*/"-*--*- ", "-*--*-", /*apostrophe*/ "*----* ", /*exclamation mark*/ "-*-*-- ", /*slash*/ "-**-* ", /*numbers*/ "*---- ", "**--- ", "***-- ", "****- ", "***** ", "-**** ", "--*** ", "---** ", "----* ", "----- ", /*Letters*/ "--** ", "-*-- ", "-**- ", "*--- ", "*--* ", "***- ", "*-- ", "**-* ", "**- ", "-*-* ", "-*** ", "**** ", "*-** ", "*** ", "*-* ", "-** ", "--*- ", "-*- ", "--* ", "*- ", "-* ", "--- ", "** ", "-- ", "- ", "* "};

        String[] chars = {".", "\"", ",", "?", "(", ")", "'", "!", "/", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "z", "y", "x", "j", "p", "v", "w", "f", "u", "c", "b", "h", "l", "s", "r", "d", "q", "k", "g", "a", "n", "o", "i", "m", "t", "e"};

        for(int a = 0; a <= 44; a++){
            message = message.replace(mCodes[a], chars[a]);
        }

        System.out.println("Translation: " + message);
        return message;
    }

    //Johan
    //TODO: Message should be "message" with small letter
    public static String ToMorse(String Message){

        String[] mcodes={"*- ", "-*** ", "-*-* ", "-** ", "* ", "**-* ", "--* ", "**** ", "** ", "*--- ", "-*- ", "*-** ", "-- ", "-* ", "--- ", "*--* ", "--*- ", "*-* ", "*** ", "- ", "**- ", "***- ", "*-- ", "-**- ", "-*-- ", "--** ", /*numbers*/ "*---- ", "**--- ", "***-- ", "****- ", "***** ", "-**** ", "--*** ", "---** ", "----* ", "----- ", /*Stop*/ "*-*-*- ", /*quotation marks*/ "*-**-* ", /*comma*/ "--**-- ", /*question mark*/ "**--** ", /*parentheses*/"-*--*- ", "-*--*-", /*apostrophe*/ "*----* ", /*exclamation mark*/ "-*-*-- ", /*slash*/ "-**-* "};

        String[] Chars={"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "\"", ",", "?", "(", ")", "'", "!", "/"};

        String[] caps={"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};


        for (int b = 0; b <= 44; b++){
            Message = Message.replace(Chars[b], mcodes[b]);
        }

        for (int c = 0; c <= 25; c++){
            Message = Message.replace(caps[c], mcodes[c]);
        }

        System.out.println("Translation: " + Message);
        return Message;
    }


//    public static String input(String input) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        return null;
//    }
}
