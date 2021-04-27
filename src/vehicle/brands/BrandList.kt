package vehicle.brands

abstract class BrandList
{
	open class Ghinea : Brand
	{
		final override val brandName : String
			get() = "Ghinea"
	}
	
	open class  Joli : Brand
	{
		final override val brandName : String
			get() = "Joli"
	}
	
	open class  Cami : Brand
	{
		final override val brandName : String
			get() = "Cami"
	}
}
