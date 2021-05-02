import principles.solid.*
import vehicle.car.ACreateCar

fun main()
{
	
	val car3 = ACreateCar.SelectTheBrand.BrandGhinea.SelectTheBodyType.BodyVan.Model.G3V()
	println("brandName: ${car3.brandName}")
	println("bodyName: ${car3.bodyName}")
	car3.printlnBrand()
	println("maxSpeedKmH: ${car3.maxSpeedKmH}")
	car3.printlnBody()
	
	val car7 = ACreateCar.SelectTheBrand.BrandGhinea.SelectTheBodyType.BodyVan.Model.G7V()
	car7.printlnBody()
	
	/*
	val allWorker : Array<Worker> = arrayOf(Chef("Kalia"), Driver("Gali"), Gardener("Filana"), Painter("Inapia"))
	printalAllNameSpeciality(allWorker)
	val printAllName = PrintAllName(Chef("Kalia"))
	printAllName.printlnName()
	*/
}

fun printalAllNameSpeciality(arrayValue : Array<AWorker>)
{
	for (item in arrayValue)
	{
		item.printalNameSpeciality()
	}
}
