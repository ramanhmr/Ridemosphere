package com.ramanhmr.ridemosphere.datasource

import com.ramanhmr.ridemosphere.model.Weather

interface WeatherSource {
    fun getWeather(): Weather
}