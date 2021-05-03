package principles.solid.o

abstract class APost
{
	class Display(private var post : IPost)
	{
		fun post()
		{
			post.display()
		}
	}
	
	abstract class AddPostToBase1()
	{}
	
	abstract class AddPostToBase2()
	{}
}
