package principles.solid.d

open class Wheels : IWheelDiameter
{
	final override var wheelDiameter : Int = 0
		get() = field
		set(value)
		{
			if (value < 100 && value > 10)
			{
				field = value
			}
			else
			{
				throw Exception("wheelDiameter este mai mare de 100. sau mai mică de cât 10")
			}
		}
}
