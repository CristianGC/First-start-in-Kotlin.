import core.*

fun main()
{
    val Car1 : Bus = Car(70.0f, "Space", "Bus-14384")
    val Car2 : Sedan = Car(140.0f, "VM", "Sedan-57763")
    val Car3 : Cabriolet = Car(200.0f, "STB", "Cabriolet-31374")

    println("\nCar1")
    Car1.printlnBus()
    Car1.BurningTemperature = 40.0f
    Car1.dieselFuel = 170
    Car1.StartingTheCar()
    Car1.StartingTheCar(false)
    Car1.StartingTheCar(true)

    println("\nCar2")
    Car2.printlnSedan()
    Car2.BurningTemperature = 50.0f
    Car2.gasolineFuel = 70
    Car2.StartingTheCar()
    Car2.StartingTheCar(false)
    Car2.StartingTheCar(true)

    println("\nCar3")
    Car3.printlnCabriolet()
    Car3.removeTheRoofFromTheCar()
    Car3.BurningTemperature = 70.0f
    Car3.gasolineFuel = 50
    Car3.StartingTheCar()
    Car3.StartingTheCar(false)
    Car3.StartingTheCar(true)
    
}