package com.example.kmm_lib_example_1

interface SharedLibPlatform {
    val name: String
}

expect fun getSharedLibPlatform(): SharedLibPlatform