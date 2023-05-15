package com.iapolinarortiz.tddexample.acceptancetest

import com.iapolinarortiz.tddexample.Car
import com.iapolinarortiz.tddexample.Engine
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Test

/**
 *  Failing acceptance test for the relation between  Car and Engine classes.
 *  This is the first step for the Outside-In TDD lifecycle
 *  Before writing any logic in the classes, we write this failing acceptance
 * */

class CarFeature {
    private val engine = Engine()
    private val car = Car(6.0, engine)

    @Test
    fun carIsLoosingFuelWhenItTurnsOn(){
        car.turnOn()
        assertEquals(5.5, car.fuel)
    }

    @Test
    fun carIsTurningOnItsEngineAndIncreasesTheTemperature(){
        car.turnOn()
        assertTrue(car.engine.isTurnedOn)
        assertEquals(95, car.engine.temperature)
    }
}