import scala.util.{Failure, Success, Try}

def getInteger(input:String) = {
  try {
    Integer.parseInt(input)
  }catch {
    case nfe:NumberFormatException => throw new Exception("invalid input = " + input);
    case e:Exception => throw new Exception("something went wrong = " + e.getMessage);
  }
}

getInteger("2")
getInteger("0")
//getInteger("")
//getInteger(null)


def tryGetInteger(input:String) = {
  Try {
    Integer.parseInt(input)
  }
}

val op1 = tryGetInteger("10")
val op2 = tryGetInteger("dummy")

op1 match {
  case Success(output) => println("operation success " + output)
  case Failure(e) => println("error occured " + e)
}

op2 match {
  case Success(output) => println("operation success " + output)
  case Failure(e) => println("error occured " + e)
}


op1.map(value => value +1)
op2.map(value => value +1)

val output = for ( op <- op1) yield {op + 5}
val output2 = for ( op <- op2) yield {op + 5}

output.getOrElse(-1)
output2.getOrElse(-1)


//assignment -- repeat employee task with try, success and failure