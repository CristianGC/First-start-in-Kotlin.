package vehicle.brands

abstract class BrandList
{
	class Ghinea : BrandName
	{
		final override val brandName : String
			get() = "Ghinea"
	}
	
	class Joli : BrandName
	{
		override val brandName : String
			get() = "Joli"
	}
	
	class Cami : BrandName
	{
		override val brandName : String
			get() = "Cami"
	}
}
