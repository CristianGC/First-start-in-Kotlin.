import vehicle.car.CreateCar
import vehicle.car.CreateCar as testCreateCar

fun main()
{
	val car3 = CreateCar.SelectTheBrand.BrandGhinea.SelectTheBodyType.BodyVan.Model.G3V()
	println("brandName: ${car3.brandName}")
	println("bodyName: ${car3.bodyName}")
	car3.printlnBrand()
	println("maxSpeedKmH: ${car3.maxSpeedKmH}")
	car3.printlnBody()
	
	val car5 = testCreateCar.SelectTheBrand.BrandGhinea.SelectTheBodyType.BodyVan.Model.G5V()
	println("brandName: ${car5.brandName}")
	println("bodyName: ${car5.bodyName}")
	car5.printlnBrand()
	println("maxSpeedKmH: ${car5.maxSpeedKmH}")
	car5.printlnBody()
	
	val car7 = CreateCar.SelectTheBrand.BrandGhinea.SelectTheBodyType.BodyVan.Model.G7V()
	car7.printlnBody()
	
}
