package principles.solid

class PrintAllName(var name : IName)
{
	fun printlnName()
	{
		println("name: ${name.name}")
	}
}
