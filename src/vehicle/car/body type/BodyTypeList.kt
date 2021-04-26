package vehicle.car.`body type`

import vehicle.car.Car

abstract class BodyTypeList
{
	open class BodyVan() : Car()
	{
		val bodyName : String
			get() = "Van"
	}
	
	open class BodyStationWagon() : Car()
	{
		val bodyName : String
			get() = "StationWagon"
	}
	
	open class BodyMinivan() : Car()
	{
		val bodyName : String
			get() = "Minivan"
	}
	
	open class BodyRoadster() : Car()
	{
		val bodyName : String
			get() = "Roadster"
	}
	
	open class BodySUV() : Car()
	{
		val bodyName : String
			get() = "SUV"
	}
	
	open class BodyCabriolet() : Car()
	{
		val bodyName : String
			get() = "Cabriolet"
	}
	
	open class BodyMicrovan() : Car()
	{
		val bodyName : String
			get() = "Microvan"
	}
	
	open class BodyPickup() : Car()
	{
		val bodyName : String
			get() = "Pickup"
	}
	
	open class BodyCoupe() : Car()
	{
		val bodyName : String
			get() = "Coupe"
	}
	
	open class BodySedan() : Car()
	{
		val bodyName : String
			get() = "Sedan"
	}
	
	open class BodyCrossover() : Car()
	{
		val bodyName : String
			get() = "Crossover"
	}
	
	open class BodyCombi() : Car()
	{
		val bodyName : String
			get() = "Combi"
	}
	
	open class BodyHatchback() : Car()
	{
		val bodyName : String
			get() = "Hatchback"
	}
}
