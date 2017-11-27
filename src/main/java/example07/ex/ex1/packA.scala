package example07.ex.ex1

package com {
  package horstmann {
	  object packB {
	    def hi = println("I am packA")		  
	  }
	  
	  package impatient {
	    object packA extends App {
	      def hi = packB.hi
	      hi
	    }
	  }
  }
}