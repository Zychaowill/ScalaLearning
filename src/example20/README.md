# Actor
> actor提供了并发程序中与传统的基于锁的结构不同的另一种选择。
> 通过尽可能避免锁和共享状态，actor使得我们能够更容易地设计出正确、没有死锁或争用状况的程序。
> Scala类库提供了一个actor模型的简单实现。除此之外，还有其他更高级的actor类库，比如Akka（https://akka.io/docs/）

## Key point

- 每个actor都要扩展Actor类并提供act方法

- 要往actor发送消息，可以用actor!message

- 消息发送是异步的：“发完就忘”

- 要接收消息，actor就可以调用receive或react，通常是在循环中这样做

- receive/react的参数是由case语句组成的代码块（从技术上讲这是一个偏函数）

- 不同actor之间不应该共享状态。总是使用消息来发送数据

- 不要直接调用actor的方法。通过消息进行通信

- 避免同步消息——也就是说将发送消息和等待响应分开

- 不同actor可以通过react而不是receive来共享线程，前提是消息处理器的控制流转足够简单

- 让actor挂掉是OK的，前提是你有其他actor监控着actor的生死。用链接来设置监控关系
