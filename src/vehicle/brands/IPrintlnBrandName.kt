package vehicle.brands

interface IPrintlnBrandName : IBrandName
{
	fun printlnBrand()
	{
		println("BrandName: " + this.brandName)
	}
}