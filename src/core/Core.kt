package core

fun sumaV1(a : Int, b : Int) : Int
{
	return a + b
}

fun sumaV2(a : Int, b : Int) = a + b

fun sumaV3(a : Int, b : Int)
{
	println(a + b)
}

fun sumaV4(a : Int, b : Int)
{
	println(a + b)
}

// Funcționează, dar rezultatul este 1
fun variablesOnlyForReading()
{
	val a = 1
	val b : Int
	b = 1
	val c : Int
	c = 1
	c + b + a
	
	println(c)
}

fun variablesCanBeChanged()
{
	val a = 10
	val b = 20
	var c : Int
	c = 30
	c += b + a
	
	println(c)
}

val x = 3
var w = 2

fun multiplication()
{
	w *= x
	
	println(w)
}

fun usingStringTemplates()
{
	val a = 100
	val s1 = "a = $a"
	
	println(s1)
}

fun maxV1(a : Int, b : Int) : Int
{
	if (a > b) return a
	else return b
}

fun maxV2(a : Int, b : Int) = if (a > b) a else b

fun maxV3(a : Int, b : Int) : String
{
	if (a > b) return "$a"
	else if (a != b) return "$b"
	else return "Nici a nici b nu sunt mai mare."
}

fun maxV4(a : Int, b : Int)
{
	val max = if (a > b)
	{
		print("întoarcere a\n")
		a
	}
	else
	{
		print("întoarcere b\n")
		b
	}
	
	println("Max_4 max: $max")
}

// Destul de interesantă este această funcție.
fun maxV5(a : Int, b : Int) : Int?
{
	if (a > b) return a
	else if (a != b) return b
	else return null
}

//Am obținut un rezultat interesant după afișarea mesajului "Hello Kotlin! )))", sa afișat că tipul este null.
fun typeCheckingCharStringIntBooleanV1(Object : Any) : Boolean?
{
	println("\nType_checking: ")
	var type = ""
	
	if (Object is String)
	{
		println("Obiectul este de tip String")
		type = "String"
	}
	
	if (Object is Int)
	{
		println("Obiectul este de tip Int")
		type = "Int"
	}
	
	if (Object is Char)
	{
		println("Obiectul este de tip Char")
		type = "Char"
	}
	
	if (Object is Boolean)
	{
		println("Obiectul este de tip Boolean")
		type = "Boolean"
	}
	
	if (type != "")
	{
		println("Type: $type")
		return true
	}
	else
	{
		println("type: null")
		return null
	}
}

fun maximumNumberOfMatricesV1(Array : IntArray)
{
	println("\nMaximum_number_of_matrices: ")
	var max = 0
	
	for (Item : Int in Array)
	{
		println("Item: $Item")
		max = maxV1(max, Item)
	}
	
	println("Max: $max")
}

fun typeCheckingV2(Object : Any) : Any?
{
	val type : Array<Any> = arrayOf(Int, Float, Char, String, Boolean)
	
	println("\nType_checking_v2: ")
	
	if (Object is Int)
	{
		println("Obiectul este de tip Int")
		return type[0]
	}
	
	if (Object is Float)
	{
		println("Obiectul este de tip Float")
		return type[1]
	}
	
	if (Object is Char)
	{
		println("Obiectul este de tip Char")
		return type[2]
	}
	
	if (Object is String)
	{
		println("Obiectul este de tip String")
		return type[3]
	}
	
	if (Object is Boolean)
	{
		println("Obiectul este de tip Boolean")
		return type[4]
	}
	
	return null
}

fun usingIntervals()
{
	println("\nUsing_intervals: ")
	for (g in 0..9) print("$g-")
	print("\n")
	
	for (g in 0..10 step 2) print("$g-")
	print("\n")
	
	for (g in 9 downTo 0 step 3) print("$g-")
	print("\n")
	val items = setOf("apple", "banana", "kiwi")
	when
	{
		"orange" in items -> println("juicy")
		"apple" in items  -> println("apple is fine too")
	}
}

