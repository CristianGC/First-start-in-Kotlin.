package principles.dry

fun main()
{
	p1(pR1(test))
	p2(pR1(test))
}

fun pR1(obj : PR) : PR
{
	return obj
}

fun p1(obj : PR)
{
	obj.pR("AAAA")
}

fun p2(obj : PR)
{
	obj.pR("fffffff")
}

var test : PR = Test()

class Test() : PR
{

}
