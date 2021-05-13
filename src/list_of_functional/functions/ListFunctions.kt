package list_of_functional.functions

inline infix fun <T, R> T.apply(appfunc : (x : T) -> R) : R
{
	return appfunc(this)
}

inline infix fun <T, R> T.apply2(appfunc : T.() -> R) : R
{
	return this.appfunc()
}

class Person(var name : String = "", var age : Int)
