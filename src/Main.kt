import vehicle.car.CreateCar
import vehicle.car.CreateCar as testCreateCar

fun main()
{
	val car3 = CreateCar.SelectTheBrand.BrandGhinea.SelectTheBodyType.BodyPickup.Model.G3P()
	println("brandName: ${car3.brandName}")
	println("bodyName: ${car3.bodyName}")
	car3.printlnBrand()
	println("maxSpeedKmH: ${car3.maxSpeedKmH}")
	car3.printlnBody()
	
	val car5 = testCreateCar.SelectTheBrand.BrandGhinea.SelectTheBodyType.BodyPickup.Model.G5P()
	println("brandName: ${car5.brandName}")
	println("bodyName: ${car5.bodyName}")
	car5.printlnBrand()
	println("maxSpeedKmH: ${car5.maxSpeedKmH}")
	car5.printlnBody()
	
	val car7 = CreateCar.SelectTheBrand.BrandJoli.SelectTheBodyType.BodyPickup.Model.J7P()
	car7.printlnBody()
	
}
