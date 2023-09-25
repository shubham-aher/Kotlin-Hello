/*
    Kotlin Getting Started - Coding Snippets
    Work in progress
    @Shubham
 */

package com.shubhamaher.hellokotlin

fun main() {
    showSplashScreen()
    showCities()
    showTemperature()
}

private fun showSplashScreen() {
    println("==========[ Weather Dashboard ]==========")
    println("==========[  Details: v1.0.0  ]==========")
}

fun showCities() {

    //Init cities
    val cities = listOf("Pune","Nasik","Nagpur","Mumbai")

    //Declare and assign on separate lines
    val stateName: String
    stateName = "Maharashtra"

    println("Weather Stats for state of ${stateName} in ${cities.size} cities : ")
    for(city in cities)
        println("${stateName} - ${city}")
}

private fun showTemperature() {
    val flag = isBoilingPoint()
    displayStats(!flag)
}

private fun isBoilingPoint(): Boolean {
    var isBoilingPointReached = true
    val temperatureCelcius = 25.500090909099894
    println("Current temperature : ${((temperatureCelcius * 9) / 5) + 32}")

    //Check if current temperature is less than boiling point
    if (temperatureCelcius < 100)
        isBoilingPointReached = false

    println("Flag isBoilingPointReached : ${isBoilingPointReached}")
    return isBoilingPointReached
}

private fun displayStats(isStatsEnabled: Boolean) {
    val int: Int = 1
    val float: Float = 2.0f
    val long: Long = 3L
    val double: Double = 4.0
    val string: String = "5"
    val char: Char = '6'
    val boolean: Boolean = true
    val scientific: Double = 1.2234e1

    if (isStatsEnabled)
        println("Stats: ${int} ${float} ${long} ${double} ${string} ${char} ${boolean} ${scientific}")
}