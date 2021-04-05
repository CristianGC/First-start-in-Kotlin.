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
