import vehicle.car.CreateCar

fun main()
{
	val car3 = CreateCar.SelectTheBrand.BrandGhinea.SelectTheBodyType.BodyVan.Model.G3V()
	println("brandName: ${car3.brandName}")
	println("bodyName: ${car3.bodyName}")
	car3.printlnBrand()
	println("maxSpeedKmH: ${car3.maxSpeedKmH}")
	car3.printlnBody()
	
	val car7 = CreateCar.SelectTheBrand.BrandGhinea.SelectTheBodyType.BodyVan.Model.G7V()
	car7.printlnBody()
	
}
