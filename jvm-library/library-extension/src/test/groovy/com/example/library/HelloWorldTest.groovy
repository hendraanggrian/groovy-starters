package com.example.library

import groovy.transform.CompileStatic
import org.junit.Test

@CompileStatic
class HelloWorldTest {
    @Test
    void test() {
        assert new HelloWorld().toString() == "Hello World"
    }
}
