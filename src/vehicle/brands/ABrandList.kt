package vehicle.brands

abstract class ABrandList
{
	class Ghinea : IBrandName
	{
		final override val brandName : String
			get() = "Ghinea"
	}
	
	class Joli : IBrandName
	{
		override val brandName : String
			get() = "Joli"
	}
	
	class Cami : IBrandName
	{
		override val brandName : String
			get() = "Cami"
	}
}
