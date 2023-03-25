package com.ramanhmr.ridemosphere.datasource

import com.ramanhmr.ridemosphere.model.Weather
import kotlinx.coroutines.flow.Flow

interface WeatherSource {
    fun getWeather(): Weather
    fun getWeatherFlow(): Flow<Weather>
}