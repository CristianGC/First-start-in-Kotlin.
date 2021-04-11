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

class Person11(name: String, age: Int)
{
    init
    {
        println("\nPerson11")
        println("Bloc de inițializare")
    }

    init {
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

interface Man
{
    val whatKindOfMan: String
    var spaceGalaxy: String
    fun printlnSpaceGalaxy(){}
}

open class Person14(name: String, age: Int, override val whatKindOfMan: String = "Good", final override var spaceGalaxy: String = "It hosts a Kotlin galaxy :)"): Man
{
    private var myName: String
    private var myAge: Int

    open val myLevel: Int = 0

    init
    {
        myName = name
        myAge = age
        println("Person14-------")
        println("name: $name age: $age myLevel: $myLevel whatKindOfMan: ${whatKindOfMan} spaceGalaxy: ${spaceGalaxy}")
    }

    open fun getName(): String
    {
        return myName
    }

    open fun getAge(): Int
    {
        return myAge
    }

    override fun printlnSpaceGalaxy()
    {
        println("Person14 spaceGalaxy: ${spaceGalaxy}")
    }
}

open class Person15(myName: String, myAge: Int) : Person14(myName, myAge), Man
{
    final override val myLevel: Int
        get() = super.myLevel + 3

    final override val whatKindOfMan: String
        get() = "Bad"

    init
    {
        println("Person15-------")
        println("myName: $myName myAge: $myAge myLevel: ${myLevel + 10} whatKindOfMan: ${super.whatKindOfMan} spaceGalaxy: ${spaceGalaxy}")
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

    override fun printlnSpaceGalaxy()
    {
        println("Person15 spaceGalaxy: ${spaceGalaxy}")
    }
}

final class Person16(myName: String, myAge: Int) : Person15(myName, myAge)
{
    init
    {
        println("Person16-------")
        println("myName: $myName myAge: $myAge myLevel: ${super.myLevel} whatKindOfMan: $whatKindOfMan spaceGalaxy: ${spaceGalaxy}")
    }

    override fun getName(): String
    {
        return "---${super.getSuperGetName()}---"
    }

}

class Person17 : Person14("Cristian",25)
{
    override fun printlnSpaceGalaxy()
    {
        println("\nPerson17: ")
        super<Person14>.printlnSpaceGalaxy()
    }

    inner class PrintlnGalaxy(var galaxy: String)
    {
        fun printlnSpaceGalaxy()
        {
            println("\nclass PrintlnGalaxy: ")
            println("galaxy: $galaxy")
            super@Person17.printlnSpaceGalaxy()
        }
    }
}

open class Person18 (var name: String, var age: Int)
{
    init
    {
        println("\nPerson18:")
    }

    open fun printlnName(): Person18
    {
        println("Name: ${name}")
        return this
    }

    open fun printlnAge(): Person18
    {
        println("Age: ${age}")
        return this
    }

    inner class Println
    {
        fun name(): Println
        {
            println("Name: ${name}")
            return this
        }

        fun age(): Println
        {
            println("Age: ${age}")
            return this
        }

        fun prinlnNameAge(): String
        {
            return "Name: ${name}" + "Age: ${age}"
        }
    }

    open fun displayOfBasicPeople()
    {
        println("displayOfBasicPeople")
        Person18("Cristian",25).Println().name().age()
    }
}

interface Factory<T>
{
    fun create(): T
}

interface Factory2<T>
{
    fun create2(): T
}

abstract class Person19()
{
    init
    {
        println("\nPerson19")
    }

    companion object : Factory<Person18>, Factory2<Person14>
    {
        final override fun create(): Person18 = Person18("Cristian",25)
        final override fun create2(): Person14 = Person14("Cristian",25)
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
        const val SUBSYSTEM_DEPRECATED: String = "Acest subsistem este învechit"
    }

    @Deprecated(Companion.SUBSYSTEM_DEPRECATED) fun oldFun(str: String)
    {
        println("oldFun $str Cristian")
    }

    fun newFun(str: String)
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

    private fun weCheckTheName(name: String) = name == "Cristian" || name == "Cristina" || name == "Sanda" || name == "Masa" || name == "Nastea"

    val thisIsTheName: (String) -> Boolean = ::weCheckTheName

    // La moment nu prea inteleg cum functioneaza dar voi afla.
    // Prima funcție include a doua funcție
    fun <A, B, C> compose(fun1: (B) -> C, fun2: (A) -> B) : (A) -> C
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

    fun <VALUE, Introduction1, Introduction2, theOutcome> compose2
            (
                fun1: (Introduction2) -> theOutcome,
                fun2: (Introduction1) -> Introduction2,
                fun3: (VALUE) -> Introduction1
            ) : (VALUE) -> theOutcome
    {
        return { R -> fun1(fun2(fun3(R))) }
    }

    private fun length(s: String) = s.length

    private fun isOdd(x: Int) = x % 2 != 0
    private fun isEven(x: Int) = x % 2 == 0

    private fun weInvertTheBoolValue(b: Boolean) = b != true

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
    lateinit var lateinitWork: Person21
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

    val lazyWork: String by lazy {
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
    constructor(num: Int, gap: Int)
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
        get() {return field}
        private set(value)
        {
            field = value
        }

    var step = 0
        get() {return field}
        private set(value)
        {
            if (step % 2 == 0)
                field = value + 10
            else
            {
                field = value - 10
                printWarning(value)
            }
        }

    private fun printWarning(value: Int)
    {
        println("step: Valoarea este setată la minus 1. value: $value")
    }

    val stepNoOne: Boolean
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
    constructor(name: String, age: Int)
    {
        this.name = name
        this.age = age
    }

    protected lateinit var name: String
    protected var age: Int = 0

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

    lateinit var name: String
    var age = 0

    constructor()
    constructor(name: String, age: Int)
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

data class Person26(val name: String, val age: Int)
{
    init
    {
        println("\nPerson26")
    }
}

var Person26.Index: Int
    get() = 30 - 3
    set(value) {}

fun main(args: Array<String>)
{
    /*
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
    _object14.printlnSpaceGalaxy()

    println("\n_object15:")
    val _object15 = Person15("Cristian",25)
    println("_object15 getName: ${_object15.getName()}")
    println("_object15 getAge: ${_object15.getAge()}")
    _object15.printlnSpaceGalaxy()

    println("\n_object16:")
    val _object16 = Person16("Cristian",25)
    println("_object16 getName: ${_object16.getName()}")
    println("_object16 getAge: ${_object16.getAge()}")

    val _object17 = Person17()
    _object17.printlnSpaceGalaxy()

    Person17().PrintlnGalaxy("Home").printlnSpaceGalaxy()

    Person18("Man",20).Println().name().age()
    Person18("Man",20).displayOfBasicPeople()
    Person18("Man",20).printlnName()
    Person18("Man",20).printlnAge()
    Person18("Man",20).printlnName().printlnAge().displayOfBasicPeople()

    val obj1 = Person19.create()
    obj1.displayOfBasicPeople()

    val obj2 = Person19.create2()
    obj2.printlnSpaceGalaxy()

    val obj3 = Person20()
    obj3.oldFun("Salut")
    obj3.newFun("Salut")

    ///https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/
    if (Person20::class.isCompanion)
    {
        println("class: Person20 Această clasă are un obiect companion.")
    }

    obj3.weDisplayOddAndEvenNumbersFromTheList()

    val name = "Sanda"
    if (obj3.thisIsTheName(name))
    {
        println("Acest nume este: $name")
    }

    obj3.weCheckIfTheWordLengthIsEvenOrOdd()

    obj3.weCheckIfTheWordLengthIsEvenOrOdd2()

    val obj4 = Person21()
    obj4.function { Person20() }

    val obj5 = Person22()
    obj5.startLateinitWork()
    obj5.startLazyWork()

    val obj6 = Person23(10,10)
    println("obj6.stepNoOne: ${obj6.stepNoOne}")
    obj6.printlnNumberStep()
    obj6.printlnIndex1()
    obj6.printlnIndex2()
    obj6.printlnIndex3()

    val obj7 = Person24("Cristian",25)
    obj7.printlnName()
    obj7.printlnAge()
    obj7.printlnProfession()

    val obj8 = Person25("Cristian",25)
    obj8.printlnName()
    obj8.printlnAge()

    Person25("Cristiam",25).printlnName()
    Person25("Cristiam",25).printlnAge()
    */

    val obj9 = Person26("Cristian",25)
    println("obj9.Index: ${obj9.Index}")


}