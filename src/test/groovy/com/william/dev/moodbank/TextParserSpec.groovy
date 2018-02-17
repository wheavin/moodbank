package com.william.dev.moodbank

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Unit test class for TextParser.java.
 */
class TextParserSpec extends Specification {
    def objUnderTest = new TextParser()

    @Unroll
    def "parses text input and returns text keywords"(final String inputText, final List<String> keywordsExpected) {
        when: "the text input is parsed"
            def keywordsReturned = objUnderTest.parse(inputText)

        then: "the expected keywords should be returned"
            keywordsReturned as Set == keywordsExpected as Set

        where:
            inputText                | keywordsExpected
            "I had a wonderful time" | ["I", "wonderful", "time"]
            "It was a very cold day" | ["very", "cold"]
    }

}
