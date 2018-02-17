package com.william.dev.moodbank;

import java.util.ArrayList;
import java.util.List;

/**
 * Parses text files and returns the keywords.
 */
public class TextParser {
    private final KeywordStore keywordStore;

    public TextParser() {
        keywordStore = new KeywordStore();
    }

    public List<String> parse(final String inputText) {
        final List<String> keywords = new ArrayList<>();
        for (final String word : inputText.split(" ")) {
            if (keywordStore.contains(word)) {
                keywords.add(word);
            }
        }
        return keywords;
    }
}
