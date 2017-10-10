package example07.ex.ex2

package com {
  package horstmann {
    object A {
      def hi = println("I am A")
    }
    
    package impatient {
      object B extends App {
        def hi = com.horstmann.A.hi
        hi
      }
    }
  }
}