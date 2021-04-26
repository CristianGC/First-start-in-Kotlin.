package vehicle.brands

interface  Brand : BrandName
{
	fun printlnBrand()
	{
		println("Brand: ${this.brandName}")
	}
}