fun typeCheckingV3(Object : Any)
{
	println("\nType_checking_v3: ")
	println("Object Value: $Object")
	
	when (Object)
	{
		is Byte    -> println("Obiectul este de tip Byte")
		is Short   -> println("Obiectul este de tip Short")
		is Int     -> println("Obiectul este de tip Int")
		is Long    -> println("Obiectul este de tip Long")
		is Float   -> println("Obiectul este de tip Float")
		is Double  -> println("Obiectul este de tip Double")
		is Char    -> println("Obiectul este de tip Char")
		is String  -> println("Obiectul este de tip String")
		is Boolean -> println("Obiectul este de tip Boolean")
		else       -> println("Acest obiect în lista nui.")
	}
}

fun defaultValuesForFunctionParameters(a : Int = 3, Name : String = "Name")
{
	println("\nDefault_values_for_function_parameters")
	println("a: $a")
	println("Name: $Name")
}

private fun convertsTheColorStringToRGB(color : String) : IntArray
{
	return when (color)
	{
		"Red"   -> intArrayOf(255, 0, 0)
		"Green" -> intArrayOf(0, 255, 0)
		"Blue"  -> intArrayOf(0, 0, 255)
		else    -> throw IllegalArgumentException("Valoare nevalidă a parametrului culoare.")
	}
}

private fun convertsRgbColorToString(color : IntArray) : String
{
	return if (color.contentEquals(intArrayOf(255, 0, 0)))
	{
		"Red"
	}
	else if (color.contentEquals(intArrayOf(0, 255, 0)))
	{
		"Green"
	}
	else if (color.contentEquals(intArrayOf(0, 0, 255)))
	{
		"Blue"
	}
	else
	{
		throw IllegalArgumentException("Valoare nevalidă a parametrului culoare.")
	}
}

fun startColorConversion()
{
	println("\nstart_color_conversion: ")
	try
	{
		println("Color: ${convertsRgbColorToString(convertsTheColorStringToRGB("Red"))}")
		println("Color: ${convertsRgbColorToString(convertsTheColorStringToRGB("Blue"))}")
		println("Color: ${convertsRgbColorToString(convertsTheColorStringToRGB("Green"))}")
		//println("Color: ${convertsRgbColorToString(convertsTheColorStringToRGB("Color"))}")
	}
	catch (e : Exception)
	{
		throw IllegalStateException(e)
	}
}

class WeDisplay2Functions
{
	fun print1()
	{
		println("fun print1")
	}
	
	fun print2()
	{
		println("fun print2")
	}
}

val myObject_1 = WeDisplay2Functions()

fun printMyObject1()
{
	println("\nPrint_1: ")
	with(myObject_1) {
		print1()
		print2()
	}
}

fun transformFromCharToInt(c : Char) : Int
{
	println("\ntransform_from_char_to_int: ")
	if (c !in '0'..'9') throw IllegalArgumentException("În afara razei de acțiune")
	return c.toInt() - '0'.toInt()
}

fun copyTheArrayToArray(from : Array<out String>, to : Array<in String>)
{
	for ((index, value) in from.withIndex())
	{
		to[index] = value
	}
	
	println("\nfrom:")
	for ((index, value) in from.withIndex())
	{
		println("index: $index value: $value")
	}
	
	println("\nto:")
	for ((index, value) in to.withIndex())
	{
		println("index: $index value: $value")
	}
}

//----------------------------------------------------------------------------------------------------------------------
class Person0

class Person1
{}

class Person2(name : String, age : Int)
{}

class Person3(var name : String, val age : Int)
{}

class Person4 constructor(name : String, age : Int)
{}

class Person5 constructor(var name : String, val age : Int)
{}

class Person6 private constructor(name : String, age : Int)
{}

class Person7 private constructor(var name : String, val age : Int)
{}

class Person8 internal constructor(name : String, age : Int)
{}

class Person9 internal constructor(var name : String, val age : Int)
{
	init
	{
		println("\nPerson9")
		println("name: $name")
		println("age: $age")
	}
}

class Person10(name : String, age : Int)
{
	val firstProperty = name
	
	init
	{
		println("\nPerson10")
		println("firstProperty name: $firstProperty")
	}
	
	val secondProperty = age
	
	init
	{
		println("secondProperty age: $secondProperty")
	}
}

class Person11(name : String, age : Int)
{
	init
	{
		println("\nPerson11")
		println("Bloc de inițializare")
	}
	
