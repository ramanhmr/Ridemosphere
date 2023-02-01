package com.ramanhmr.ridemosphere.model

data class Temperature(val valueInKelvin: Int) : Comparable<Temperature> {
    override fun compareTo(other: Temperature): Int =
        valueInKelvin.compareTo(other.valueInKelvin)
}
