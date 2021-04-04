fun main()
{
    println("Hello Kotlin!")

    println(sumaV1(54,57))
    println(sumaV2(23,45))
    sumaV3(54,12)
    sumaV4(34,62)

    variables_only_for_reading()
    variables_can_be_changed()
    multiplication()
    using_string_templates()

    println(max_v1(10,10))
    println(max_v2(10,10))
    println(max_v3(10,10))
    max_v4(10,20)
    println("Max_v5: ${max_v5(10,11)}")

    type_checking_Char_String_Int_Boolean_v1(66)
    type_checking_Char_String_Int_Boolean_v1('5')
    type_checking_Char_String_Int_Boolean_v1("10000")
    type_checking_Char_String_Int_Boolean_v1(true)
    type_checking_Char_String_Int_Boolean_v1(println("\nHello Kotlin! )))"))

    val numbers_v1: IntArray = intArrayOf(5,2,3,4,5,6)

    maximum_number_of_matrices_v1(numbers_v1)

    println(type_Checking_v2(10))
    println(type_Checking_v2('1'))
    println(type_Checking_v2(10.10f))
    println(type_Checking_v2("Cristian"))
    println(type_Checking_v2(true))
    println(type_Checking_v2(10.10))

    using_intervals()

    type_Checking_v3(10)
    type_Checking_v3('1')
    type_Checking_v3(10.10f)
    type_Checking_v3("Cristian")
    type_Checking_v3(true)
    type_Checking_v3(10.10)
    type_Checking_v3(Int)

    Default_values_for_function_parameters(20,"Cristian")
    Default_values_for_function_parameters(10)
    Default_values_for_function_parameters()

}

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
fun variables_only_for_reading()
{
    val a = 1
    val b: Int
    b = 1
    val c: Int
    c = 1
    c + b + a

    println(c)
}

fun variables_can_be_changed()
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

fun using_string_templates()
{
    val a = 100
    val s1 = "a = $a"

    println(s1)
}

fun max_v1(a: Int, b: Int): Int
{
    if(a > b)
        return a
    else
        return b
}

fun max_v2(a: Int, b: Int) = if(a > b) a else b

fun max_v3(a: Int, b: Int): String
{
    if(a > b)
        return "$a"
    else if (a != b)
        return "$b"
    else
        return "Nici a nici b nu sunt mai mare."
}

fun max_v4(a: Int, b: Int)
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
fun max_v5(a: Int, b: Int): Int?
{
    if(a > b)
        return a
    else if (a != b)
        return b
    else
        return null
}

//Am obținut un rezultat interesant după afișarea mesajului "Hello Kotlin! )))", sa afișat că tipul este null.
fun type_checking_Char_String_Int_Boolean_v1(Object: Any): Boolean?
{
    println("\nType_checking: ")
    var Type = ""

    if (Object is String)
    {
        println("Obiectul este de tip String")
        Type = "String"
    }

    if (Object is Int)
    {
        println("Obiectul este de tip Int")
        Type = "Int"
    }

    if (Object is Char)
    {
        println("Obiectul este de tip Char")
        Type = "Char"
    }

    if (Object is Boolean)
    {
        println("Obiectul este de tip Boolean")
        Type = "Boolean"
    }

    if (Type != "")
    {
        println("Type: $Type")
        return true
    }
    else
    {
        println("Type: null")
        return null
    }
}

fun maximum_number_of_matrices_v1(Array: IntArray)
{
    println("\nMaximum_number_of_matrices: ")
    var Max = 0

    for (Item: Int in Array)
    {
        println("Item: $Item")
        Max = max_v1(Max, Item)
    }

    println("Max: $Max")
}

fun type_Checking_v2(Object: Any): Any?
{
    val Type: Array<Any> = arrayOf(Int, Float, Char, String, Boolean)

    println("\nType_checking_v2: ")

    if (Object is Int)
    {
        println("Obiectul este de tip Int")
        return Type[0]
    }

    if (Object is Float)
    {
        println("Obiectul este de tip Float")
        return Type[1]
    }

    if (Object is Char)
    {
        println("Obiectul este de tip Char")
        return Type[2]
    }

    if (Object is String)
    {
        println("Obiectul este de tip String")
        return Type[3]
    }

    if (Object is Boolean)
    {
        println("Obiectul este de tip Boolean")
        return Type[4]
    }

    return null
}

fun using_intervals()
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

fun type_Checking_v3(Object: Any)
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

fun Default_values_for_function_parameters(a: Int = 3, Name: String = "Name")
{
    println("\nDefault_values_for_function_parameters")
    println("a: $a")
    println("Name: $Name")
}

