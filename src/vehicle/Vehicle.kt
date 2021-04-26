package vehicle

abstract class Vehicle
{
	open val maxSpeedKmH = 10000.0f
	
	
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