package com.chmnu_ki_123.k3;

import java.util.ArrayList;
import java.util.List;

public class ElementRemoval {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("book", "car", "sun", "paper", "tree", "armchair")); // оголошення списку
        if (!words.isEmpty()) {
            words.remove(words.size() - 1); // видалення одного слова з кінця списку
        }

        System.out.println(words); // виведення результату
    }
}
