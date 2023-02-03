package com.ramanhmr.ridemosphere

import com.ramanhmr.ridemosphere.model.Limits
import com.ramanhmr.ridemosphere.model.Precipitation
import com.ramanhmr.ridemosphere.model.Weather
import com.ramanhmr.ridemosphere.usecase.CheckWeatherIfAcceptableUseCase
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.LocalDate

class CheckWeatherIfAcceptableTests {

    @Test
    fun checkWeatherIfAcceptable_byTemperature() {
        val checkWeatherIfAcceptable = CheckWeatherIfAcceptableUseCase()
        val precipitation = Precipitation.NONE
        val date = LocalDate.now()
        fun getWeather(temperature: Int) = Weather(temperature, precipitation, date)
        val minTemperature = 5
        val lowerTemperature = -3
        val higherTemperature = 15
        val limit = Limits(minTemperature, precipitation)
        assertTrue(checkWeatherIfAcceptable(getWeather(minTemperature), limit))
        assertTrue(checkWeatherIfAcceptable(getWeather(higherTemperature), limit))
        assertFalse(checkWeatherIfAcceptable(getWeather(lowerTemperature), limit))
    }

    @Test
    fun checkWeatherIfAcceptable_byPrecipitation() {
        val checkWeatherIfAcceptable = CheckWeatherIfAcceptableUseCase()
        val maxPrecipitation = Precipitation.NONE
        val higherPrecipitation = Precipitation.RAIN
        val temperature = 3
        fun getWeather(precipitation: Precipitation) =
            Weather(temperature, precipitation, LocalDate.now())

        val limit = Limits(temperature, Precipitation.NONE)
        assertTrue(checkWeatherIfAcceptable(getWeather(maxPrecipitation), limit))
        assertFalse(checkWeatherIfAcceptable(getWeather(higherPrecipitation), limit))
    }
}