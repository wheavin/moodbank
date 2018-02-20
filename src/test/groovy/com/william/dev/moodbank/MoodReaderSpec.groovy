package com.william.dev.moodbank

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Unit test class for MoodReader.java.
 */
class MoodReaderSpec extends Specification {
    def objUnderTest = new MoodReader()

    @Unroll
    def "parses '#inputText' and matches '#moodExpected'"() {
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
            "She hugged me and gave me a kiss"   | "Romantic"
            "I feel helpless and useless"        | "Depressive"
            "I slammed my fist in a fit of rage" | "Angry"
    }

}
