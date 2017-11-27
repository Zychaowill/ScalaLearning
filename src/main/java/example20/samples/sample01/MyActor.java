package example20.samples.sample01;

class MyActor(param: Int) extends Actor {
  override def receive = {
    case _ => {
      // 2. create with ActorContext within an Actor
      context.actorOf(MyActor.props(param))
    }
  }
}
