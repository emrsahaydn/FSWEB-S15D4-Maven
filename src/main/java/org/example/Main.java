package org.example;


import java.util.LinkedList;
import java.util.Locale;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("Was it a car or a cat I saw"));
    }
    public static boolean checkForPalindrome(String text){
        if(text==null) return false;

        String cleanText = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase(Locale.ENGLISH);
        LinkedList<Character> charList = new LinkedList<>();

        for(char c:cleanText.toCharArray()){
            charList.add(c);
        }
        while(charList.size()>1){
            if (!charList.removeFirst().equals(charList.removeLast())) {
                return false;
            }
        }
        return true;

    }
    public static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) return "0";

        Stack<Integer> remainderStack = new Stack<>();

        while (decimal > 0) {
            int remainder = decimal % 2;
            remainderStack.push(remainder);
            decimal = decimal / 2;
        }

        StringBuilder binaryString = new StringBuilder();

        while (!remainderStack.isEmpty()) {
            binaryString.append(remainderStack.pop());
        }

        return binaryString.toString();
    }
}