package com.example.kmm_weather

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform