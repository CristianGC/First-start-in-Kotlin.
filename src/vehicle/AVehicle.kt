package vehicle

abstract class AVehicle : IElectricFuel, IGasFuel, IGasolineFuel, IDieselFuel
{
	open val maxSpeedKmH = 10000.0f
}
