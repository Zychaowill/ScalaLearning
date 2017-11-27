package example20.samples.sample02

import akka.actor.{Actor, ActorRef, Props}

public class Hello extends Actor {
  override def receive = {

  }

  override def preStart(): Unit = {
//    final ActorRef greeter = context.actorOf(Props.create(Greeter.class), "greeter")

  }
}
