abstract class Vehicle

class Bike(val model:String) extends Vehicle

object Bike {
  def apply(model: String) = new Bike(model)
  def unapply(arg: Bike): Option[(String)] = Some(arg.model)
}

class Truck(val model:String, val tyres:Int) extends Vehicle
object Truck {
  def apply(model: String, tyres:Int) = new Truck(model, tyres)

  def unapply(arg: Truck): Option[(String, Int)] = Some((arg.model, arg.tyres))
}

def matchVehicle(v:Vehicle) = {
  v match {
    case Bike(m) => "bike of type = " + m
    case Truck(a, b) => "truck " + a + " with " + b + " tyres"
  }
}

matchVehicle(Bike("Honda"))
matchVehicle(Truck("Tata", 6))