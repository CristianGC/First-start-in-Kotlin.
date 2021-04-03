fun main(args: Array<String>)
{
    println("Hello Kotlin!")

    println(suma_v1(54,57))
    println(suma_v2(23,45))
    suma_v3(54,12)
    suma_v4(34,62)

    Variables_only_for_reading()
    Variables_can_be_changed()
    Multiplication()
    Using_string_templates()

    println(Max_v1(10,10))
    println(Max_v2(10,10))
    println(Max_v3(10,10))
    Max_v4(10,20)
    println("Max_v5: ${Max_v5(10,11)}")

    Type_checking_Char_String_Int_Boolean(66)
    Type_checking_Char_String_Int_Boolean('5')
    Type_checking_Char_String_Int_Boolean("10000")
    Type_checking_Char_String_Int_Boolean(true)
    Type_checking_Char_String_Int_Boolean(println("\nHello Kotlin! )))"))

}

fun suma_v1(a: Int, b: Int): Int
{
    return a + b
}

fun suma_v2(a: Int, b: Int) = a + b

fun suma_v3(a: Int, b: Int): Unit
{
    println(a + b)
}

fun suma_v4(a: Int, b: Int)
{
    println(a + b)
}

// Funcționează, dar rezultatul este 1
fun Variables_only_for_reading(): Unit
{
    val a = 1
    val b: Int  = 1
    val c: Int
    c = 1
    c + b + a

    println(c)
}

fun Variables_can_be_changed(): Unit
{
    var a = 10
    var b: Int  = 20
    var c: Int
    c = 30
    c += b + a

    println(c)
}

val x = 3
var w = 2

fun Multiplication(): Unit
{
    w *= x

    println(w)
}

fun Using_string_templates(): Unit
{
    var a = 100
    val s1 = "a = $a"

    println(s1)
}

fun Max_v1(a: Int, b: Int): Int
{
    if(a > b)
        return a
    else
        return b
}

fun Max_v2(a: Int, b: Int) = if(a > b) a else b

fun Max_v3(a: Int, b: Int): String
{
    if(a > b)
        return "$a"
    else if (a != b)
        return "$b"
    else
        return "Nici a nici b nu sunt mai mare."
}

fun Max_v4(a: Int, b: Int): Unit
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
fun Max_v5(a: Int, b: Int): Int?
{
    if(a > b)
        return a
    else if (a != b)
        return b
    else
        return null
}

//Am obținut un rezultat interesant după afișarea mesajului "Hello Kotlin! )))", sa afișat că tipul este null.
fun Type_checking_Char_String_Int_Boolean(Object: Any): Boolean?
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

