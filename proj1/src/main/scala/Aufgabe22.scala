import scala.io.StdIn.readLine

class Aufgabe22 extends AufgabeTrait{

  override def aufgabe(): Unit = {
    val words = readLine("Input for Aufgabe22: ")

    val wordsList = words.split(" ").toList

    println("Ordered words: " + orderWords(wordsList).toString)

  }

  def orderWords(wordList: List[String]): List[String] = {
    wordList.sortBy(getWordValue)(using Ordering[Int].reverse)
  }

  def getWordValue(word: String): Int = {
    word.replaceAll("a", "").length
  }
}
