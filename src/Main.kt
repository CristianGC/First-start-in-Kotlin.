import principles.solid.*
import principles.solid.d.Car
import principles.solid.d.WheelsWithSummerTires
import principles.solid.d.WheelsWithWinterTires
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
	
	val post1 = PostCar("PostCarr","TESLA")
	val post2 = PostPhoto("PostPhoto","TESLA")
	
	APost.Display(post1).post()
	APost.Display(post2).post()
	
	val wheelsWinter = WheelsWithWinterTires()
	wheelsWinter.wheelDiameter = 17
	val wheelsSummer = WheelsWithSummerTires()
	wheelsSummer.wheelDiameter = 23
	val car1 = Car()
	car1.changeNewWheels(wheelsWinter)
	car1.changeNewWheels(wheelsSummer)
}

fun printalAllNameSpeciality(arrayValue : Array<AWorker>)
{
	for (item in arrayValue)
	{
		item.printalNameSpeciality()
	}
}
