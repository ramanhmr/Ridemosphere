package com.ramanhmr.ridemosphere.model

data class Weather(
    val temperature: Temperature,
    val precipitation: Precipitation,
    val windSpeed: WindSpeed,
    val overcast: Overcast
)
