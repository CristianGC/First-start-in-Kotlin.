package vehicle.car

import vehicle.Vehicle

open class Car() : Vehicle()
{
	init
	{
		println("\nCar:")
	}
	
	override val maxSpeedKmH : Float = 500.0f
	
}

