import scala.collection.mutable.ListBuffer

class Aufgabe31 extends AufgabeTrait {

  override def aufgabe(): Unit = {
    val cartItems = List[String]()

    extension [A] (l: List[A])
      def addToCart(append: A) : List[A] = l :+ append


    val mod1 = cartItems.addToCart("Apple")
    val mod2 = mod1.addToCart("Banana")
    val mod3 = mod2.addToCart("Orange")
    println(mod1)   // Ausgabe: List(Apple)
    println(mod2)  // Ausgabe: List(Apple, Banana)
    println(mod3)  // Ausgabe: List(Apple, Banana, Orange)
    println(cartItems) // Ausgabe: List()


    // Funktion zum Teilen einer Zahl durch eine andere
    def divideNumbers(dividend: Double, divisor: Double): Double = {
      if (divisor == 0) return 0
      dividend / divisor
    }

    println(divideNumbers(10, 2)) // Ausgabe: 5.0
    println(divideNumbers(8, 4))  // Ausgabe: 2.0

    // Methode zum Ausgeben und Rückgeben einer Zeichenkette
    def ReturnString(str: String): String = {
      str          // Rückgabe der Zeichenkette
    }

    println(ReturnString("Hello")) // Ausgabe: Hello



  }

}