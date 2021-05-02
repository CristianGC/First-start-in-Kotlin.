package principles.solid

abstract class AWorker
{
	abstract val theNameofTheSpecialty : String
	
	fun printalNameSpeciality()
	{
		println(this.theNameofTheSpecialty)
	}
}
