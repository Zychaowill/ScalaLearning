package discover.smallskill

object ArrayOper {
  def main(args: Array[String]): Unit = {
    var array = Array(1, 2, 3, 1, 'a', 1, 'a');

//    distinct(array).foreach(println)

//    setRemoveEqual(array).foreach(println)
    
    filterEqual(array).foreach(x => println(x + "\t"))
  }

  def distinct(array: Array[Int]) = {
    array.distinct
  }

  def setRemoveEqual(array: Array[Int]) = {
    array.toSet
  }

  def filterEqual(array: Array[Int]) = {
    for (i <- 0 until array.length if i == array.indexOf(array(i))) yield array(i)
  }
}