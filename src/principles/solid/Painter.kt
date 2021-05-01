package principles.solid

class Painter(override var name : String) : Worker(),  Name, PrintName
{
	final override val theNameofTheSpecialty : String
		get() = "Painter"
	
	final override fun printName()
	{
		print("name: ${this.name}")
	}
}
