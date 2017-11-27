package example06.ex.ex2

object InchesToCentimeters extends UnitConversion {
  private val i2c = 30.48
  
  def Converse(from: Double): Double = {
    from * i2c
  }
}