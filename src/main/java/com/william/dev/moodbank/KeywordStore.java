package com.william.dev.moodbank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by william on 17/02/18.
 */
public class KeywordStore {
    private Set<String> keywords;

    public KeywordStore() {
        final String[] keywordArray = {"I", "wonderful", "time", "very", "cold"};
        keywords = new HashSet<>(Arrays.asList(keywordArray));
    }

    public boolean contains(final String word) {
        return keywords.contains(word);
    }
}
