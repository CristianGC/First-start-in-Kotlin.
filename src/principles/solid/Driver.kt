package principles.solid

class Driver(override var name : String) : AWorker(), IName, IPrintName
{
	final override val theNameofTheSpecialty : String
		get() = "Driver"
	
	final override fun printName()
	{
		print("name: ${this.name}")
	}
}
