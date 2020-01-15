// Traits

trait A {
  def name() = println("I am A")
}

trait B extends A {
  override def name = {
    println("B Extends A")
    super.name
  }
}

trait C extends A {
  override def name = {
    println("C Extends A")
    super.name
  }
}

class GrandChild extends A with C with B {
  override def name = {
    println("Grandchild")
    super.name
  }
}

val grandChild = new GrandChild()
grandChild.name

