import solid.*
import vehicle.car.CreateCar
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main()
{
	/*
	val car3 = CreateCar.SelectTheBrand.BrandGhinea.SelectTheBodyType.BodyVan.Model.G3V()
	println("brandName: ${car3.brandName}")
	println("bodyName: ${car3.bodyName}")
	car3.printlnBrand()
	println("maxSpeedKmH: ${car3.maxSpeedKmH}")
	car3.printlnBody()
	
	val car7 = CreateCar.SelectTheBrand.BrandGhinea.SelectTheBodyType.BodyVan.Model.G7V()
	car7.printlnBody()
	 */
	

	var allWorker : Array<Worker> = arrayOf(Chef("Kalia"),Driver("Gali"),Gardener("Filana"),Painter("Inapia"))
	printalAllNameSpeciality(allWorker)
	
	var printAllName = PrintAllName(Chef("Kalia"))
	printAllName.printlnName()
	
}

fun printalAllNameSpeciality(arrayValue : Array<Worker>)
{
	for (item in arrayValue)
	{
		item.printalNameSpeciality()
	}
}
