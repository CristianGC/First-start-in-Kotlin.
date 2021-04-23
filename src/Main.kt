import core.*

fun main()
{
    val car1 : Bus = Car(70.0f, "Space", "Bus-14384")
    val car2 : Sedan = Car(140.0f, "VM", "Sedan-57763")
    val car3 : Cabriolet = Car(200.0f, "STB", "Cabriolet-31374")

    println("\nCar1")
    car1.printlnBus()
    car1.burningTemperature = 40.0f
    car1.dieselFuel = 170
    car1.StartingTheCar()
    car1.StartingTheCar(false)
    car1.StartingTheCar(true)

    println("\nCar2")
    car2.printlnSedan()
    car2.burningTemperature = 50.0f
    car2.gasolineFuel = 70
    car2.StartingTheCar()
    car2.StartingTheCar(false)
    car2.StartingTheCar(true)

    println("\nCar3")
    car3.printlnCabriolet()
    car3.removeTheRoofFromTheCar()
    car3.burningTemperature = 70.0f
    car3.gasolineFuel = 50
    car3.StartingTheCar()
    car3.StartingTheCar(false)
    car3.StartingTheCar(true)
    
}