	init
	{
		println("name: $name")
		println("age: $age")
	}
}

// Automat este creat constructor public.
abstract class Person12
{}

// Nu este creat automat constructor.
abstract class Person13 private constructor()
{}

interface _Man
{
	val whatKindOfMan : String
	var spaceGalaxy : String
	fun printlnSpaceGalaxy()
	{
	}
}

open class Person14(name : String, age : Int, override val whatKindOfMan : String = "Good", final override var spaceGalaxy : String = "It hosts a Kotlin galaxy :)") :
	_Man
{
	private var myName : String
	private var myAge : Int
	open val myLevel : Int = 0
	
	init
	{
		myName = name
		myAge = age
		println("Person14-------")
		println("name: $name age: $age myLevel: $myLevel whatKindOfMan: ${whatKindOfMan} spaceGalaxy: ${spaceGalaxy}")
	}
	
	open fun getName() : String
	{
		return myName
	}
	
	open fun getAge() : Int
	{
		return myAge
	}
	
	override fun printlnSpaceGalaxy()
	{
		println("Person14 spaceGalaxy: ${spaceGalaxy}")
	}
}

open class Person15(myName : String, myAge : Int) : Person14(myName, myAge), _Man
{
	final override val myLevel : Int
		get() = super.myLevel + 3
	final override val whatKindOfMan : String
		get() = "Bad"
	
	init
	{
		println("Person15-------")
		println("myName: $myName myAge: $myAge myLevel: ${myLevel + 10} whatKindOfMan: ${super.whatKindOfMan} spaceGalaxy: ${spaceGalaxy}")
	}
	
	override fun getName() : String
	{
		return "+++${super.getName()}+++"
	}
	
	fun getSuperGetName() : String
	{
		return super.getName()
	}
	
	final override fun getAge() : Int
	{
		return super.getAge() + 10
	}
	
	override fun printlnSpaceGalaxy()
	{
		println("Person15 spaceGalaxy: ${spaceGalaxy}")
	}
}

final class Person16(myName : String, myAge : Int) : Person15(myName, myAge)
{
	init
	{
		println("Person16-------")
		println("myName: $myName myAge: $myAge myLevel: ${super.myLevel} whatKindOfMan: $whatKindOfMan spaceGalaxy: ${spaceGalaxy}")
	}
	
	override fun getName() : String
	{
		return "---${super.getSuperGetName()}---"
	}
	
}

class Person17 : Person14("Cristian", 25)
{
	override fun printlnSpaceGalaxy()
	{
		println("\nPerson17: ")
		super<Person14>.printlnSpaceGalaxy()
	}
	
	inner class PrintlnGalaxy(var galaxy : String)
	{
		fun printlnSpaceGalaxy()
		{
			println("\nclass PrintlnGalaxy: ")
			println("galaxy: $galaxy")
			super@Person17.printlnSpaceGalaxy()
		}
	}
}

open class Person18(var name : String, var age : Int)
{
	init
	{
		println("\nPerson18:")
	}
	
	open fun printlnName() : Person18
	{
		println("Name: ${name}")
		return this
	}
	
	open fun printlnAge() : Person18
	{
		println("Age: ${age}")
		return this
	}
	
	inner class Println
	{
		fun name() : Println
		{
			println("Name: ${name}")
			return this
		}
		
		fun age() : Println
		{
			println("Age: ${age}")
			return this
		}
		
		fun prinlnNameAge() : String
		{
			return "Name: ${name}" + "Age: ${age}"
		}
	}
	
	open fun displayOfBasicPeople()
	{
		println("displayOfBasicPeople")
		Person18("Cristian", 25).Println().name().age()
	}
}

interface Factory<T>
{
	fun create() : T
}

interface Factory2<T>
{
	fun create2() : T
}

abstract class Person19()
{
	init
	{
		println("\nPerson19")
	}
	
	companion object : Factory<Person18>, Factory2<Person14>
	{
		final override fun create() : Person18 = Person18("Cristian", 25)
		
		final override fun create2() : Person14 = Person14("Cristian", 25)
	}
	
}

class Person20
{
	init
	{
		println("\nPerson20")
	}
	
