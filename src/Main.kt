import core.*

fun main()
{
    println("Hello Kotlin!")

    println(sumaV1(54,57))
    println(sumaV2(23,45))
    sumaV3(54,12)
    sumaV4(34,62)

    variablesOnlyForReading()
    variablesCanBeChanged()
    multiplication()
    usingStringTemplates()

    println(maxV1(10,10))
    println(maxV2(10,10))
    println(maxV3(10,10))
    maxV4(10,20)
    println("Max_v5: ${maxV5(10,11)}")

    typeCheckingCharStringIntBooleanV1(66)
    typeCheckingCharStringIntBooleanV1('5')
    typeCheckingCharStringIntBooleanV1("10000")
    typeCheckingCharStringIntBooleanV1(true)
    typeCheckingCharStringIntBooleanV1(println("\nHello Kotlin! )))"))

    val numbersV1: IntArray = intArrayOf(5,2,3,4,5,6)

    maximumNumberOfMatricesV1(numbersV1)

    println(typeCheckingV2(10))
    println(typeCheckingV2('1'))
    println(typeCheckingV2(10.10f))
    println(typeCheckingV2("Cristian"))
    println(typeCheckingV2(true))
    println(typeCheckingV2(10.10))

    usingIntervals()

    typeCheckingV3(10)
    typeCheckingV3('1')
    typeCheckingV3(10.10f)
    typeCheckingV3("Cristian")
    typeCheckingV3(true)
    typeCheckingV3(10.10)
    typeCheckingV3(Int)

    defaultValuesForFunctionParameters(20,"Cristian")
    defaultValuesForFunctionParameters(10)
    defaultValuesForFunctionParameters()

    startColorConversion()

    printMyObject1()

    typeCheckingV3(transformFromCharToInt('7'))

    val arrayForm = arrayOf("Form","9","8","4","3","57","11")
    var arrayTo = arrayOf("To","8","3","2","5","1","01")

    copyTheArrayToArray(arrayForm, arrayTo)

}