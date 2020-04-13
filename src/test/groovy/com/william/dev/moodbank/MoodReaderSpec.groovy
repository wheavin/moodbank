package com.william.dev.moodbank

import com.william.dev.moodbank.utils.CsvReader
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Unit test class for MoodReader.java.
 */
class MoodReaderSpec extends Specification {
    def objUnderTest = new MoodReader()

    @Unroll
    def "The phrase '#inputText' and matches '#moodExpected'"() {
        when: "the text input is parsed"
            def moodReturned = objUnderTest.matchMood(inputText as String)
        then: "the expected mood should be returned"
            moodReturned.name == moodExpected as String
        where: "the inputs are"
            [inputText, moodExpected] << new CsvReader("MoodTestData.csv")
    }

}
