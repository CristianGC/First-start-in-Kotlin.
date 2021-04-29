package solid

abstract class Worker
{
	abstract val theNameofTheSpecialty : String
	
	fun printalNameSpeciality()
	{
		println(this.theNameofTheSpecialty)
	}
}
