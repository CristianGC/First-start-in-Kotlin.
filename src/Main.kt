import vehicle.car.Cabriolet
import vehicle.car.Car

fun main()
{
	println("Start Kotlin")
	val car1 : Cabriolet = Car(140.0f, "VMG", "V-54324")
	car1.printlnCabriolet()
	car1.removeTheRoofFromTheCar()
	val car2 = Car(140.0f, "VMG", "V-54324")
	car2.printlnSedan()
}