	companion object
	{
		const val SUBSYSTEM_DEPRECATED : String = "Acest subsistem este învechit"
	}
	
	@Deprecated(Companion.SUBSYSTEM_DEPRECATED) fun oldFun(str : String)
	{
		println("oldFun $str Cristian")
	}
	
	fun newFun(str : String)
	{
		println("newFun $str Cristian")
	}
	
	fun weDisplayOddAndEvenNumbersFromTheList()
	{
		val isOdd = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
		val isEven = listOf(9, 8, 7, 6, 5, 4, 3, 2, 1)
		
		println("isOdd: ")
		println(isOdd.filter(::isOdd))
		
		println("isEven: ")
		println(isEven.filter(::isEven))
	}
	
	private fun weCheckTheName(name : String) = name == "Cristian" || name == "Cristina" || name == "Sanda" || name == "Masa" || name == "Nastea"
	
	val thisIsTheName : (String) -> Boolean = ::weCheckTheName
	
	// La moment nu prea inteleg cum functioneaza dar voi afla.
	// Prima funcție include a doua funcție
	fun <A, B, C> compose(fun1 : (B) -> C, fun2 : (A) -> B) : (A) -> C
	{
		return { x -> fun1(fun2(x)) }
	}
	
	fun weCheckIfTheWordLengthIsEvenOrOdd()
	{
		val oddLength = compose(::isOdd, ::length)
		val strings = listOf("1", "12", "123", "1234", "12345", "123456")
		println("weCheckIfTheWordLengthIsEvenOrOdd: ")
		println(strings.filter(oddLength))
	}
	
	fun <VALUE, Introduction1, Introduction2, theOutcome> compose2(fun1 : (Introduction2) -> theOutcome, fun2 : (Introduction1) -> Introduction2, fun3 : (VALUE) -> Introduction1) : (VALUE) -> theOutcome
	{
		return { R -> fun1(fun2(fun3(R))) }
	}
	
	private fun length(s : String) = s.length
	
	private fun isOdd(x : Int) = x % 2 != 0
	private fun isEven(x : Int) = x % 2 == 0
	
	private fun weInvertTheBoolValue(b : Boolean) = b != true
	
	fun weCheckIfTheWordLengthIsEvenOrOdd2()
	{
		val oddLength = compose2(::weInvertTheBoolValue, ::isOdd, ::length)
		val strings = listOf("1", "12", "123", "1234", "12345", "123456")
		println("\nweCheckIfTheWordLengthIsEvenOrOdd2: ")
		println(strings.filter(oddLength))
	}
}

class Person21
{
	init
	{
		println("Person21")
	}
	
	fun function(factory : () -> Person20)
	{
		val f : Person20 = factory()
		f.oldFun("Hi")
		f.newFun("Hi")
	}
	
	fun method()
	{
		println("method")
	}
}

public class Person22
{
	init
	{
		println("\nPerson22")
	}
	
	lateinit var lateinitWork : Person21
	fun startLateinitWork()
	{
		if (!::lateinitWork.isInitialized)
		{
			println("lateinitWork: Nu este inițializat")
			lateinitWork = Person21()
		}
		
		if (::lateinitWork.isInitialized)
		{
			println("lateinitWork: Este inițializată")
		}
	}
	
	val lazyWork : String by lazy {
		println("Start: lazyWork")
		"End: lazyWork"
	}
	
	fun startLazyWork()
	{
		println(lazyWork)
		println(lazyWork)
	}
	
}

class Person23
{
	constructor()
	constructor(num : Int, gap : Int)
	{
		number = num
		step = gap
	}
	
	init
	{
		println("\nPerson23")
	}
	
	var index = 0
		private set
		get()
		{
			return field + 10
		}
	
	fun printlnIndex1()
	{
		println("printlnIndex 1 index: ${index}")
		index = index
	}
	
	fun printlnIndex2()
	{
		println("printlnIndex 2 index: ${index}")
		index = index
	}
	
	fun printlnIndex3()
	{
		println("printlnIndex 3 index: ${index}")
		index = index
	}
	
	var number = 0
		get()
		{
			return field
		}
		private set(value)
		{
			field = value
		}
	var step = 0
		get()
		{
			return field
		}
		private set(value)
		{
			if (step % 2 == 0) field = value + 10
			else
			{
				field = value - 10
				printWarning(value)
			}
		}
	
