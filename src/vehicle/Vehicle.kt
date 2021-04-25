package vehicle

abstract class Vehicle
{
	protected var maxSpeed = 0.0f
		set(value)
		{
			if (value <= 200)
			{
				field = value
				println("setMaxSpeed")
			} else
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
		} else
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
}