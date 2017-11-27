package example20.samples.sample01;

class HiActor extends Actor {

  override def receive = {
    case "Hi" => println("Hello")
  }
}