	private fun printWarning(value : Int)
	{
		println("step: Valoarea este setată la minus 1. value: $value")
	}
	
	val stepNoOne : Boolean
		get()
		{
			return step != 1
		}
	
	fun printlnNumberStep()
	{
		println("number: $number")
		println("step: $step")
	}
	
}

interface printlnNameAge
{
	fun printlnName()
	fun printlnAge()
}

interface printlnProfession1
{
	fun printlnProfession()
	{
		println("Administratorul planetei")
	}
}

interface printlnProfession2
{
	fun printlnProfession()
	{
		println("Programator Galaxy")
	}
}

class Person24 : printlnNameAge, printlnProfession1, printlnProfession2
{
	init
	{
		println("\nPerson24")
	}
	
	constructor()
	constructor(name : String, age : Int)
	{
		this.name = name
		this.age = age
	}
	
	protected lateinit var name : String
	protected var age : Int = 0
	
	final override fun printlnName()
	{
		println("Name: ${this.name}")
	}
	
	final override fun printlnAge()
	{
		println("Age: ${this.age}")
	}
	
	final override fun printlnProfession()
	{
		super<printlnProfession1>.printlnProfession()
		super<printlnProfession2>.printlnProfession()
	}
}

open class Person25
{
	init
	{
		println("\nPerson25")
	}
	
	lateinit var name : String
	var age = 0
	
	constructor()
	constructor(name : String, age : Int)
	{
		this.name = name
		this.age = age
	}
}

fun Person25.printlnName()
{
	println(this.name)
}

fun Person25.printlnAge()
{
	println(this.age)
}

final class Person26
{
	init
	{
		println("\nPerson26")
	}
	
	internal fun printlnName(name : String)
	{
		println("name: ${name}")
	}
}

class Person27(private val name : String, private val age : Int)
{
	init
	{
		println("\nPerson27")
	}
	
	private fun printlnAge(age : Int)
	{
		println("age: ${age}")
	}
	
	private fun Person26.printlnNameAge()
	{
		println("fun printlnNameAge")
		printlnName(name)
		printlnAge(age)
		val thisPerson26printlnNameAge = this@printlnNameAge
		val thisPerson27 = this@Person27
	}
	
	fun caller(p : Person26)
	{
		p.printlnNameAge()
	}
	
	inner class innerPerson27
	{
		fun Boolean.isTrue()
		{
			val thisPerson27 = this@Person27
			val thisinnerPerson27 = this@innerPerson27
			val myBoolean1 = this
			val myBoolean2 = this@isTrue
		}
	}
}

interface BasePerson
{
	var name : String
	var age : Int
}

open class Person28 : BasePerson, Person30
{
	init
	{
		println("\nPerson28")
	}
	
	override var name : String = ""
		get() = field
		set(value)
		{
			field = value
		}
	override var age : Int = 0
		get() = field
		set(value)
		{
			field = value
		}
	
	constructor()
	constructor(name : String, age : Int)
	{
		this.name = name
		this.age = age
	}
	
	fun copy(name : String = this.name, age : Int = this.age) = Person28(name, age)
	
	operator fun component1() : String
	{
		return "Person28: " + name
	}
	
	operator fun component2() : Int
	{
		return ++age
	}
}

data class Person29(var name : String, var age : Int)

sealed class Person30
data class Age0(val number : Int) : Person30()
data class SumAge(val age1 : Person30, val age2 : Person30) : Person30()

fun checking(obj : Person30) : Int = when (obj)
{
	is Age0     -> obj.number
	is SumAge   -> checking(obj.age1) + checking(obj.age2)
	is Person28 -> obj.component2()
	else        -> 3
}

data class Name(var name : String)
data class Age(var name : Int)

//first class with typical parameters
class Person31<N, A>(n : N, a : A)
{
	init
	{
		println("\nPerson31")
	}
	
	private var nameValue = n
	private var ageValue = a
	
	fun printlnNameAge()
	{
		println("nameValue: ${nameValue}")
		println("ageValue: ${ageValue}")
	}
	
}

