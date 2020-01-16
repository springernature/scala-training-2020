import java.util
//import scala.collection.mutable._

// Collections - divide into two packages mutable and immutable
// https://docs.scala-lang.org/overviews/collections/overview.html
//scala.collection.mutable
//scala.collection.immutable

//Read chapter 16, 17, 24 (Programming in scala 3rd edition)
//Default - immutable

var a = List(1, 2, 3) //IM  MU -> ListBuffer MutableList
val a2 = new util.ArrayList[Integer] //MU
a2.add(1)
a2.add(2)
a2.add(3)
a2

val myMap = Map("1"->"Raj", "2"->"Joex", "3"->"Team") //Map

val mySet = Set("set elem 1", "set elem 2", "set elem 2", "set elem 3") //Set

val mySetInt: Set[Int] = Set(1,2)

//Iterate collections for loop
for(listData <- a) {
print(listData)}

for(mapData  <- myMap) {
  println("key = "+mapData._1+" value ="+mapData._2 )
}

for(setData <- mySet) {
  println(setData)
}


// List useful methods
val numbers=(1 to 10).toList //another way to create list
println("first element of list = "+a.head) // gets first

println("apart from first ="+a.tail) // apart from first

println("all elements except last ="+a.init) //

println("last element of list = "+a.last )

println("reveres "+a.reverse )

println("contains "+a.contains(1) )

val aPartition: (List[Int], List[Int]) = a.partition(listData => listData%2==0)
println("partitioned list "+aPartition._1 +" and "+aPartition._2)

println("mkstring = "+a.mkString(","))
val more = 1::(2::(3::Nil))

def mutiply(x:Int): Unit = {
  x*x
}
// apply map, filter, filter not on list
//Map is a function gives option to take element do processing and return back changed values
//Map function is example of box pattern -  can convert type

a.map(listData => print(listData) ) //iterate with map
val mysqr: Seq[Int] = a.map(data => data*data)
val mySqr2 = a.map(data => mutiply(data))

val abc: Unit = a.foreach(listData => print(listData))  // Iterate with foreach

a.filter(listData => listData%2==0) //filter data

a.filterNot(listData => listData%2==0) //filter not

a.map(elm =>elm*elm).filter(elem => elem%2==0)

//use map to convert to new value or type
val newValue = a.map(listData => listData*2)
val newDataTypeList = a.map(listData => "Role Num="+listData.toString) //boxed











