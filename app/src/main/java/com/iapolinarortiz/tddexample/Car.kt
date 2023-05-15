package com.iapolinarortiz.tddexample

/**
 * This is the production code for Car
 *
 * This is the second step for TDD Lifecycle (Write one by one functionality).
 *
 * In this class we write all the functionality that we are going to unit test, when we
 * finished coding this functionality, the compilation errors will be gone and now all of the
 * assertions that will either succeed of fail.
 *
 * Next step is to refactor all the code that we create, so that we can run
 * the failed acceptance test that we wrote earlier
 * */

class Car(var fuel: Double, var engine: Engine) {
    fun turnOn() {
        fuel -= 0.5
        engine.turnOn()
    }
}