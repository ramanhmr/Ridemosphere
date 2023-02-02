package com.ramanhmr.ridemosphere

import com.ramanhmr.ridemosphere.model.Precipitation
import com.ramanhmr.ridemosphere.model.Weather
import org.junit.Test

import org.junit.Assert.*
import java.time.LocalDate

class WeatherModelTests {
    @Test
    fun weather_create() {
        val weather = Weather(8, Precipitation.NONE, LocalDate.now())
        assertEquals(weather::class, Weather::class)
    }

    @Test
    fun weather_acceptableByTemperature() {
        val weather = Weather(8, Precipitation.NONE, LocalDate.now())
        val minimumTemperature = 5
        assertTrue(weather.temperature >= minimumTemperature)
    }

    @Test
    fun weather_acceptableByPrecipitation() {
        val weather = Weather(8, Precipitation.NONE, LocalDate.now())
        val maximumPrecipitation = Precipitation.NONE
        assertTrue(weather.precipitation <= maximumPrecipitation)
    }

    @Test
    fun weather_notAcceptableByPrecipitation() {
        val weather = Weather(8, Precipitation.RAIN, LocalDate.now())
        val maximumPrecipitation = Precipitation.NONE
        assertFalse(weather.precipitation <= maximumPrecipitation)
    }

    @Test
    fun weather_differsByTime() {
        val temperature = 5
        val precipitation = Precipitation.NONE
        val weather1 = Weather(temperature, precipitation, LocalDate.of(2001, 4, 5))
        val weather2 = Weather(temperature, precipitation, LocalDate.now())
        assertNotEquals(weather1, weather2)
    }

    @Test
    fun weather_equalModelsAreEqual() {
        val temperature = 5
        val precipitation = Precipitation.RAIN
        val weather1 = Weather(temperature, precipitation, LocalDate.now())
        val weather2 = Weather(temperature, precipitation, LocalDate.now())
        assertEquals(weather1, weather2)
    }
}