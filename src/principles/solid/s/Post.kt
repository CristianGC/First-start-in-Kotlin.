package principles.solid.s

class Post : ICreatePost, IEditPost, IDeletePost
{
	override fun create(create : ACreatePost)
	{
		create.create()
	}
	
	override fun edit(edit : AEditPost)
	{
		edit.edit()
	}
	
	override fun delete(delete : ADeletePost)
	{
		delete.delete()
	}
}
