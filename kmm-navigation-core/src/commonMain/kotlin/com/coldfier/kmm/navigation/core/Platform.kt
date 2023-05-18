package com.coldfier.kmm.navigation.core

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform