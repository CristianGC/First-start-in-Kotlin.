package principles.solid.o

class PostCar(final override var name : String, var brand : String) : IPost
{
	final override fun display()
	{
		println("PostCar : display")
	}
}