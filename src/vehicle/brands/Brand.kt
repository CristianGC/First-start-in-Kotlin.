package vehicle.brands

interface Brand
{
	abstract class Ghinea() : SomethingSpecialforBrands
	{
		override val name : String
			get() = "Ghinea"
	}
	
	abstract class Joli() : SomethingSpecialforBrands
	{
		override val name : String
			get() = "Joli"
	}
	
	abstract class Cami() : SomethingSpecialforBrands
	{
		override val name : String
			get() = "Cami"
	}
	
	abstract class Oli() : SomethingSpecialforBrands
	{
		override val name : String
			get() = "Oli"
	}
}
