package com.example.kmm_lib_example_1

class SharedLibGreeting {
    private val sharedLibPlatform: SharedLibPlatform = getSharedLibPlatform()

    fun greet(): String {
        return "Hello, ${sharedLibPlatform.name}!"
    }
}