import vehicle.car.CreateCar

fun main()
{
	val car3 = CreateCar.SelectTheBrand.BrandGhinea.SelectTheBodyType.BodyPickup.Model.G3P()
	println("brandName: ${car3.brandName}")
	println("bodyName: ${car3.bodyName}")
	car3.printlnBrand()
	println("maxSpeedKmH: ${car3.maxSpeedKmH}")
	
}
