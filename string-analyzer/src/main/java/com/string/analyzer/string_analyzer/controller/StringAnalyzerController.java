package com.string.analyzer.string_analyzer.controller;
import com.string.analyzer.string_analyzer.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class StringAnalyzerController {

    @GetMapping("/{operation}")
    public String analyze(@PathVariable String operation, @RequestParam(required = false) String input) {
        if (input == null || input.trim().isEmpty()) {
            return "Enter a valid String";
        }

        return switch (operation.toLowerCase()) {
            case "palindrome" -> StringUtils.checkPalindrome(input);
            case "reverse" -> new StringBuilder(input).reverse().toString();
            case "counter" -> StringUtils.countWordsAndChars(input);
            case "vowelconsonant" -> StringUtils.countVowelsAndConsonants(input);
            case "frequency" -> StringUtils.getCharacterFrequency(input);
            case "pangram" -> StringUtils.checkPangram(input);
            case "uppercase" -> input.toUpperCase();
            case "lowercase" -> input.toLowerCase();
            case "camelcase" -> StringUtils.toCamelCase(input);
            case "compress" -> StringUtils.compressString(input);
            default -> "Invalid Operation";
        };
    }
}
