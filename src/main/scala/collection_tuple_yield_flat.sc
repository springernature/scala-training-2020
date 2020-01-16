//pair and tuples
val pair=("Raj", 12)

val pair2=("Raj", 12, 24.8)
val pair3=("Raj", 12, true) // tuple is utility class Product is class, limit is 22 element but we can extend product and have more element

pair._1
pair._2

//flatten

val list = (1 to 5).toList
val listAlp= List("aa", "bb")
val listNames = List("ram", "shyam")

println("flatten str list= "+listAlp.flatten)

var listOfList = List(List("12", "15.5"), List(1,2,3,4,5))
println("flatten list = "+listOfList.flatten)









val mixListOfList = list.map(x=>listAlp.map(y=>x+y)) // will give two dmensional lists, mutiple lists
mixListOfList.flatten // it makes one list not mutiple


//above is achieved easily with for and yield, if we want to do n*n operations
var flattenWithFor2D =
  for { // in this we get flat list and not mutiple, 2 dim operation
  number<-list
  alp<-listAlp
} yield {
  number+alp
}

var flattenWithFor3List = for { // in this we get flat list and not mutiple, 3 dim operation
                                number<-list
                                alp<-listAlp
                                name<-listNames
                                }
                          yield {
                                  number+alp+name
                                }


