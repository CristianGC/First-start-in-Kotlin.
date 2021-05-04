package principles.solid.s

class Post : ICreatePost, IEditPost, IDeletePost
{
	override fun create(create : ACreatePost)
	{
		create.create()
	}
	
	override fun edit()
	{
		TODO("Not yet implemented")
	}
	
	override fun delete()
	{
		TODO("Not yet implemented")
	}
}
