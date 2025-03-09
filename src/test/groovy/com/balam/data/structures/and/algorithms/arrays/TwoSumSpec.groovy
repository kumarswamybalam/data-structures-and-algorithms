package com.balam.data.structures.and.algorithms.arrays

import spock.lang.Specification

class TwoSumSpec extends Specification {

    def 'validate two sum' () {
        given:
        TwoSum twoSum = new TwoSum()

        when:
        int[] result = twoSum.execute(numbers as int[], target)

        then:
        result == expectedResult

        where:
        target | numbers     | expectedResult
        9      | [2,7,11,15] | [1, 0]
        6      | [3,2,4]     | [2, 1]
        6      | [3,3]       | [1, 0]
        7      | []          | []
        1      | [1]         | []
    }
}
