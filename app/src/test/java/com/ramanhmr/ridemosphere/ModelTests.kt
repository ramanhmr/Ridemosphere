package com.ramanhmr.ridemosphere

import com.ramanhmr.ridemosphere.model.Precipitation
import com.ramanhmr.ridemosphere.model.Weather
import org.junit.Test

import org.junit.Assert.*

class ModelTests {
    @Test
    fun weather_create() {
        val weather = Weather(8, Precipitation.NONE)
        assertEquals(weather::class, Weather::class)
    }

    @Test
    fun weather_acceptableByTemperature() {
        val weather = Weather(8, Precipitation.NONE)
        val minimumTemperature = 5
        assertTrue(weather.temperature >= minimumTemperature)
    }

    @Test
    fun weather_acceptableByPrecipitation() {
        val weather = Weather(8, Precipitation.NONE)
        val maximumPrecipitation = Precipitation.NONE
        assertTrue(weather.precipitation <= maximumPrecipitation)
    }

    @Test
    fun weather_notAcceptableByPrecipitation() {
        val weather = Weather(8, Precipitation.RAIN)
        val maximumPrecipitation = Precipitation.NONE
        assertFalse(weather.precipitation <= maximumPrecipitation)
    }
}