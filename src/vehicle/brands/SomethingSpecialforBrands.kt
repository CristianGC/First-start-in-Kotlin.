package vehicle.brands

interface SomethingSpecialforBrands : Name
{
	fun Special()
	{
		println("Special to ${this.name}")
	}
}
