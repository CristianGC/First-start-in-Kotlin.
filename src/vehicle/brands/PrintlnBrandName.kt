package vehicle.brands

interface PrintlnBrandName : BrandName
{
	fun printlnBrand()
	{
		println("BrandName: " + this.brandName)
	}
}