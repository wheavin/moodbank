package com.william.dev.moodbank

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Unit test class for MoodReader.java.
 */
class MoodReaderSpec extends Specification {
    def objUnderTest = new MoodReader()

    @Unroll
    def "parses text input and matches a mood"(final String inputText, final String moodExpected) {
        when: "the text input is parsed"
            def moodReturned = objUnderTest.matchMood(inputText)

        then: "the expected mood should be returned"
            moodReturned.name == moodExpected

        where:
            inputText                            | moodExpected
            "I had a wonderful birthday"         | "Happy"
            "It was a very cold winter day"      | "Cold"
            "She died in a hateful rage"         | "Serious"
            "I fell asleep peacefully and happy" | "Happy"
            "SHE HAD A WONDERFUL TIME"           | "Happy"
            "I feel so dark and alone right now" | "Depressive"
            "I am a long way from home"          | "Melancholic"
    }

}
