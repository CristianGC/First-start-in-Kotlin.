package vehicle.car.`body type`

import vehicle.car.Car

abstract class BodyTypeList
{
	open class BodyNameVan() : Car(), Body
	{
		final override val bodyName : String
			get() = "Van"
	}
	
	open class BodyNameStationWagon() : Car(), Body
	{
		final override val bodyName : String
			get() = "StationWagon"
	}
	
	open class BodyNameMinivan() : Car(), Body
	{
		final override val bodyName : String
			get() = "Minivan"
	}
	
	open class BodyNameRoadster() : Car(), Body
	{
		final override val bodyName : String
			get() = "Roadster"
	}
	
	open class BodyNameSUV() : Car(), Body
	{
		final override val bodyName : String
			get() = "SUV"
	}
	
	open class BodyNameCabriolet() : Car(), Body
	{
		final override val bodyName : String
			get() = "Cabriolet"
	}
	
	open class BodyNameMicrovan() : Car(), Body
	{
		final override val bodyName : String
			get() = "Microvan"
	}
	
	open class BodyNamePickup() : Car(), Body
	{
		final override val bodyName : String
			get() = "Pickup"
	}
	
	open class BodyNameCoupe() : Car(), Body
	{
		final override val bodyName : String
			get() = "Coupe"
	}
	
	open class BodyNameSedan() : Car(), Body
	{
		final override val bodyName : String
			get() = "Sedan"
	}
	
	open class BodyNameCrossover() : Car(), Body
	{
		final override val bodyName : String
			get() = "Crossover"
	}
	
	open class BodyNameCombi() : Car(), Body
	{
		final override val bodyName : String
			get() = "Combi"
	}
	
	open class BodyNameHatchback() : Car(), Body
	{
		final override val bodyName : String
			get() = "Hatchback"
	}
}
