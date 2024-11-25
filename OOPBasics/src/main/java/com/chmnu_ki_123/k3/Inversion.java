package com.chmnu_ki_123.k3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Inversion {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("book", "car", "sun", "paper", "tree", "armchair")); // оголошення списку
        if (!words.isEmpty()) {
            Collections.reverse(words); // інверсія порядку елементів у списку
        }

        System.out.println(words);
    }
}
