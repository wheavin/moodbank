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
            int numberOfMatchingCharacteristics = 0;
            final String[] moodCharacteristics = currentMood.getCharacteristics();
            for (final String moodCharacteristic : moodCharacteristics) {
                if (inputText.toLowerCase().contains(moodCharacteristic)) {
                    numberOfMatchingCharacteristics++;
                }
            }
            if (numberOfMatchingCharacteristics > numberOfBestMatchingCharacteristics) {
                bestMatchingMood = currentMood;
                numberOfBestMatchingCharacteristics = numberOfMatchingCharacteristics;
            }
        }
        return bestMatchingMood;
    }
}
