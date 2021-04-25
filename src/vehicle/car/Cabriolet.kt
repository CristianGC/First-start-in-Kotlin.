package vehicle.car

import vehicle.GasolineFuel
import vehicle.StartingTheCar

interface Cabriolet : GasolineFuel, StartingTheCar
{
	fun printlnCabriolet()
	{
		println("printlnCabriolet")
	}
	
	fun removeTheRoofFromTheCar()
	{
		println("removeTheRoofFromTheCar")
	}
}
