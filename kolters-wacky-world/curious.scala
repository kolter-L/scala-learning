object PureExample {
  def greet(name: String): String = {
    s"Hello, $name"
  }

  def addMe(num1: Int, num2: Int): Int = {
    val result = num1+num2
    result
  }

  def main(args: Array[String]): Unit = {
    val result = greet("Kolter")
    println(result)
  }

}