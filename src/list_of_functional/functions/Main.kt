package list_of_functional.functions

fun main()
{
	val obj : Any
	
	obj = 10 apply { it * 3 } apply { it + 2 } apply { "String value: $it" } apply { it.lowercase() }
	
	println("obj: ${obj}")
	val person = Person("Cristian", 25)
	
	person apply2 {
		name = "Cristina"
		age = 23
	}
	val obj2 = person apply2 {
		name
	} apply {
		"Person-Name: $it"
	} apply {
		it.uppercase()
	}
	
	println(obj2)
}
