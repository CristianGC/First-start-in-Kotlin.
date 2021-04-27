package vehicle.car

import vehicle.Vehicle
import vehicle.brands.Brand
import vehicle.brands.BrandName
import vehicle.car.`body type`.Body

open class Car() : Vehicle()
{
	init
	{
		println("\nCar:")
	}
	
	override val maxSpeedKmH : Float = 500.0f
	
}

abstract class CarTest
{
	abstract class BodyTypeList
	{
		open class BodyVan(private val valueBrandName : BrandName) : Car(), Body, Brand
		{
			final override val bodyName : String
				get() = "Van"
			final override val brandName : String
				get() = valueBrandName.brandName.toString()
			
			final override fun printlnBody()
			{
				super.printlnBody()
			}
			
			final override fun printlnBrand()
			{
				super.printlnBrand()
			}
		}
		
		abstract class BodyStationWagon
		{}
		
		abstract class BodyMinivan
		{}
		
		abstract class BodyRoadster
		{}
		
		abstract class BodySUV
		{}
		
		abstract class BodyCabriolet
		{}
		
		abstract class BodyMicrovan
		{}
		
		abstract class BodyPickup
		{}
		
		abstract class BodyCoupe
		{}
		
		abstract class BodySedan
		{}
		
		abstract class BodyCrossover
		{}
		
		abstract class BodyCombi
		{}
		
		abstract class BodyHatchback
		{}
	}
}
