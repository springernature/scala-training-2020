def add(a:Int, b:Int)= {
  println("a = " )
  println("b = " )
  a + b
}

def showAdd(a:Int, b:Int)= {
  println("a = " )
  println("b = " )
  println(a + b)
}


val a = add(1,2)
val b = showAdd(2,3)
println(b)
b.getClass()

def floatValue(a:Int):Double = {
  if(a ==1)
    1.0
  else
    2.0f
}


def uncertainMethodY(a:Int) = {
  if(a ==1)
    true
  else
    2.0
}

def uncertainMethodX(a:Int) = {
  if(a ==1)
    "piyush"
  else
    2.0
}

def uncertainMethodZ(a:Int) = {
  if(a ==1)
    "piyush"
  else
    Set(1,2,3)
}

val dValue = floatValue(3)
val outputy = uncertainMethodY(1)
val outputx = uncertainMethodX(1)
val output = uncertainMethodZ(1)
