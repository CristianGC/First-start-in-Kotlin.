package vehicle.car

import vehicle.Vehicle

class Car(maxSpeed : Float, carBrand : String, carNumber : String) : Vehicle(), Bus, Cabriolet, Sedan
{
	init
	{
		println("\nCar:")
		this.maxSpeed = maxSpeed
		this.carBrand = carBrand
		this.carNumber = carNumber
		
		println("maxSpeed: $maxSpeed")
		println("carBrand: $carBrand")
		println("carNumber: $carNumber")
	}
	
	override fun printlnBus()
	{
		println("printlnBus")
	}
	
	override var dieselFuel : Int = 0
		set(value)
		{
			if (value <= 200)
			{
				field = value
				println("setDieselFuel")
			}
			else
			{
				throw Exception("dieselFuel: Nu pot fi setate valori mai mari de 200")
			}
		}
	
	override fun printlnSedan()
	{
		println("printlnSedan")
	}
	
	override fun printlnCabriolet()
	{
		println("printlnCabriolet")
	}
	
	override fun removeTheRoofFromTheCar()
	{
		println("removeTheRoofFromTheCar")
	}
	
	override var gasolineFuel : Int = 0
		set(value)
		{
			if (value < 100)
			{
				field = value
				println("setGasolineFuel")
			}
			else
			{
				throw Exception("gasolineFuel: Nu pot fi setate valori mai mari de 100")
			}
			
		}
	override var burningTemperature : Float = 0.0f
		set(value)
		{
			if (value < 90)
			{
				field = value
				println("setBurningTemperature")
			}
			else
			{
				throw Exception("BurningTemperature: Nu pot fi setate valori mai mari de 90")
			}
		}
	
	override fun startingTheCar()
	{
		println("Mașina a fost creată de ură.")
	}
	
	override fun startingTheCar(stop : Boolean)
	{
		if (stop)
		{
			println("Din anumite motive, a refuzat să pornească mașina.")
		}
		else
		{
			println("Mașina a fost creată de ură.")
		}
	}
}

