package vehicle.car

import vehicle.brands.IBrandName

abstract class AWeSelectTheTypeofCar
{
	abstract class BodyTypeList
	{
		open class BodyVan(private val valueIBrandName : IBrandName) : Car(valueIBrandName)
		{
			final override val bodyName : String
				get() = "Van"
		}
		
		open class BodyStationWagon(private val valueIBrandName : IBrandName) : Car(valueIBrandName)
		{
			final override val bodyName : String
				get() = "StationWagon"
		}
		
		open class BodyMinivan(private val valueIBrandName : IBrandName) : Car(valueIBrandName)
		{
			final override val bodyName : String
				get() = "Minivan"
		}
		
		open class BodyRoadster(private val valueIBrandName : IBrandName) : Car(valueIBrandName)
		{
			final override val bodyName : String
				get() = "Roadster"
		}
		
		open class BodySUV(private val valueIBrandName : IBrandName) : Car(valueIBrandName)
		{
			final override val bodyName : String
				get() = "SUV"
		}
		
		open class BodyCabriolet(private val valueIBrandName : IBrandName) : Car(valueIBrandName)
		{
			final override val bodyName : String
				get() = "Cabriolet"
		}
		
		open class BodyMicrovan(private val valueIBrandName : IBrandName) : Car(valueIBrandName)
		{
			final override val bodyName : String
				get() = "Microvan"
		}
		
		open class BodyPickup(private val valueIBrandName : IBrandName) : Car(valueIBrandName)
		{
			final override val bodyName : String
				get() = "Pickup"
		}
		
		open class BodyCoupeI(private val valueIBrandName : IBrandName) : Car(valueIBrandName)
		{
			final override val bodyName : String
				get() = "Coupe"
		}
		
		open class BodySedan(private val valueIBrandName : IBrandName) : Car(valueIBrandName)
		{
			final override val bodyName : String
				get() = "Sedan"
		}
		
		open class BodyCrossover(private val valueIBrandName : IBrandName) : Car(valueIBrandName)
		{
			final override val bodyName : String
				get() = "Crossover"
		}
		
		open class BodyCombi(private val valueIBrandName : IBrandName) : Car(valueIBrandName)
		{
			final override val bodyName : String
				get() = "Combi"
		}
		
		open class BodyHatchback(private val valueIBrandName : IBrandName) : Car(valueIBrandName)
		{
			final override val bodyName : String
				get() = "Hatchback"
		}
	}
}
