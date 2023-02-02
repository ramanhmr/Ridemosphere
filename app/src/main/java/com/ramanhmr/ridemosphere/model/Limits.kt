package com.ramanhmr.ridemosphere.model

data class Limits(
    private val minTemperature: Int,
    private val maxPrecipitation: Precipitation
) {
    fun isAcceptable(weather: Weather): Boolean =
        weather.temperature >= minTemperature &&
                weather.precipitation <= maxPrecipitation
}