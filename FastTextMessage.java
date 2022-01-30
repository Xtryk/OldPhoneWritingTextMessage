package com.PhoneTxtMsg;

import java.util.*;

public class FastTextMessage {

    /* Phone, where keyboard looks like
       _____ _____ _____
      |  1  |  2  |  3  |
      |,.?!1|ABC2 | DEF3|
      |_____|_____|_____|
      |  4  |  5  |  6  |
      | GHI4| JKL5| MNO6|
      |_____|_____|_____|
      |  7  |  8  |  9  |
      |PQRS7| TUV8|WXYZ9|
      |_____|_____|_____|
      |     |  0  |     |
      |     |" ",0|     |
      |_____|_____|_____|
    */

    public static void main(String[] args) {

     Map<Character, Integer> typingInstruction = new HashMap();
     typingInstruction.put('A', 2);
     typingInstruction.put('B', 22);
     typingInstruction.put('C', 222);
     typingInstruction.put('D', 3);
     typingInstruction.put('E', 33);
     typingInstruction.put('F', 33);
     typingInstruction.put('G', 4);
     typingInstruction.put('H', 44);
     typingInstruction.put('I', 444);
     typingInstruction.put('J', 5);
     typingInstruction.put('K', 55);
     typingInstruction.put('L', 555);
     typingInstruction.put('M', 6);
     typingInstruction.put('N', 66);
     typingInstruction.put('O', 666);
     typingInstruction.put('P', 7);
     typingInstruction.put('Q', 77);
     typingInstruction.put('R', 777);
     typingInstruction.put('S', 7777);
     typingInstruction.put('T', 8);
     typingInstruction.put('U', 88);
     typingInstruction.put('V', 888);
     typingInstruction.put('W', 9);
     typingInstruction.put('X', 99);
     typingInstruction.put('Y', 999);
     typingInstruction.put('Z', 9999);
     typingInstruction.put(' ', 0);
     typingInstruction.put('1', 11111);
     typingInstruction.put('2', 2222);
     typingInstruction.put('3', 3333);
     typingInstruction.put('4', 4444);
     typingInstruction.put('5', 5555);
     typingInstruction.put('6', 6666);
     typingInstruction.put('7', 77777);
     typingInstruction.put('8', 8888);
     typingInstruction.put('9', 99999);
     typingInstruction.put('0', 00);
     typingInstruction.put(',', 1);
     typingInstruction.put('.', 11);
     typingInstruction.put('?', 111);
     typingInstruction.put('!', 1111);


     Scanner scanner = new Scanner(System.in);

     System.out.println("Please enter below the message you want to write: ");

     String message = scanner.nextLine();
     int[] typingSequence = new int[message.length()];

     try {
       for (int i = 0; i < message.length(); i++) {
         char j = message.toUpperCase().charAt(i);
         int currentSubSequence = typingInstruction.get(j);
         typingSequence[i] = currentSubSequence;
      }
      System.out.println(Arrays.toString(typingSequence));

     } catch (NullPointerException e) {
        System.out.println(e.getMessage() + "\n\n Please check whether you message is correct. (Do not include diacritic marks, signs etc.)");
     }

    }
}
