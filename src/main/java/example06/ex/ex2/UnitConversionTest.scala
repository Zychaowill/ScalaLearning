package example06.ex.ex2

object UnitConversionTest extends App {
  val inche = 10;
  val gallon = 10;
  val mile = 10
  println(inche + "英尺=" + InchesToCentimeters.Converse(inche) + "厘米")
  println(gallon + "加仑=" + GallonsToLiters.Converse(gallon) + "升")
  println(mile + "公里=" + MilesToKilometers.Converse(mile) + "公里")
}