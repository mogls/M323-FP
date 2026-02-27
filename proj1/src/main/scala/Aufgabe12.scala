class Aufgabe12 extends AufgabeTrait {

  var shoppingCart: List[String] = List()

  var bookAdded: Boolean = false

  override def aufgabe(): Unit = {
    shoppingCart = addToCart("tets")
    shoppingCart = addToCart("test2")
    shoppingCart = addToCart("book")
    shoppingCart = addToCart("test")

    println("calculatePrice: " + calculatePrice().toString)
    println("getPrice: " + getPrice(shoppingCart).toString)
    println("noDiscount: " + getPriceNoDiscount(shoppingCart).toString)
  }

  def addToCart(item: String): List[String] = {
    if ("book" == item.toLowerCase) {
      bookAdded = true
    }
    shoppingCart :+ item
  }

  def removeFromCart(item: String): List[String] = {
    if ("book" == item.toLowerCase) {
      bookAdded = false
    }

    shoppingCart.filterNot(_ == item)
  }

  def calculatePrice(): Int = {
    var price: Int = 0
    for (item: String <- shoppingCart) {
      price = price + item.length
    }
    if (bookAdded) {
      price * 95/100
    } else {
      price
    }
  }

  def getPrice(fromList: List[String]): Int = {
    val mult = if (fromList.contains("book")) 95 else 100
    fromList.map(item => item.length).sum * mult/100
  }

  def getPriceNoDiscount(fromList: List[String]): Int = {
    fromList.map(item => item.length).sum
  }
}
