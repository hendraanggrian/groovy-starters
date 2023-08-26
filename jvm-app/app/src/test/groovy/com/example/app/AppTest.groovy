package com.example.app

import groovy.transform.CompileStatic
import org.junit.Test

@CompileStatic
class AppTest {
    @Test
    void test() {
        assert new App().hashCode() == 0
    }
}
