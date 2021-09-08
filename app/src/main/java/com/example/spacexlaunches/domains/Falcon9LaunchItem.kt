package com.example.spacexlaunches.domains

data class Falcon9LaunchItem(
    val imageUrl: String,
    val title: String,
    val launchDate: String,
    val isSuccess: Boolean
)