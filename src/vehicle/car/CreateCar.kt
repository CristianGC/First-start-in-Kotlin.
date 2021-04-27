package vehicle.car

import vehicle.brands.BrandList
import vehicle.car.`body type`.BodyTypeList

abstract class CreateCar
{
	abstract class SelectTheBrand
	{
		abstract class BrandGhinea
		{
			abstract class SelectTheBodyType
			{
				abstract class BodyVan
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyStationWagon
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyMinivan
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyRoadster
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodySUV
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyCabriolet
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyMicrovan
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyPickup
				{
					abstract class Model
					{
						open class G3P() : BodyTypeList.BodyNamePickup(), BrandList.Ghinea
						{
							final override val maxSpeedKmH : Float = 70.0f
							final override fun printlnBrand()
							{
								super.printlnBrand()
							}
							
							final override fun printlnBody()
							{
								super.printlnBody()
							}
						}
						
						open class G5P() : BodyTypeList.BodyNamePickup(), BrandList.Ghinea
						{
							final override val maxSpeedKmH : Float = 140.0f
						}
						
						open class G7P() : BodyTypeList.BodyNamePickup(), BrandList.Ghinea
						{
							final override val maxSpeedKmH : Float = 200.0f
						}
					}
				}
				
				abstract class BodyCoupe
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodySedan
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyCrossover
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyCombi
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyHatchback
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
			}
		}
		
		abstract class BrandJoli
		{
			abstract class SelectTheBodyType
			{
				abstract class BodyVan
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyStationWagon
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyMinivan
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyRoadster
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodySUV
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyCabriolet
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyMicrovan
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyPickup
				{
					abstract class Model
					{
						open class J3P() : BrandList.Joli, BodyTypeList.BodyNamePickup()
						{}
						
						open class J5P() : BrandList.Joli, BodyTypeList.BodyNamePickup()
						{}
						
						open class J7P() : BrandList.Joli, BodyTypeList.BodyNamePickup()
						{}
					}
				}
				
				abstract class BodyCoupe
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodySedan
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyCrossover
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyCombi
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyHatchback
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
			}
		}
		
		abstract class BrandCami
		{
			abstract class SelectTheBodyType
			{
				abstract class BodyVan
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyStationWagon
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyMinivan
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyRoadster
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodySUV
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyCabriolet
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyMicrovan
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyPickup
				{
					abstract class Model
					{
						open class C3P() : BrandList.Cami, BodyTypeList.BodyNamePickup()
						{}
						
						open class C5P() : BrandList.Cami, BodyTypeList.BodyNamePickup()
						{}
						
						open class C7P() : BrandList.Cami, BodyTypeList.BodyNamePickup()
						{}
					}
				}
				
				abstract class BodyCoupe
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodySedan
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyCrossover
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyCombi
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
				
				abstract class BodyHatchback
				{
					abstract class Model
					{
						open class ThereAreNoModels()
						{}
					}
				}
			}
		}
	}
	
}