class PersonPrintln1
{
	fun printlnName(name : String) : String
	{
		return "PersonPrintln1 Name: " + name
	}
	
	fun printlnAge(age : String) : String
	{
		return "PersonPrintln1 Age: " + age
	}
}

class PersonPrintln2
{
	fun printlnName(name : String) : String
	{
		return "PersonPrintln2 Name: " + name
	}
	
	fun printlnAge(age : String) : String
	{
		return "PersonPrintln2 Age: " + age
	}
}

abstract class _Person<out T, in V, out H>
{
	abstract fun name(obj : V) : T
	abstract fun age(obj : V) : T
	abstract fun getType() : H
}

class Person32(var name : String, var age : String) : _Person<String, PersonPrintln2, PersonPrintln2>()
{
	init
	{
		println("\nPerson32")
	}
	
	override fun name(obj : PersonPrintln2) : String
	{
		return obj.printlnName(name)
	}
	
	override fun age(obj : PersonPrintln2) : String
	{
		return obj.printlnAge(age)
	}
	
	override fun getType() : PersonPrintln2
	{
		return PersonPrintln2()
	}
	
}

class Person33<G, V>(private var name : String, private var age : Int)
{
	private fun name(obj : G) : G
	{
		return obj
	}
	
	private fun age(obj : V) : V
	{
		return obj
	}
	
	private fun name(obj1 : G, obj2 : V)
	{
		println("fun name(obj1: ${obj1}, obj2:  ${obj2})")
	}
	
	private fun age(obj1 : G, obj2 : V)
	{
		println("fun age(obj1:  ${obj1}, obj2:  ${obj2})")
	}
	
	// The function does not have to work but it does work.
	fun test1(object19 : Person33<in String, Int>)
	{
		println(object19.name("Cristian"))
	}
	
	// The function does not work
	fun test2(object19 : Person33<out String, Int>)
	{
		//println(object19.name("Cristian"))
		//object19.name("Cristian",25)
	}
	
	// The function does not have to work but it does work.
	fun test3(object19 : Person33<String, in Int>)
	{
		object19.age(25)
	}
	
	// The function does not work
	fun test4(object19 : Person33<String, out Int>)
	{
		//object19.age(25)
	}
	
	// The function does not work
	fun test5(object19 : Person33<out String, out Int>)
	{
		//object19.name("Cristian")
		//object19.age(25)
		//object19.age("Cristian", 25)
		//object19.name("Cristian", 25)
	}
	
	// The function does not have to work but it does work.
	fun test6(object19 : Person33<in String, in Int>)
	{
		object19.name("Cristian")
		object19.age(25)
		object19.age("Cristian", 25)
		object19.name("Cristian", 25)
	}
}

class Test<T>
{
	fun test(obj : T) : T
	{
		return obj
	}
}

class Test1
{
	fun test1(obj : Test<in String>) : Any?
	{
		println("${obj.test("Cristian")}")
		
		if (obj.test("Cristian return") is String)
		{
			println("obj.test() Este String")
		}
		
		return obj.test("Cristian return")
	}
}

abstract class Person_C<T>
{
	abstract fun name(obj : T) : T
	
}
/*
class test(): Person_C<in String>
{
    override fun name(obj: String): Any?
    {
        return obj
    }
}
*/


internal interface Source<T>
{
	fun nextT() : T
	fun nextT1() : T
	fun nextT2() : T
	fun nextT3() : T
	fun nextT4() : T
	fun nextT5() : T
}

class tttt() : Source<Int>
{
	override fun nextT() : Int
	{
		TODO("Not yet implemented")
	}
	
	override fun nextT1() : Int
	{
		TODO("Not yet implemented")
	}
	
	override fun nextT2() : Int
	{
		TODO("Not yet implemented")
	}
	
	override fun nextT3() : Int
	{
		TODO("Not yet implemented")
	}
	
	override fun nextT4() : Int
	{
		TODO("Not yet implemented")
	}
	
	override fun nextT5() : Int
	{
		TODO("Not yet implemented")
	}
	
}

//Abstractizarea
abstract class A1
{
	abstract fun Test1() : String
	
	// Această funcție face unele calcule, dar nu știm cum.
	private fun Test2() : Int
	{
		return 0
	}
}

