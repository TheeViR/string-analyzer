package com.string.analyzer.string_analyzer.util;
import java.util.*;

public class StringUtils {

    public static String checkPalindrome(String input) {
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed) ? "It's a palindrome" : "Not a palindrome";
    }

    public static String countWordsAndChars(String input) {
        String trimmed = input.trim();
        String[] words = trimmed.split("\\s+");
        int chars = trimmed.replaceAll("\\s", "").length();
        return "Words: " + words.length + " & Characters: " + chars;
    }

    public static String countVowelsAndConsonants(String input) {
        String cleaned = input.toLowerCase().replaceAll("[^a-z]", "");
        int vowels = 0, consonants = 0;
        for (char ch : cleaned.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) vowels++;
            else consonants++;
        }
        return "Vowels: " + vowels + " & Consonants: " + consonants;
    }

    public static String getCharacterFrequency(String input) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
        }
        if (freq.isEmpty()) return "No valid characters to analyze";
        StringBuilder result = new StringBuilder();
        freq.forEach((k, v) -> result.append(k).append(": ").append(v).append("\n"));
        return result.toString().trim();
    }

    public static String checkPangram(String input) {
        Set<Character> letters = new HashSet<>();
        for (char ch : input.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') letters.add(ch);
        }
        return letters.size() == 26 ? "It's a Pangram!" : "Not a Pangram";
    }

    public static String toCamelCase(String input) {
        String[] words = input.trim().split("\\s+");
        if (words.length == 0) return "";
        StringBuilder result = new StringBuilder(words[0].toLowerCase());
        for (int i = 1; i < words.length; i++) {
            result.append(Character.toUpperCase(words[i].charAt(0)))
                  .append(words[i].substring(1).toLowerCase());
        }
        return result.toString();
    }

    public static String compressString(String input) {
        String trimmed = input.replaceAll("\\s+", "");
        StringBuilder res = new StringBuilder();
        int i = 0;
        while (i < trimmed.length()) {
            char curr = trimmed.charAt(i);
            int count = 1;
            while (i + 1 < trimmed.length() && trimmed.charAt(i) == trimmed.charAt(i + 1)) {
                count++;
                i++;
            }
            res.append(curr);
            if (count > 1) res.append(count);
            res.append(" ");
            i++;
        }
        return res.toString().trim();
    }
}
