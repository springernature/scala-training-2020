trait Creature


case class Person(name:String, age:Int) extends Creature
case class Animal(petname:String, age:Int, legs:Int) extends Creature
case class Bird(name:String, age:Int, canFly:Boolean) extends Creature
case class Fish(name:String, age:Int, fins:Int) extends Creature


def matchPerson(p:Person) = {
  p match {
    case p:Person if(p.name == "Piyush") => "its me"
    case _ => "some other guy"
  }
}

matchPerson(Person("Piyush", 30))
matchPerson(Person("Raghav", 30))


def matchCreature(c:Creature) = {
  c match {
    case Person(name, age) if (age < 30) => "name = " + name + "age = " + age
    case Animal(n, a, l) => "animal " + n + a +l
    case Bird(n, 5, canfly) => "bird can fly = " + n
    case Bird(n, _, canfly) => "bird not sure how old"
    case _ => "some other type"
  }
}

matchCreature(Bird("sparrow", 5, true))
matchCreature(Bird("sparrow baby", 1, true))
matchCreature(Fish("a", 1, 2))

val bird = Bird("sparrow", 5, true)
Bird.apply("sparrow", 5, true)
Bird.unapply(bird)


