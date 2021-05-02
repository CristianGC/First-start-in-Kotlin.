package principles.solid

class Gardener(override var name : String) : AWorker(), IName, IPrintName
{
	final override val theNameofTheSpecialty : String
		get() = "Gardener"
	
	final override fun printName()
	{
		print("name: ${this.name}")
	}
}
