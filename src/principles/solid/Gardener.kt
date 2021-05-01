package principles.solid

class Gardener(override var name : String) : Worker(),  Name, PrintName
{
	final override val theNameofTheSpecialty : String
		get() = "Gardener"
	
	final override fun printName()
	{
		print("name: ${this.name}")
	}
}
