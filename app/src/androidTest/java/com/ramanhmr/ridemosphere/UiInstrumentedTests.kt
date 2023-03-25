package com.ramanhmr.ridemosphere

import androidx.test.core.app.launchActivity
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class UiInstrumentedTests {
    @Test
    fun createActivity() {
        launchActivity<MainActivity>()
    }
}