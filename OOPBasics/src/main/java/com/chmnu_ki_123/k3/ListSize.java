package com.chmnu_ki_123.k3;

import java.util.ArrayList;
import java.util.List;

public class ListSize {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("book", "car", "sun", "paper", "tree", "armchair"));

        // Підрахунок кількості елементів у списку
        int size = words.size();

        System.out.println("Кількість елементів у списку: " + size);
    }
}
