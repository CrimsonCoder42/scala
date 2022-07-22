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

var i = 0
  while(i < 10) {
    println(i)
    i += 1
  }
  //NEVER WRITE THIS AGAIN DO NOT WRITE IMPARATIVE CODE IN SCALA.

  //EVERYTHING IN SCALA IS AN EXPRESSION!!

  val aWeirdValue = (aVariable = 3)
  println(aWeirdValue)


  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }


  //1. println("Hello World will actually print to the counsel")
    val someValue = {
      2 < 3
    }
  //2.  true

  val someOtherValue = {
    if(someValue) 239 else 906
    42
  }

  //3. 42

}
