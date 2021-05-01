package principles.solid

class Chef(override var name : String) : Worker(),  Name, PrintName
{
	final override val theNameofTheSpecialty : String
		get() = "Chef"
	
	final override fun printName()
	{
		print("name: ${this.name}")
	}
}
