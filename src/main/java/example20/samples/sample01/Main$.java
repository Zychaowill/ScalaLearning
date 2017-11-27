package example20.samples.sample01;

object Main {

  def main(args: Array[String]): Unit = {
    import akka.actor.Actor

    class MyActor extends Actor {
      override def receive = {
        case "Hello" => println("hello")
        case _ => println("error msg")
      }
    }
  }
}
