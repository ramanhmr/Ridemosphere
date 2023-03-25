package com.ramanhmr.ridemosphere

import com.ramanhmr.ridemosphere.datasource.WeatherRepository
import com.ramanhmr.ridemosphere.datasource.WeatherSource
import org.junit.Test

class Tests {

    @Test
    fun get_weather_from_weather_source() {
        val weatherSource: WeatherSource = WeatherRepository()
        weatherSource.getWeather()
    }
}