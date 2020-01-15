// Java vs Scala Class

// Java Class
/*
public class MyClass {
  private int id;
  private String name;

  MyClass (int id, String Name) {
    this.id = id;
    this.name = name;
  }
} */

// Scala Class
class Rational_0(n: Int, d: Int)

class Rational_1(n: Int, d: Int) {
  require(d!=0, "Denominator can't be zero")
  override def toString = n + "/" + d
}

// Constructors
// Primary Constructor
val half = new Rational_1(1,2)
//val invalidRational = new Rational_1(4,0)

// Rational Class -> println or require method


// Auxiliary constructor
// constructors other than the primary constructor
class Rational_2(n: Int, d: Int) {
  override def toString = n + "/" + d
  def this(n: Int) = {
    this(n, 1)
    println("I'm in Auxiliary Constructor")
  }

  def this(n: Int, d: Int, somethingElse: String) = {
    this(n,d)
    println(somethingElse)
  }
}

val overloadedConstructorCall = new Rational_2(3,5,"ThreeByFive")


val three = new Rational_2(3)

// Scala Objects
// Singleton/Standalone object

class Greet (name: String) {
  def sayHello() = {
    println("Hello "+name+" from the class")
  }
}

object Greet{
  println("Hello")

  def sayHello(name: String) = {
    println("Hello "+name)
  }
}

val singletonObject = Greet.sayHello("Pratiksha")


// Companion object
class Greet_2 (name: String) {
  def sayHello() = {
    println("Hello "+name+" from the class")
  }
}

object Greet_2 {
  println("Hello")

  def sayHello(name: String) = {
    println("Hello "+name)
  }

  // Apply method for creating class instances without new keyword
  def apply(name: String) = {
    println("Hello "+name+" from the object")
  }
}

val classInstance = new Greet_2("Pratiksha")
classInstance.sayHello()

val companionObject_2 = Greet_2("Raghav")

val sampleList = List(1,2,3)


// Case Class
// with implicit apply method and companion object"

case class Rational_3(n: Int, d: Int) {
  override def toString = n + "/" + d
  def this(n: Int) = this(n,1)
}

val fourByThree = Rational_3(4,3)

val fourByFive = Rational_3(4,5)

// Copy method
val fourByFive_1 = fourByThree.copy(d=5)




