package com.william.dev.moodbank.moods;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by william on 17/02/18.
 */
public class MoodGenerator {
    private Set<Mood> moods;

    public MoodGenerator() {
        moods = new HashSet<>();

        final Mood happy = new Mood("Happy");
        happy.setCharacteristics("wonderful", "birthday", "peacefully");
        moods.add(happy);

        final Mood sad = new Mood("Serious");
        sad.setCharacteristics("died", "hateful");
        moods.add(sad);

        final Mood cold = new Mood("Cold");
        cold.setCharacteristics("cold", "winter");
        moods.add(cold);

        final Mood depressive = new Mood("Depressive");
        depressive.setCharacteristics("feel", "dark", "alone");
        moods.add(depressive);

        final Mood melancholic = new Mood("Melancholic");
        melancholic.setCharacteristics("long", "home");
        moods.add(melancholic);
    }

    public Set<Mood> getMoods() {
        return moods;
    }
}
