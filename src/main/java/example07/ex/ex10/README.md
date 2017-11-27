# Small problems

#### Scala的设计者为什么要提供package object法而不是简单地让你将函数和变量添加到包中？
> 直接加函数和变量声明到包中，比如com.a.b.c。这样就跟c下面的class或者object差了一个层级。他们实际上是c下面的所有类的共同的上级定义。这样一来就没有了封装性。而实现上来说估计也比较麻烦。

#### 以下代码的作用是什么？
```bash
import java._
import javax._
```

> 引入了java和javax的所有内容。因为Scala会自动覆盖java的同名类，不会有冲突。即使这样，引入过多的包，也会让人很困惑。况且Scala编译就已经够慢的了。

#### 除了StringBuilder，还有哪些java.lang的成员是被Scala包覆盖的
> Console, Math, 还有基本类型包装对象：Long, Double, Char, Short等等都被Scala覆盖了