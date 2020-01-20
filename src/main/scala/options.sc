def handleParsing(input:String) = {
  if(input!=null && input.nonEmpty) {
    input.toInt
  }
  else 0
}

Option(null)

handleParsing("10")
handleParsing(null)
handleParsing("0")
handleParsing("")

val value:Option[String] = Some("10")
val zerovalue:Option[String] = Some("0")
val noValue:Option[String] = None

def handleOptionParsing(input:String) = {
  if(input!=null && input.nonEmpty) {
    Some(input.toInt)
  }
  else
    None
}


val op1: Option[Int] = handleOptionParsing("5")
val op2: Option[Int] = handleOptionParsing("")

println(op1.getOrElse(0))
println(op2.getOrElse(0))  // None.get throws exception
println(op2.getOrElse(false))

op1.map(op => op+1)
op1.map(op => "1" + op)
op2.map(op => "1" + op)

//pattern matching on option
op1 match {
  case Some(value) => print("value present = " + value)
  case None =>   println("not present")
}

op2 match {
  case Some(value) => print("value present = " + value)
  case None =>   println("not present")
}


//for yield
val newop = for { value <- op1}
  yield {10 + value}

//assignment
case class Employee(id:Int, name:String, age:Int)
def getEmployee(id:Int):Option[Employee] = {
  //fake DB call -- id between 1 to 1000 valid
  // if no records None(Employee]
  //else Some[Employee]
  Some(Employee(0, "", 0))
}

//handle value of employee, create a string description
//print the contents of employee


//option as a parameter
def handleIntParsing(inputOption:Option[String]) = {
  inputOption.map(input => input.toInt)
}

//using map
val citycodeNameMapping = Map("PU" -> "Pune", "NGP" -> "Nagpur", "MUM" -> "Mumbai")
citycodeNameMapping.get("MUM")
citycodeNameMapping.get("INVALID")


val numbers = List(1,2,3)
numbers.head

//List.empty.head
numbers.headOption
List.empty.headOption