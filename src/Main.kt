import vehicle.car.CreateCar

fun main()
{	/*
	println("Start Kotlin")
	val car1 : Cabriolet = Car(140.0f, "VMG", "V-54324")
	car1.printlnCabriolet()
	car1.removeTheRoofFromTheCar()
	val car2 = Car(140.0f, "VMG", "V-54324")
	car2.printlnSedan()
	
	 */
	val car3 = CreateCar.SelectTheBrand.BrandGhinea.SelectTheBodyType.BodyPickup()
	println("brandName: ${car3.brandName}")
	println("bodyName: ${car3.bodyName}")
	car3.printlnBrand()
	
	
	
}