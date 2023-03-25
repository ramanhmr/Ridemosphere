package com.ramanhmr.ridemosphere.datasource

import com.ramanhmr.ridemosphere.model.Weather

class WeatherRepository : WeatherSource {
    override fun getWeather(): Weather = Weather()
}