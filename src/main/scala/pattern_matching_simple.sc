val number = (Math.random()*10).toInt

number match {
  case 1 => "one"
  case 2 => "two"
  case _ => "greater than 2"
}

trait Car {
  def name:String = "default"
}
object BMW extends Car
object Merc extends Car
object Maruti extends Car


def findCarType(car:Car) = {
  car match {
    case BMW => "BMW"
    case Merc => "Mercedes"
    case Maruti => "Maruti"
    case _ =>  car.name
  }
}

findCarType(BMW)

findCarType(new Car{
  override def name: String = "new launched"
})


def findType(a:Any) = a match {
  case s:String if(s.startsWith("a")) => "String type with value " + s
  case s:String => "String type"
  case l:List[Any] => "list type with head value " + l.head
  case c:Car => "car type"
  case t => t.getClass + " type"
}

findType(List(1,2,3))
findType("piyush")
findType("any")
findType(true)



