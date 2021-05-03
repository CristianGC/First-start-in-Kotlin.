package principles.solid.o

class PostPhoto(final override var name : String, var foto : String) : IPost
{
	final override fun display()
	{
		println("PostPhoto : display")
	}
}
