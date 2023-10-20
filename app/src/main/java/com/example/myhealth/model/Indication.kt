package com.example.myhealth.model

data class Indication(
    val time: String,
    val upperPressure: Int,
    val lowerPressure: Int,
    val pulse: Int
)