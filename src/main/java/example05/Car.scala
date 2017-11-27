package example05

class Car(val manufactor: String, val model: String = null, val year: String = null, var number: Int = -1) {
}

object Car {
  def main(args: Array[String]): Unit = {
    val Chevrolet = new Car("通用", "雪佛兰-爱唯欧")
    val Volkswagen = new Car("一汽", "大众-斯柯达", "2015-1-1")
    val Volvo = new Car("吉利", "Volvo-s40", "2015-1-2", 666666)
    val nameArr = Array("雪佛兰", "大众", "沃尔沃")
    val carArr = Array(Chevrolet, Volkswagen, Volvo)
    outInfo(nameArr, carArr)
  }
  
  def outInfo(nameArr: Array[String], carArr: Array[Car]) = {
    for (i <- 0 until nameArr.length) {
      print(nameArr(i) + "\t")
      print("汽车制造商为: "+carArr(i).manufactor + "\t")
      print("汽车型号为: "+carArr(i).model + "\t")
      print("汽车产年份为: "+carArr(i).year + "\t")
      println("汽车车牌号为: "+carArr(i).number)
    }
  }
}