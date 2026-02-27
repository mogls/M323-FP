class Aufgabe13 extends AufgabeTrait {
  override def aufgabe(): Unit = {
    var someList: List[String] = List("Martin", "Erwin", "Franz")

    someList = addPerson("Heiri", someList)
    val tipPercentage: Int = getTipPercentage(someList.size)

    println("People: " + someList.toString)
    println("tip: " + tipPercentage.toString)
  }

  def addPerson(name: String, names: List[String]): List[String] = {
    names :+ name
  }

  def getTipPercentage(nrOfPeople: Int): Int = {
    if (nrOfPeople > 5) {
      20
    } else if (nrOfPeople > 0) {
      10
    } else {
      0
    }
  }
}

