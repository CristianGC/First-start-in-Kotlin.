package vehicle.car.`body type`

import vehicle.brands.Brand
import vehicle.brands.BrandName
import vehicle.brands.PrintlnBrandName
import vehicle.car.Car

abstract class BodyTypeList
{
	open class BodyVan(final override val brandName : BrandName) : Car(), Body, Brand
	{
		init
		{
			if (brandName is Brand)
			{
				println("\nbrandName: ${brandName} is Brand")
			}
			
			if (brandName is BrandName)
			{
				println("\nbrandName: ${brandName} is BrandName")
			}
			
			if (brandName is PrintlnBrandName)
			{
				println("\nbrandName: ${brandName} is PrintlnBrandName")
			}
		}
		
		final override val bodyName : String
			get() = "Van"
		
		final override fun printlnBody()
		{
			super.printlnBody()
		}
	}
	
	open class BodyStationWagon() : Car(), Body
	{
		final override val bodyName : String
			get() = "StationWagon"
	}
	
	open class BodyMinivan() : Car(), Body
	{
		final override val bodyName : String
			get() = "Minivan"
	}
	
	open class BodyRoadster() : Car(), Body
	{
		final override val bodyName : String
			get() = "Roadster"
	}
	
	open class BodySUV() : Car(), Body
	{
		final override val bodyName : String
			get() = "SUV"
	}
	
	open class BodyCabriolet() : Car(), Body
	{
		final override val bodyName : String
			get() = "Cabriolet"
	}
	
	open class BodyMicrovan() : Car(), Body
	{
		final override val bodyName : String
			get() = "Microvan"
	}
	
	open class BodyPickup() : Car(), Body
	{
		final override val bodyName : String
			get() = "Pickup"
	}
	
	open class BodyCoupe() : Car(), Body
	{
		final override val bodyName : String
			get() = "Coupe"
	}
	
	open class BodySedan() : Car(), Body
	{
		final override val bodyName : String
			get() = "Sedan"
	}
	
	open class BodyCrossover() : Car(), Body
	{
		final override val bodyName : String
			get() = "Crossover"
	}
	
	open class BodyCombi() : Car(), Body
	{
		final override val bodyName : String
			get() = "Combi"
	}
	
	open class BodyHatchback() : Car(), Body
	{
		final override val bodyName : String
			get() = "Hatchback"
	}
}
