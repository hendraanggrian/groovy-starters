package com.example.library

import groovy.transform.CompileStatic
import org.junit.Test

@CompileStatic
class YoTest {
    @Test
    void test() {
        assert new Yo().toString() == "yo!"
    }
}
