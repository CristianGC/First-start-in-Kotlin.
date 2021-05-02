package vehicle.car

import vehicle.AVehicle
import vehicle.brands.IBrand
import vehicle.brands.IBrandName
import vehicle.car.`body type`.IBody

open class Car(private val valueIBrandName : IBrandName) : AVehicle(), IBody, IBrand
{
	init
	{
		println("\nCar:")
	}
	
	final override val brandName : String
		get() = valueIBrandName.brandName.toString()
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
