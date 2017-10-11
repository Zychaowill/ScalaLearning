package example09

import sys.process._

object ScalsShell extends App {
    val result = "ls -al .."!
    
    println(result)
}