package vehicle

abstract class Vehicle : ElectricFuel, GasFuel, GasolineFuel, DieselFuel
{
	open val maxSpeedKmH = 10000.0f
}
