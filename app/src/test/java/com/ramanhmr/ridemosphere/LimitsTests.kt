package com.ramanhmr.ridemosphere

import com.ramanhmr.ridemosphere.model.Limits
import com.ramanhmr.ridemosphere.model.Precipitation
import com.ramanhmr.ridemosphere.model.Weather
import org.junit.Assert.*
import org.junit.Test
import java.time.LocalDate

class LimitsTests {

    @Test
    fun limits_creatable() {
        val limits = Limits(3, Precipitation.NONE)
        assertEquals(limits::class, Limits::class)
    }

    @Test
    fun limit_temperature_checksAcceptanceForWeather() {
        val precipitation = Precipitation.NONE
        val date = LocalDate.now()
        fun getWeather(temperature: Int) = Weather(temperature, precipitation, date)
        val minTemperature = 5
        val lowerTemperature = -3
        val higherTemperature = 15
        val limit = Limits(minTemperature, precipitation)
        assertTrue(limit.isAcceptable(getWeather(minTemperature)))
        assertTrue(limit.isAcceptable(getWeather(higherTemperature)))
        assertFalse(limit.isAcceptable(getWeather(lowerTemperature)))
    }

    @Test
    fun limit_precipitation_checksAcceptanceForWeather() {
        val maxPrecipitation = Precipitation.NONE
        val higherPrecipitation = Precipitation.RAIN
        val temperature = 3
        fun getWeather(precipitation: Precipitation) =
            Weather(temperature, precipitation, LocalDate.now())

        val limit = Limits(temperature, Precipitation.NONE)
        assertTrue(limit.isAcceptable(getWeather(maxPrecipitation)))
        assertFalse(limit.isAcceptable(getWeather(higherPrecipitation)))
    }

    @Test
    fun limits_equality() {
        val minTemperature = 5
        val precipitation = Precipitation.RAIN
        val limit1 = Limits(minTemperature, precipitation)
        val limit2 = Limits(minTemperature, precipitation)
        assertEquals(limit1, limit2)
    }
}