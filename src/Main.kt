import principles.solid.*
import vehicle.car.ACreateCar
import principles.solid.o.*

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
	
	var post1 = PostCar("PostCarr","TESLA")
	var post2 = PostPhoto("PostPhoto","TESLA")
	
	APost.Display(post1).post()
	APost.Display(post2).post()
}

fun printalAllNameSpeciality(arrayValue : Array<AWorker>)
{
	for (item in arrayValue)
	{
		item.printalNameSpeciality()
	}
}
