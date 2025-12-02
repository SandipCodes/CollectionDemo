package com.bainbeast;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringSorterAndCounter {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "grape");

        // Sort the list of strings
        List<String> sortedWords = words.stream()
                                        .sorted()
                                        .collect(Collectors.toList());

        System.out.println("Sorted List of Strings: " + sortedWords);

        // Count the occurrences of each string
        Map<String, Long> wordCounts = words.stream()
                                           .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println("Word Occurrences: " + wordCounts);
    }
}