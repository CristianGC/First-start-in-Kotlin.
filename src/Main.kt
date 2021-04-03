import javax.sound.sampled.Mixer

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
