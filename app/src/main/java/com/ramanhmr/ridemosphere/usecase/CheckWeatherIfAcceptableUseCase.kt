package com.ramanhmr.ridemosphere.usecase

import com.ramanhmr.ridemosphere.model.Limits
import com.ramanhmr.ridemosphere.model.Weather

class CheckWeatherIfAcceptableUseCase {
    operator fun invoke(weather: Weather, limits: Limits): Boolean =
        weather.temperature >= limits.minTemperature &&
                weather.precipitation <= limits.maxPrecipitation
}