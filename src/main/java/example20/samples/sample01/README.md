Akka是一个运行时与编程模型一致的系统，为以下目标设计：

- 垂直扩展（并发）

- 水平扩展（远程调用）

- 高容错

在Akka的世界里，只有一个内容需要学习和管理，具有高内聚和高一致的语义。

异步无锁并行功能。 

Advantages:

- Akka提供一种Actor并发模型，其粒度比线程小很多，这意味着你可以在项目中使用大量的Actor。

- Akka提供了一套容错机制，允许在Actor出错时进行一些恢复或者重置工作。

- Akka不仅可以在单机上构建高并发程序，也可以在网络中构建分布式程序，并提供位置透明的Actor定位服务。

消息投递：

- 这个akka应用是有消息驱动的，消息是除了actor之外最重要的核心组件。在actor之前投递消息应该满足不可变性，也就是不变模式

- 消息投递有3种策略：至多一次投递，至少一次投递，精确的消息投递。BUT ，没必要在akka层面保证消息的可靠性，一般在业务层在保证

- akka可以在一定程度上保证顺序性，但不具备传递性，见《java高并发程序设计 P295》

模块：

Akka的模块化做的非常好，它为不同的功能提供了不同的jar包。

akka-actor-2.0.jar – 标准Actor, 有类型Actor，等等<br/>
akka-remote-2.0.jar – 远程Actor<br/>
akka-slf4j-2.0.jar – SLF4J事件处理监听器<br/>
akka-testkit-2.0.jar – 用于测试Actor的工具包<br/>
akka-kernel-2.0.jar – Akka微内核，可运行一个基本的最小应用服务器<br/>
akka--mailbox-2.0.jar – Akka可容错邮箱<br/>

``` akka-actor ```无外部依赖（除了 ``` scala-library.jar ``` jar包）


