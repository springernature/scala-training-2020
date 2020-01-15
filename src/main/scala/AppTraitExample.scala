object AppTraitExample extends App {
  def greet() = {
    if (args.size == 0 )
      println("Hello unknown user")
    else
      println("Hello "+args(0))
  }
  greet
}
