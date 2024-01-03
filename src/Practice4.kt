fun main() {
    // Fill in the code.
//    val conversionFormula: (Double) -> Double { quantity ->
//        9 / 5 * quantity + 32
//    }
    printFinalTemperature(27.0, "Celcius","Fahrenheit"){9/5 *it + 32}
    printFinalTemperature(350.0,"Kelvin","Celcius"){it - 273.15}
    printFinalTemperature(10.0,"Fahrenheit","Kelvin"){5/9 *(it - 32) + 273.15}
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}