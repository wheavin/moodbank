package com.william.dev.moodbank.moods;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by william on 17/02/18.
 */
public class Mood {
    private String name;
    private String[] characteristics;
    private List<Mood> relatedMoods;

    public Mood(final String name) {
        this.name = name;
        this.relatedMoods = new ArrayList<>();
    }

    public Mood(final String name, final String[] characteristics) {
        this.name = name;
        this.characteristics = characteristics;
        this.relatedMoods = new ArrayList<>();
    }

    public Mood(final String name, final String[] characteristics, final List<Mood> relatedMoods) {
        this.name = name;
        this.characteristics = characteristics;
        this.relatedMoods = relatedMoods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(final String... characteristics) {
        this.characteristics = characteristics;
    }

    public List<Mood> getRelatedMoods() {
        return relatedMoods;
    }

    public void setRelatedMoods(List<Mood> relatedMoods) {
        this.relatedMoods = relatedMoods;
    }
}
