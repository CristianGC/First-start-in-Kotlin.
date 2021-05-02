package principles.solid

class Painter(override var name : String) : AWorker(), IName, IPrintName
{
	final override val theNameofTheSpecialty : String
		get() = "Painter"
	
	final override fun printName()
	{
		print("name: ${this.name}")
	}
}
