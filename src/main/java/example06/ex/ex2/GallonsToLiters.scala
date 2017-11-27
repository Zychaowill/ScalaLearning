package example06.ex.ex2

object GallonsToLiters extends UnitConversion {
  private val g2l = 3.785311784
  
  def Converse(from: Double): Double = {
    from * g2l
  }
}