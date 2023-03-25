package com.ramanhmr.ridemosphere.ui.screens

import com.ramanhmr.ridemosphere.model.Weather
import com.ramanhmr.ridemosphere.ui.ShowWeatherScreen
import kotlinx.coroutines.flow.Flow

class WeatherScreen : ShowWeatherScreen {
    override fun showWeather(weather: Weather) = Unit
    override fun setWeatherFlow(weatherFlow: Flow<Weather>) = Unit
}