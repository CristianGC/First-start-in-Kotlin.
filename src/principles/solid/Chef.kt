package principles.solid

class Chef(override var name : String) : AWorker(), IName, IPrintName
{
	final override val theNameofTheSpecialty : String
		get() = "Chef"
	
	final override fun printName()
	{
		print("name: ${this.name}")
	}
}
