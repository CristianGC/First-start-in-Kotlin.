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
	override var electricFuel : Int
		get() = 0
		set(value)
		{
		}
	override var gasFuel : Int
		get() = 0
		set(value)
		{
		}
	override var gasolineFuel : Int
		get() = 0
		set(value)
		{
		}
	override var dieselFuel : Int
		get() = 0
		set(value)
		{
		}
	
	final override fun printlnBrand()
	{
		super.printlnBrand()
	}
	
	final override fun printlnBody()
	{
		super.printlnBody()
	}
}
