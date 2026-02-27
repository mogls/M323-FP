class Aufgabe11 extends AufgabeTrait {
  override def aufgabe(): Unit = {
    val score1: Int = calculateScore("Test1")
    val score2: Int = wordScore("Test1")
    val score3: Int = wordScoreTotal("Test1")

    val score4: Int = calculateScore("With a and a oh?")
    val score5: Int = wordScore("With a and a oh!")
    val score6: Int = wordScoreTotal("With a and a oh.")

    println(s"$score1, $score2, $score3")
    println(s"$score4, $score5, $score6")
  }

  private def calculateScore(word: String): Int = {
    var score: Int = 0
    for (c <- word){
      if ('a' != c) {
        score += 1
      }
    }
    score
  }

  private def wordScore(word: String): Int = word.replaceAll("a", "").length()

  private def wordScoreTotal(word: String): Int = word.length()

}
