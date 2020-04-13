package com.william.dev.moodbank.moods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by william on 17/02/18.
 */
public class MoodGenerator {

    public Set<Mood> getMoods() {
        final Set<Mood> moods = new HashSet<>();
        final String fileName = "./src/main/resources/moods.txt";

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(fileEntry -> parseMood(fileEntry, moods));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return moods;
    }

    private void parseMood(final String fileEntry, final Set<Mood> moods) {
        final String[] entrySplit = fileEntry.split(":");
        final String moodName = entrySplit[0];
        final String characteristicsEntry = entrySplit[1];
        final List<String> characteristics = Stream.of(characteristicsEntry.split(",")).collect(Collectors.toList());

        final Mood mood = new Mood(moodName);
        mood.setCharacteristics(characteristics);
        moods.add(mood);
    }
}
