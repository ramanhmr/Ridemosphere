package com.ramanhmr.ridemosphere

import com.ramanhmr.ridemosphere.model.Limits
import com.ramanhmr.ridemosphere.model.Precipitation
import org.junit.Assert.*
import org.junit.Test

class LimitsTests {

    @Test
    fun limits_creatable() {
        val limits = Limits(3, Precipitation.NONE)
        assertEquals(limits::class, Limits::class)
    }

    @Test
    fun limits_equality() {
        val minTemperature = 5
        val precipitation = Precipitation.RAIN
        val limit1 = Limits(minTemperature, precipitation)
        val limit2 = Limits(minTemperature, precipitation)
        assertEquals(limit1, limit2)
    }
}