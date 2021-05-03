package principles.solid.d

class Car : IBrand, IChangeTheWheels
{
	override var brandName : String = ""
		get() = field
		set(value)
		{
		}
	lateinit var wheels : Wheels
	
	final override fun changeNewWheels(wheels : Wheels)
	{
		println("wheels.wheelDiameter : ${wheels.wheelDiameter}")
		if (wheels.wheelDiameter < 13)
		{
			throw Exception("Roțile sunt prea mici, trebuie să fie de 13 și mai mari.")
		}
		
		if(wheels.wheelDiameter > 23)
		{
			throw Exception("Roțile sunt prea ,mari, trebuie să fie de 23 și mai mici.")
		}
		
		this.wheels = wheels
	}
}
