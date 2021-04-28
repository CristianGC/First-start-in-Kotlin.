package vehicle.car

import vehicle.brands.BrandName

abstract class WeSelectTheTypeofCar
{
	abstract class BodyTypeList
	{
		open class BodyVan(private val valueBrandName : BrandName) : Car(valueBrandName)
		{
			final override val bodyName : String
				get() = "Van"
		}
		
		open class BodyStationWagon(private val valueBrandName : BrandName) : Car(valueBrandName)
		{
			final override val bodyName : String
				get() = "StationWagon"
		}
		
		open class BodyMinivan(private val valueBrandName : BrandName) : Car(valueBrandName)
		{
			final override val bodyName : String
				get() = "Minivan"
		}
		
		open class BodyRoadster(private val valueBrandName : BrandName) : Car(valueBrandName)
		{
			final override val bodyName : String
				get() = "Roadster"
		}
		
		open class BodySUV(private val valueBrandName : BrandName) : Car(valueBrandName)
		{
			final override val bodyName : String
				get() = "SUV"
		}
		
		open class BodyCabriolet(private val valueBrandName : BrandName) : Car(valueBrandName)
		{
			final override val bodyName : String
				get() = "Cabriolet"
		}
		
		open class BodyMicrovan(private val valueBrandName : BrandName) : Car(valueBrandName)
		{
			final override val bodyName : String
				get() = "Microvan"
		}
		
		open class BodyPickup(private val valueBrandName : BrandName) : Car(valueBrandName)
		{
			final override val bodyName : String
				get() = "Pickup"
		}
		
		open class BodyCoupe(private val valueBrandName : BrandName) : Car(valueBrandName)
		{
			final override val bodyName : String
				get() = "Coupe"
		}
		
		open class BodySedan(private val valueBrandName : BrandName) : Car(valueBrandName)
		{
			final override val bodyName : String
				get() = "Sedan"
		}
		
		open class BodyCrossover(private val valueBrandName : BrandName) : Car(valueBrandName)
		{
			final override val bodyName : String
				get() = "Crossover"
		}
		
		open class BodyCombi(private val valueBrandName : BrandName) : Car(valueBrandName)
		{
			final override val bodyName : String
				get() = "Combi"
		}
		
		open class BodyHatchback(private val valueBrandName : BrandName) : Car(valueBrandName)
		{
			final override val bodyName : String
				get() = "Hatchback"
		}
	}
}
