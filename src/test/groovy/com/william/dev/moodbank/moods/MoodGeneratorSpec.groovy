package com.william.dev.moodbank.moods

import spock.lang.Specification

/**
 * Created by william on 23/02/18.
 */
class MoodGeneratorSpec extends Specification {
    def objUnderTest = new MoodGenerator()

    def "reads in moods from populated text file"() {
        when: "the mood data file is read"
            def moods = objUnderTest.getMoods()
        then: "the mood data will be returned"
            !moods.isEmpty()
        and: "the number of moods will be 8"
            moods.size() == 8
    }
}
