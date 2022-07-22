package lectures.part1Basics

object Expressions extends App {

  val x = 1 + 2;

  println(x)


  println(1==2)

  println(!(1==2))


  var aVariable = 2

  aVariable += 3

  println(aVariable)

  val aCondition = false
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)




}
