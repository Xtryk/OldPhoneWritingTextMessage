package com.PhoneTxtMsg;

import java.util.*;

public class FastTextMessage {

    /* Phone, where keyboard looks like
       _____ _____ _____
      |  1  |  2  |  3  |
      |     | ABC | DEF |
      |_____|_____|_____|
      |  4  |  5  |  6  |
      | GHI | JKL | MNO |
      |_____|_____|_____|
      |  7  |  8  |  9  |
      |PQRS | TUV | WXYZ|
      |_____|_____|_____|
      |     |  0  |     |
      |  *  |space|  #  |
      |_____|_____|_____|
    */

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter below the message you want to write: ");

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

        String message = scanner.nextLine();
       // System.out.println(typingInstruction.get('A'));
        int[] typingSequence = new int[message.length()];

        for (int i = 0; i<message.length()-1;i++ ){
            char j = message.toUpperCase().charAt(i);
            int currentSubSequence = typingInstruction.get(j);
            typingSequence[i] = currentSubSequence;
        }
     System.out.println(Arrays.toString(typingSequence));
    }
}
