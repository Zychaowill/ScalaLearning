package example06.ex.ex7

import example06.ex.ex6.PokerFace

object Card extends Enumeration with App {
	type Card = Value
  val SPADES = Value("?")
  val HEARTS = Value("?")
  val DIAMONDS = Value("?")
  val CLUBS = Value("?")
  
  def color(c: Card) = {
    if (c == Card.HEARTS || c == Card.DIAMONDS)
      println("Red")
    else
      println("Black")
  }

  color(SPADES)
  color(DIAMONDS)
}