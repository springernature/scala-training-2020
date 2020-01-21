

//implicit conversion basic example
val i: Int = 8
val l: Long = i



//implicit parameter to a function
def multiply(implicit by: Int) = 2 * by

implicit val multiplier = 4

multiply

//implicit val multiplier2 = 3
//should have implicit just 1 in scope otherwise compiler gives below error
//error: ambiguous implicit values:
// both value multiplier of type => Int
// and method f of type => Int
// match expected type Int
//       multiply
//       ^


//If there is no implicit then compiler gives below error
//error: could not find implicit value for parameter by: Int
//       multiply
//       ^


//implicit functions:

implicit def doubleToInt(d: Double): Int = d.toInt
val x : Int = 20.23



//Type conversions with implicit functions
implicit def intToStr(num: Int): String = s"The value is $num"

42.toUpperCase() // evaluates to "THE VALUE IS 42"

def functionTakingString(str: String) = str
// note that we're passing int
functionTakingString(82) // evaluates to "The value is 42"