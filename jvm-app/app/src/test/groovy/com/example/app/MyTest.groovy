package com.example.app

import groovy.transform.CompileStatic
import org.junit.Test

@CompileStatic
class MyTest {
    @Test
    void test() {
        assert new MyApp().toString() == "yo!"
    }
}
