package example06.ex.ex2

object MilesToKilometers extends UnitConversion {
  private val m2l = 1.609344
  
  def Converse(from: Double): Double = {
    from * m2l
  }
}