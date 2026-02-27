class Aufgabe33 extends AufgabeTrait {

  override def aufgabe(): Unit = {
    ???
  }

  def getSum(toSum: List[Int]): Int = toSum.sum
  def getMedian(list: List[Int]): Double = {
    val sortedList = list.sorted
    val len = sortedList.length
    if (len%2==1) sortedList(len/2) else (sortedList(len/2 - 1) + sortedList(len/2)) / 2.0
  }

}
