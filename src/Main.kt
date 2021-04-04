import Core.*

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

    default_values_for_function_parameters(20,"Cristian")
    default_values_for_function_parameters(10)
    default_values_for_function_parameters()

    start_color_conversion()

    print_1()

    type_Checking_v3(transform_from_char_to_int('7'))



}