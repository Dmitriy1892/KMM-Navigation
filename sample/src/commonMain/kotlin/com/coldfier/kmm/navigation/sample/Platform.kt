package com.coldfier.kmm.navigation.sample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform