val a = 10
val b = "Piyush"
val c = true
val d:Float = 2.0f
val e = 2.11

d + e
println(d + e)


val name:String = "Piyush"

var x = 2
x = x+1
x = 20

var myname = "Piyush"
myname ++ " Jain"

class Person {
  val name = "Piyush"
  var age = 30
}

val p1 = new Person
p1.name
p1.age
p1.age = 31
p1.age


//scala hierarchy
// https://scala-lang.org/files/archive/spec/2.12/12-the-scala-standard-library.html

1.+(2)
Integer.compare(1,2)


def ++(name:String) = {
  name + "++"
}

def __(name:String, surname:String) = {
  name + "__" + surname
}

++("Piyush")
__("a","b")

//default
def add(a:Int, b:Int, c:Int, flag:Boolean = true) = {
  if(flag)
    a + b + c
  else
    a+b
}

add(1,2,3)
add(1,2,3, false)

add(b =2 , a =4, c =6)  //named parameters