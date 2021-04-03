fun main(args: Array<String>)
{
    println("Hello Kotlin!")

    println(suma_v1(54,57))
    println(suma_v2(23,45))
    suma_v3(54,12)
    suma_v4(34,62)
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
