package com.iapolinarortiz.tddexample.unittest

import com.iapolinarortiz.tddexample.Car
import com.iapolinarortiz.tddexample.Engine
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.times
import org.mockito.kotlin.verify

/**
 * Unit test for Car class.
 * This is the first step for TDD Lifecycle (different than the Outside-In)
 *
 * As the first step, we should write our test cases before the production code itself
 *
 * If we run this test, it should return compilation errors as there is no production code, so
 * the next step is write the functionality that make the unit test be successful.
 * */

class CarShould {
    private val engine = mock<Engine>()
    private val car = Car(6.0, engine)

    @Test
    fun looseFuelWhenItTurnsOn() {
        car.turnOn()
        assertEquals(5.5, car.fuel)
    }

    @Test
    fun turnOnItsEngine() {
        car.turnOn()
        // Verfiy that TurnOn method from engine is called one time from car.turnOn
        verify(engine, times(1)).turnOn()
    }
}