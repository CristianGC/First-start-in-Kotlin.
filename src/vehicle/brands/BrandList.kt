package vehicle.brands

abstract class BrandList
{
	interface Ghinea : Brand
	{
		override val brandName : String
			get() = "Ghinea"
	}
	
	interface Joli : Brand
	{
		override val brandName : String
			get() = "Joli"
	}
	
	interface Cami : Brand
	{
		override val brandName : String
			get() = "Cami"
	}
}
