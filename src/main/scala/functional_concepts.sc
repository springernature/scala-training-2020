import scala.annotation.tailrec

// pure functions
def add(a: Int, b: Int) = {
  a + b
}

add(3, 5)

//impure function
def getRandomNumber() = Math.random()

getRandomNumber()

// function as variables
val add1 = (a: Int, b:Int) => a + b
add1(3, 5)


//function as parameters
def operation(f: (Int, Int) => Int, a:Int, b: Int) = {
  f(3, 8)
}

operation(add1, 3, 5)


//function as return value

def sum() = {
  (a:Int, b: Int) => a + b
}


val sumValue = sum()

sumValue(3, 6)

val list = List(1,2,3,4)

// lambda expression
list.map(x => x + 1)


//tail-recursions
@tailrec
def factorial(n: Int, acc: Int = 1) : Int = {
  if(n == 1)
    acc
  else
    factorial(n-1, acc * n)
}

factorial(5)