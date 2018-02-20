package com.william.dev.moodbank;

import com.william.dev.moodbank.moods.Mood;
import com.william.dev.moodbank.moods.MoodGenerator;

import java.util.Set;

/**
 * Parses text files and returns the keywords.
 */
public class MoodReader {
    private final MoodGenerator moodGenerator;

    public MoodReader() {
        moodGenerator = new MoodGenerator();
    }

    public Mood matchMood(final String inputText) {
        Mood bestMatchingMood = null;
        int numberOfBestMatchingCharacteristics = 0;
        final Set<Mood> moods = moodGenerator.getMoods();
        for (final Mood currentMood : moods) {
            final String[] moodCharacteristics = currentMood.getCharacteristics();
            final int numberOfMatchingWordsForCurrentMood = getNumberOfMatchingWordsForCurrentMood(inputText,
                    moodCharacteristics);
            if (numberOfMatchingWordsForCurrentMood > numberOfBestMatchingCharacteristics) {
                bestMatchingMood = currentMood;
                numberOfBestMatchingCharacteristics = numberOfMatchingWordsForCurrentMood;
            }
        }
        return bestMatchingMood;
    }

    private int getNumberOfMatchingWordsForCurrentMood(final String inputText, final String[] moodCharacteristics) {
        int numberOfMatchingWordsForCurrentMood = 0;
        for (final String moodCharacteristic : moodCharacteristics) {
            if (inputText.toLowerCase().contains(moodCharacteristic)) {
                numberOfMatchingWordsForCurrentMood++;
            }
        }
        return numberOfMatchingWordsForCurrentMood;
    }
}
