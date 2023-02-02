package com.ramanhmr.ridemosphere.model

import java.time.LocalDate

data class Weather(
    val temperature: Int,
    val precipitation: Precipitation,
    val date: LocalDate
)
