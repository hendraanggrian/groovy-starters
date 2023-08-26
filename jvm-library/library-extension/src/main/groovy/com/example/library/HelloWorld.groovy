package com.example.library

import groovy.transform.CompileStatic

@CompileStatic
final class HelloWorld extends Hello {
    @Override
    String toString() {
        return super.toString() + " World"
    }
}
