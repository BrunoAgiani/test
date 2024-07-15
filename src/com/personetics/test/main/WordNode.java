package com.personetics.test.main;

import java.util.HashSet;
import java.util.Set;

public class WordNode implements Node {
    private String value;

    public WordNode(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Word cannot be null or empty");
        }
        this.value = value;
    }

    @Override
    public Set<Character> getDependencies() {
        Set<Character> dependencies = new HashSet<>();
        for (char ch : value.toCharArray()) {
            dependencies.add(ch);
        }
        return dependencies;
    }

    @Override
    public String toString() {
        return value;
    }
}
