package com.example.library

import groovy.transform.CompileStatic
import org.junit.Test

@CompileStatic
class HeyTest {
    @Test
    void test() {
        assert new Hey().toString() == "hey!"
    }
}
