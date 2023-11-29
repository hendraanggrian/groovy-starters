package com.johndoe.library

import org.junit.Test

class ViewTest {
    @Test
    void test() {
        assert new View().getText() == "Hello World"
    }
}
