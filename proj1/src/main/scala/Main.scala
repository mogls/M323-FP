//> using scala 3.8.1
import scala.io.StdIn.readLine


@main def aufgabeAusfuhren(): Unit = {
  val aufgaben: Map[String, AufgabeTrait] = Map(
    "11" -> Aufgabe11(),
    "12" -> Aufgabe12(),
    "13" -> Aufgabe13(),
    "22" -> Aufgabe22(),
    "31" -> Aufgabe31(),
  )

  Iterator.continually[String](readLine("\nAufgabe auswahlen: ").trim)
    .takeWhile (aufgaben.contains)
    .foreach { id => aufgaben(id).aufgabe() }
}