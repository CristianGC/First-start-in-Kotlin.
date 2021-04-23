package core
/*
    Principii de baza ale POO :
    Abstractizarea
    Mostenirea
    Polimorfismul
    Incapsularea
*/

interface BurningTemperature
{
	var burningTemperature : Float
}

interface DieselFuel : BurningTemperature
{
	var dieselFuel : Int
}

interface GasolineFuel : BurningTemperature
{
	var gasolineFuel : Int
}

interface StartingTheCar
{
	fun startingTheCar()
	fun startingTheCar(stop : Boolean)
}

interface Bus : DieselFuel, StartingTheCar
{
	fun printlnBus()
}

interface Sedan : GasolineFuel, StartingTheCar
{
	fun printlnSedan()
}

interface Cabriolet : GasolineFuel, StartingTheCar
{
	fun printlnCabriolet()
	fun removeTheRoofFromTheCar()
}

abstract class Vehicle
{
	protected var maxSpeed = 0.0f
		set(value)
		{
			if (value <= 200)
			{
				field = value
				println("setMaxSpeed")
			}
			else
			{
				throw Exception("setMaxSpeed: Nu pot fi setate valori mai mari de 200")
			}
		}
	protected var carBrand : String = ""
		set(value)
		{
			field = setMaximumNumberOfCharacters(value, 10)
		}
	protected var carNumber : String = ""
		set(value)
		{
			field = setMaximumNumberOfCharacters(value, 20)
		}
	
	private fun setMaximumNumberOfCharacters(value : String, max : Int) : String
	{
		if (value.length < max)
		{
			println("setMaximumNumberOf Characters")
		}
		else
		{
			throw Exception("setMaximumNumberOf_Characters: Nu pot fi setate valori mai mari de $max")
		}
		
		return value
	}
	
	private fun fuelPumping()
	{
		println("\n 1: fuelPumping")
	}
	
	private fun startingTheStarter()
	{
		println(" 2: startingTheStarter")
	}
	
	private fun weTurnOnTheFuel()
	{
		println(" 3: weTurnOnTheFuel")
	}
	
	private fun startingTheEngine()
	{
		fuelPumping()
		startingTheStarter()
		weTurnOnTheFuel()
		println(" 4: startingTheEngine")
	}
	
	open fun startingTheCar()
	{
		startingTheEngine()
		println(" 5: StartingTheCar")
	}
}

class Car(maxSpeed : Float, carBrand : String, carNumber : String) : Vehicle(), Bus, Sedan, Cabriolet
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
		super.startingTheCar()
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
			super.startingTheCar()
			println("Mașina a fost creată de ură.")
		}
	}
}

