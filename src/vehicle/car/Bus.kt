package vehicle.car

import vehicle.DieselFuel
import vehicle.StartingTheCar

interface Bus : DieselFuel, StartingTheCar
{
	fun printlnBus()
	{
		println("printlnBus")
	}
}
