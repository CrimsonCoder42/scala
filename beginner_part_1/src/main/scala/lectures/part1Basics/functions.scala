package lectures.part1Basics

object functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b

  }

  println(aFunction("Hello", 3))


  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())


  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("Hello", 3))

  // When you need loops use recursion.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }


  def greetingFunction(name:String, age:Int): Unit = {
    println("Hi, my name is " + name + "and I am " + age + " years old." )
  }
  greetingFunction("Devin", 39)

  def factorial(n: Int): Int = {
    if(n <= 0) 1
    else n * factorial(n-1)
  }
  println(factorial(5))


  def fibonacci(n:Int): Int = {
    if(n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }

  println(fibonacci(8))


  def isPrime(n:Int): Boolean = {
      def isPrimeUntil(t: Int): Boolean = {
        if (t <= 1) true
        else n % t != 0 && isPrimeUntil(t-1)
      }
    isPrimeUntil(n / 2)
  }

  println(isPrime(7))

}