class A2() : A1()
{
	override fun Test1() : String
	{
		TODO("Not yet implemented")
	}
	
}

//Încapsularea
class I1()
{
	lateinit private var obj : String
	
	fun Test1()
	{
		obj = "00"
	}
	
	fun Test2(value : String)
	{
		obj += value
	}
}

// Polimorfismul
open class P1()
{
	open fun Test1() : String
	{
		return ""
	}
	
	open fun Test2() : String
	{
		return ""
	}
	
	open fun Test2(value : String)
	{
		println("value: ${value}")
	}
}

class P2() : P1()
{
	override fun Test1() : String
	{
		return "Test1"
	}
	
	override fun Test2() : String
	{
		super.Test2("super () Test2")
		return "Test2"
	}
}
/*
    Principii de baza ale POO :

    Abstractizarea:
        1 Clase abstracte
        2 Interfete
    Incapsularea
    Polimorfismul
    Mostenirea:
        1 Single
        2 Multilevel
        3 Hierarchical
        4 Multiple
        5 Hybrid
*/

interface Person
{
	fun myNameIs() : String
	fun iAmYearsOld() : Int
}

abstract class Man() : Person
{
	protected var name : String = ""
		get() = field
		protected set(value)
		{
			field = value
		}
	protected var age : Int = 0
		get() = field
		protected set(value)
		{
			field = value
		}
	
	override fun myNameIs() : String
	{
		return name
	}
	
	protected fun myNameIs(value : String)
	{
		println("myNameIs: ${value}")
	}
	
	override fun iAmYearsOld() : Int
	{
		return age
	}
	
	protected fun iAmYearsOld(value : Int)
	{
		println("iAmYearsOld: ${value}")
	}
	
	abstract fun iWantToWork() : Boolean
}

abstract class Worker() : Man()
{
	protected var iWorkOrNot : Boolean = true
	override fun iWantToWork() : Boolean
	{
		return iWorkOrNot
	}
	
	abstract fun okIKeepWorking()
}

abstract class DeveloperInKotlin() : Worker()
{
	override fun okIKeepWorking()
	{
		println("Da lucrez mai departe ca DeveloperInKotlin")
	}
}

abstract class ProjectManager() : Worker()
{
	override fun okIKeepWorking()
	{
		println("Da lucrez mai departe ca ProjectManager")
	}
}

open class Cristian(name : String, age : Int) : DeveloperInKotlin()
{
	init
	{
		this.name = name
		this.age = age
		
		myNameIs(this.name)
		iAmYearsOld(this.age)
	}
	
	override fun myNameIs() : String
	{
		return super.myNameIs() + " DeveloperInKotlin"
	}
}

open class Cristina(name : String, age : Int) : ProjectManager()
{
	init
	{
		this.name = name
		this.age = age
		
		myNameIs(this.name)
		iAmYearsOld(this.age)
	}
	
	override fun myNameIs() : String
	{
		return super.myNameIs() + " ProjectManager"
	}
}

class Workers()
{
	init
	{
		println("\nWorkers")
		
		println("\nWorkers1")
		val Worker1 = Cristian("Cristian", 25)
		println("Worker1.myNameIs(): ${Worker1.myNameIs()}")
		println("Worker1.iAmYearsOld(): ${Worker1.iAmYearsOld()}")
		print("Worker1.okIKeepWorking(): ")
		Worker1.okIKeepWorking()
		println("Worker1.iWantToWork(): ${Worker1.iWantToWork()}")
		
		println("\nWorkers2")
		val Worker2 = Cristina("Cristina", 23)
		println("Worker2.myNameIs(): ${Worker2.myNameIs()}")
		println("Worker2.iAmYearsOld(): ${Worker2.iAmYearsOld()}")
		print("Worker2.okIKeepWorking(): ")
		Worker2.okIKeepWorking()
		println("Worker2.iWantToWork(): ${Worker2.iWantToWork()}")
		
	}
}
/*
    Principii de baza ale POO :
    Abstractizarea
    Mostenirea
    Polimorfismul
    Incapsularea
*/

interface BurningTemperature
{
	var BurningTemperature : Float
}

interface DieselFuel : BurningTemperature
{
	var dieselFuel : Int
}

