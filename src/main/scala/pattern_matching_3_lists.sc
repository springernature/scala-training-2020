import scala.annotation.tailrec

val numbers = List(1,2,3)
numbers.head
numbers.tail

val nums = 1::List(2,3)
val singleEntry = 1::Nil
val singleEntry2 = 1::List()
val singleEntry3 = 1::List.empty


def listMatching(l:List[Int]) = l match {
  case head::tail => "head = " + head + " tail = " + tail
  case _ => "list = " + l
}

listMatching(List(1,2,3))
listMatching(List(1))
listMatching(List())

def listPattern(l:List[Int]) = l match {
  case List(a) => "list has 1 elements"
  case List(a,_) => "list has more than 1 element"
  case _ => "list = " + l
}

listPattern(List(1,2,3))
listPattern(List(1))
listPattern(List(1,2))

//iterate though list and print elements
@tailrec
def listrecursion(l:List[Int]):Unit = l match {
  case Nil => println("empty list")
  case head::Nil => println(head + " last element")
  case head::tail => {
      println(head)
      listrecursion(tail)
  }
}

listrecursion(List(1,2,3))
listrecursion(List(1))
listrecursion(List())
