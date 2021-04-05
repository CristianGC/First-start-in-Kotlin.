package core

fun sumaV1(a: Int, b: Int): Int
{
    return a + b
}

fun sumaV2(a: Int, b: Int) = a + b

fun sumaV3(a: Int, b: Int)
{
    println(a + b)
}

fun sumaV4(a: Int, b: Int)
{
    println(a + b)
}

// Funcționează, dar rezultatul este 1
fun variablesOnlyForReading()
{
    val a = 1
    val b: Int
    b = 1
    val c: Int
    c = 1
    c + b + a

    println(c)
}

fun variablesCanBeChanged()
{
    val a = 10
    val b = 20
    var c: Int
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

fun maxV1(a: Int, b: Int): Int
{
    if(a > b)
        return a
    else
        return b
}

fun maxV2(a: Int, b: Int) = if(a > b) a else b

fun maxV3(a: Int, b: Int): String
{
    if(a > b)
        return "$a"
    else if (a != b)
        return "$b"
    else
        return "Nici a nici b nu sunt mai mare."
}

fun maxV4(a: Int, b: Int)
{
    val max = if (a > b)
    {
        print("întoarcere a\n")
        a
    }
    else {
        print("întoarcere b\n")
        b
    }

    println("Max_4 max: $max" )
}

// Destul de interesantă este această funcție.
fun maxV5(a: Int, b: Int): Int?
{
    if(a > b)
        return a
    else if (a != b)
        return b
    else
        return null
}

//Am obținut un rezultat interesant după afișarea mesajului "Hello Kotlin! )))", sa afișat că tipul este null.
fun typeCheckingCharStringIntBooleanV1(Object: Any): Boolean?
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

fun maximumNumberOfMatricesV1(Array: IntArray)
{
    println("\nMaximum_number_of_matrices: ")
    var max = 0

    for (Item: Int in Array)
    {
        println("Item: $Item")
        max = maxV1(max, Item)
    }

    println("Max: $max")
}

fun typeCheckingV2(Object: Any): Any?
{
    val type: Array<Any> = arrayOf(Int, Float, Char, String, Boolean)

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
    for (g in 0..9)
        print("$g-")
    print("\n")

    for (g in 0..10 step 2)
        print("$g-")
    print("\n")

    for (g in 9 downTo 0 step 3)
        print("$g-")
    print("\n")

    val items = setOf("apple", "banana", "kiwi")
    when
    {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}

fun typeCheckingV3(Object: Any)
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

fun defaultValuesForFunctionParameters(a: Int = 3, Name: String = "Name")
{
    println("\nDefault_values_for_function_parameters")
    println("a: $a")
    println("Name: $Name")
}

private fun convertsTheColorStringToRGB(color: String): IntArray
{
    return when (color)
    {
        "Red"   -> intArrayOf(255,0,0)
        "Green" -> intArrayOf(0,255,0)
        "Blue"  -> intArrayOf(0,0,255)
        else    -> throw IllegalArgumentException("Valoare nevalidă a parametrului culoare.")
    }
}

private fun convertsRgbColorToString(color: IntArray): String
{
    return if (color.contentEquals(intArrayOf(255,0,0)))
    {
        "Red"
    }
    else if (color.contentEquals(intArrayOf(0,255,0)))
    {
        "Green"
    }
    else if (color.contentEquals(intArrayOf(0,0,255)))
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
    catch (e: Exception)
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
    with(myObject_1)
    {
        print1()
        print2()
    }
}

fun transformFromCharToInt(c: Char): Int
{
    println("\ntransform_from_char_to_int: ")
    if (c !in '0'..'9')
        throw IllegalArgumentException("În afara razei de acțiune")
    return c.toInt() - '0'.toInt()
}

fun copyTheArrayToArray(from: Array<out String>, to: Array<in String>)
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
{

}

class Person2(name: String, age :Int)
{

}

class Person3(var name: String, val age :Int)
{

}

class Person4 constructor(name: String, age :Int)
{

}

class Person5 constructor(var name: String, val age :Int)
{

}

class Person6 private constructor(name: String, age :Int)
{

}

class Person7 private constructor(var name: String, val age :Int)
{

}

class Person8 internal constructor(name: String, age :Int)
{

}

class Person9 internal constructor(var name: String, val age :Int)
{
    init
    {
        println("\nPerson9")
        println("name: $name")
        println("age: $age")
    }
}

class Person10 (name: String, age :Int)
{
    val firstProperty = name
    init
    {
        println("\nPerson10")
        println("firstProperty name: $firstProperty")
    }

    val secondProperty  = age
    init
    {
        println("secondProperty age: $secondProperty")
    }
}

class Person11
{
    init
    {
        println("\nPerson11")
        println("Bloc de inițializare")
    }

    constructor(name: String, age :Int)
    {
        println("name: $name")
        println("age: $age")
    }
}

// Automat este creat constructor public.
abstract class Person12
{

}
// Nu este creat automat constructor.
abstract class Person13 private constructor()
{

}

open class Person14(name: String, age: Int)
{
    private var myName: String
    private var myAge: Int
    init
    {
        myName = name
        myAge = age
        println("Person14-------")
        println("name: $name age: $age")
    }

    open fun getName(): String
    {
        return myName
    }

    open fun getAge(): Int
    {
        return myAge
    }
}

open class Person15(myName: String, myAge: Int) : Person14(myName, myAge)
{
    init
    {
        println("Person15-------")
        println("myName: $myName myAge: $myAge")
    }

    override fun getName(): String
    {
        return "+++${super.getName()}+++"
    }

    fun getSuperGetName(): String
    {
        return super.getName()
    }

    final override fun getAge(): Int
    {
        return super.getAge() + 10
    }
}

class Person16(myName: String, myAge: Int) : Person15(myName, myAge)
{
    init
    {
        println("Person16-------")
        println("myName: $myName myAge: $myAge")
    }

    override fun getName(): String
    {
        return "---${super.getSuperGetName()}---"
    }

}

fun main()
{
    val _object0 = Person0()
    println("_object0: ${_object0.hashCode()}")
    println("_object0: ${_object0.toString()}")
    //rintln("_object0: ${_object0.equals()}")
    val _object1 = Person1()
    val _object2 = Person2("Cristian",25)
    val _object3 = Person3("Cristian",25)
    val _object4 = Person4("Cristian",25)
    val _object5 = Person5("Cristian",25)
    //val _object6 = Person6("Cristian",25)
    //val _object7 = Person7("Cristian",25)
    val _object8 = Person8("Cristian",25)
    val _object9 = Person9("Cristian",25)
    val _object10 = Person10("Cristian",25)
    val _object11 = Person11("Cristian",25)
    //Person12()
    //Person13()

    println("\n_object14:")
    val _object14 = Person14("Cristian",25)
    println("_object14 getName: ${_object14.getName()}")
    println("_object14 getAge: ${_object14.getAge()}")

    println("\n_object15:")
    val _object15 = Person15("Cristian",25)
    println("_object15 getName: ${_object15.getName()}")
    println("_object15 getAge: ${_object15.getAge()}")

    println("\n_object16:")
    val _object16 = Person16("Cristian",25)
    println("_object16 getName: ${_object16.getName()}")
    println("_object16 getAge: ${_object16.getAge()}")



}


