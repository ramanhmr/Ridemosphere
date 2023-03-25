package com.ramanhmr.ridemosphere.ui

import com.ramanhmr.ridemosphere.model.Weather
import kotlinx.coroutines.flow.Flow

interface ShowWeatherScreen {
    fun showWeather(weather: Weather)
    fun setWeatherFlow(weatherFlow: Flow<Weather>)
}