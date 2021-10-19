package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String text = "The Hobbit is a film series consisting of three high fantasy adventure films directed by Peter Jackson " +
                "The three films are The Hobbit An Unexpected Journey The Hobbit The Desolation of Smaug and " +
                "The Hobbit The Battle of the Five Armies The films are based on the novel The Hobbit by Tolkien " +
                "with large portions of the trilogy inspired by the appendices to The Return of the King " +
                "which expand on the story told in The Hobbit as well as new material and characters written especially for the films " +
                "Together they act as a prequel to Jackson The Lord of the Rings film trilogy";

        Function<String, List<String>> dictionaryGenerator = string -> Arrays.stream((string).split(" "))
                .map(String::toLowerCase)
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        dictionaryGenerator.apply(text).forEach(System.out::println);
    }
}