interface GasolineFuel : BurningTemperature
{
	var gasolineFuel : Int
}

interface StartingTheCar
{
	fun StartingTheCar()
	fun StartingTheCar(stop : Boolean)
}

interface Bus : DieselFuel, StartingTheCar
{
	fun printlnBus()
}

interface Sedan : GasolineFuel, StartingTheCar
{
	fun printlnSedan()
}

interface Cabriolet : GasolineFuel, StartingTheCar
{
	fun printlnCabriolet()
	fun removeTheRoofFromTheCar()
}

abstract class Vehicle()
{
	protected var maxSpeed = 0.0f
		get() = field
		set(value)
		{
			if (value <= 200)
			{
				field = value
				println("setMaxSpeed")
			}
			else
			{
				throw Exception("setMaxSpeed: Nu pot fi setate valori mai mari de 200")
			}
		}
	protected var carBrand : String = ""
		get() = field
		set(value)
		{
			field = setMaximumNumberOf_Characters(value, 10)
		}
	protected var carNumber : String = ""
		get() = field
		set(value)
		{
			field = setMaximumNumberOf_Characters(value, 20)
		}
	
	private fun setMaximumNumberOf_Characters(value : String, max : Int) : String
	{
		if (value.length < max)
		{
			println("setMaximumNumberOf_Characters")
		}
		else
		{
			throw Exception("setMaximumNumberOf_Characters: Nu pot fi setate valori mai mari de ${max}")
		}
		
		return value
	}
	
	private fun fuelPumping()
	{
		println("\n 1: fuelPumping")
	}
	
	private fun startingTheStarter()
	{
		println(" 2: startingTheStarter")
	}
	
	private fun weTurnOnTheFuel()
	{
		println(" 3: weTurnOnTheFuel")
	}
	
	private fun startingTheEngine()
	{
		fuelPumping()
		startingTheStarter()
		weTurnOnTheFuel()
		println(" 4: startingTheEngine")
	}
	
	open fun StartingTheCar()
	{
		startingTheEngine()
		println(" 5: StartingTheCar")
	}
}

class Car(maxSpeed : Float, carBrand : String, carNumber : String) : Vehicle(), Bus, Sedan, Cabriolet
{
	init
	{
		println("\nCar:")
		this.maxSpeed = maxSpeed
		this.carBrand = carBrand
		this.carNumber = carNumber
		
		println("maxSpeed: ${maxSpeed}")
		println("carBrand: ${carBrand}")
		println("carNumber: ${carNumber}")
	}
	
	override fun printlnBus()
	{
		println("printlnBus")
	}
	
	override var dieselFuel : Int = 0
		get() = field
		set(value)
		{
			if (value <= 200)
			{
				field = value
				println("setDieselFuel")
			}
			else
			{
				throw Exception("dieselFuel: Nu pot fi setate valori mai mari de 200")
			}
		}
	
	override fun printlnSedan()
	{
		println("printlnSedan")
	}
	
	override fun printlnCabriolet()
	{
		println("printlnCabriolet")
	}
	
	override fun removeTheRoofFromTheCar()
	{
		println("removeTheRoofFromTheCar")
	}
	
	override var gasolineFuel : Int = 0
		get() = field
		set(value)
		{
			if (value < 100)
			{
				field = value
				println("setGasolineFuel")
			}
			else
			{
				throw Exception("gasolineFuel: Nu pot fi setate valori mai mari de 100")
			}
			
		}
	override var BurningTemperature : Float = 0.0f
		get() = field
		set(value)
		{
			if (value < 90)
			{
				field = value
				println("setBurningTemperature")
			}
			else
			{
				throw Exception("BurningTemperature: Nu pot fi setate valori mai mari de 90")
			}
		}
	
	override fun StartingTheCar()
	{
		super.StartingTheCar()
		println("Mașina a fost creată de ură.")
	}
	
	override fun StartingTheCar(stop : Boolean)
	{
		if (stop == false)
		{
			println("Din anumite motive, a refuzat să pornească mașina.")
		}
		else
		{
			super.StartingTheCar()
			println("Mașina a fost creată de ură.")
		}
	}
}
/*
    SOLID
    DRY
    KISS
*/

