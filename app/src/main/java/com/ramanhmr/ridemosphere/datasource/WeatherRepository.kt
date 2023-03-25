package com.ramanhmr.ridemosphere.datasource

import com.ramanhmr.ridemosphere.model.Weather
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class WeatherRepository : WeatherSource {
    override fun getWeather(): Weather = Weather()
    override fun getWeatherFlow(): Flow<Weather> = flow { }
}