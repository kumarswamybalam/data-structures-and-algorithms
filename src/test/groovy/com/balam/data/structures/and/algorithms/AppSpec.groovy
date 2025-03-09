package com.balam.data.structures.and.algorithms

import spock.lang.Specification


class AppSpec extends Specification {

    def "intro"() {
        given:
        def app = new App()

        expect:
        app.add(2, 3) == 5
    }
}