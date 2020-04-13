package com.william.dev.moodbank.moods;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by william on 17/02/18.
 */
public class Mood {
    private String name;
    private List<String> characteristics;
    private List<Mood> relatedMoods;

    public Mood() {
        this.name = "";
        this.characteristics = new ArrayList<>();
        this.relatedMoods = new ArrayList<>();
    }

    public Mood(final String name) {
        this.name = name;
        this.characteristics = new ArrayList<>();
        this.relatedMoods = new ArrayList<>();
    }

    public Mood(final String name, final List<String> characteristics, final List<Mood> relatedMoods) {
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

    public List<String> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(final List<String> characteristics) {
        this.characteristics = characteristics;
    }

    public List<Mood> getRelatedMoods() {
        return relatedMoods;
    }

    public void setRelatedMoods(List<Mood> relatedMoods) {
        this.relatedMoods = relatedMoods;
    }

    @Override
    public String toString() {
        return "Mood{" +
                "name='" + name + '\'' +
                ", characteristics=" + characteristics +
                ", relatedMoods=" + relatedMoods +
                '}';
    }
}
