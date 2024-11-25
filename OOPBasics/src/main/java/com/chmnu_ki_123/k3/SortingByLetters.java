package com.chmnu_ki_123.k3;

import java.util.ArrayList;
import java.util.List;

public class SortingByLetters {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("book", "car", "sun", "paper", "tree", "armchair"));
        words.sort((word1, word2) -> Integer.compare(word2.length(), word1.length())); // Сортуємо за кількістю літер (від найбільшого до найменшого)
        System.out.println(words);
    }
}
