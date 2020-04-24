package com.william.dev.moodbank.moods;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by william on 17/02/18.
 */
@Data
@AllArgsConstructor
public class Mood {
    private String name;
    private List<String> characteristics;
}
