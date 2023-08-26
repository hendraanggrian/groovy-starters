package com.example.app

import groovy.transform.CompileStatic

@CompileStatic
class App {
    @Override
    int hashCode() {
        return 0
    }
    @Override
    boolean equals(Object obj) {
        return super.equals(obj)
    }
}
