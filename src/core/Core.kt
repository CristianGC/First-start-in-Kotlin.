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
	fun StartingTheCar()
	fun StartingTheCar(stop : Boolean)
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

abstract class Vehicle()
{
	protected var maxSpeed = 0.0f
		get() = field
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
		get() = field
		set(value)
		{
			field = setMaximumNumberOf_Characters(value, 10)
		}
	protected var carNumber : String = ""
		get() = field
		set(value)
		{
			field = setMaximumNumberOf_Characters(value, 20)
		}
	
	private fun setMaximumNumberOf_Characters(value : String, max : Int) : String
	{
		if (value.length < max)
		{
			println("setMaximumNumberOf_Characters")
		}
		else
		{
			throw Exception("setMaximumNumberOf_Characters: Nu pot fi setate valori mai mari de ${max}")
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
	
	open fun StartingTheCar()
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
		
		println("maxSpeed: ${maxSpeed}")
		println("carBrand: ${carBrand}")
		println("carNumber: ${carNumber}")
	}
	
	override fun printlnBus()
	{
		println("printlnBus")
	}
	
	override var dieselFuel : Int = 0
		get() = field
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
		get() = field
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
		get() = field
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
	
	override fun StartingTheCar()
	{
		super.StartingTheCar()
		println("Mașina a fost creată de ură.")
	}
	
	override fun StartingTheCar(stop : Boolean)
	{
		if (stop == false)
		{
			println("Din anumite motive, a refuzat să pornească mașina.")
		}
		else
		{
			super.StartingTheCar()
			println("Mașina a fost creată de ură.")
		}
	}
}

