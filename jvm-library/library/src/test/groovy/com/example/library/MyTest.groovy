package com.example.library

import groovy.transform.CompileStatic
import org.junit.Test

@CompileStatic
class MyTest {
    @Test
    void test() {
        assert new MyClass().toString() == "yo!"
    }
}
