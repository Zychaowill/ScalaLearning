package example06

object DoNothingAction extends UndoableAction("Do nothing") {
  override def redo(): Unit = {
    
  }

  override def undo(): Unit = {
    
  }
  
  def main(args: Array[String]):Unit = {
    val actions = Map("open" -> DoNothingAction, "save" -> DoNothingAction)
    println(actions("open"))
  }
}