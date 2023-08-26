package com.example.library

import groovy.transform.CompileStatic
import org.junit.Test

@CompileStatic
class HelloTest {
    @Test
    void test() {
        assert new Hello().toString() == "Hello"
    }
}
