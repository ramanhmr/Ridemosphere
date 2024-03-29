package com.ramanhmr.ridemosphere

import com.ramanhmr.ridemosphere.datasource.WeatherRepository
import com.ramanhmr.ridemosphere.datasource.WeatherSource
import com.ramanhmr.ridemosphere.ui.ShowWeatherScreen
import org.junit.Before
import org.junit.Test

class DataFlowTests {

    private lateinit var weatherSource: WeatherSource

    @Before
    fun prepareWeatherSource() {
        weatherSource = WeatherRepository()
    }

    @Test
    fun get_weather_from_weather_source() {
        weatherSource.getWeather()
    }

    @Test
    fun get_weather_flow_from_weather_source() {
        weatherSource.getWeatherFlow()
    }

    @Test
    fun showing_weather_on_screen() {
        val weather = weatherSource.getWeather()
        val weatherScreen: ShowWeatherScreen = MainActivity()
        weatherScreen.showWeather(weather)
    }

    @Test
    fun setting_weather_flow_on_screen() {
        val weatherFlow = weatherSource.getWeatherFlow()
        val weatherScreen: ShowWeatherScreen = MainActivity()
        weatherScreen.setWeatherFlow(weatherFlow)
    }
}