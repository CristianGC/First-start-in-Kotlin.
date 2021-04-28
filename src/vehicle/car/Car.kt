package vehicle.car

import vehicle.Vehicle
import vehicle.brands.Brand
import vehicle.brands.BrandName
import vehicle.car.`body type`.Body

open class Car(private val valueBrandName : BrandName) : Vehicle(), Body, Brand
{
	init
	{
		println("\nCar:")
	}
	
	final override val brandName : String
		get() = valueBrandName.brandName.toString()
	override val bodyName : String
		get() = "Body Base"
	override val maxSpeedKmH : Float = 500.0f
	final override fun printlnBrand()
	{
		super.printlnBrand()
	}
	
	final override fun printlnBody()
	{
		super.printlnBody()
	}
}
