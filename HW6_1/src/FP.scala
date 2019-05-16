object D1 {
  def main(args: Array[String]) {
    println("Hello"); println("Howdy")
    def a = 10//Don't have to specify a type, can't reassign
    def square(x:Double):Double = {
      def squared = x*x//Added for readability
      squared
    }
    println(square(5))
    //a = 2//Causes an error
    if(a>=10)
      println("big")
   //Write a function to compute the absolute value
/*   def abs(x:Double):Double = //This works, but it's not very functional
   {
     if(x<0) {def b=(-1)*x
     b}
     x
   }*/
   def abs(x:Double) = //More like ternary operator than if/else in C/C++
     if(x<0) (-1)*x else x
   
   def factorial(n:Int):Int = {//For recursive function we have to give return type
       if(n==1) 1
       else n*factorial(n-1)
     }
    

    
  def sqrt(x:Double) = {
    def sqrtIter(guess:Double):Double={
      if(close(guess)) guess
      else sqrtIter(improve(guess)) 
    }
    def close(guess:Double) = abs(square(guess)-x) < .001   
    def improve(guess:Double) = (guess + x/guess) / 2
    sqrtIter(1.0)
  }
  println(sqrt(9.0))
  //Static scope, block
  def c=d+1
  println(c)
  def d=72
  }
}

/*
object D1 {
  def main(args: Array[String]) {
    println("Hello"); println("Howdy")
    def a = 10//a can't be reassigned
    def square(x:Int) = {//Return different types - polymorphism
      def retval = x*x
      if(x>=0) retval  else println("Error, negative input")//Value of last statement is what is returned
      
    }
    //Absolute value function
    println(square(a))
    //a = 20 causes error
    //Absolute value function
    def abs(x:Double):Double = 
      if(x<0) -x else x//if/else has value
      
    def factorial(n:Int):Int =
      if(n==0) 1 else n*factorial(n-1)
      
    println(factorial(5))
    def sqrt-iter(x:Double, guess:Double) = {
        if (abs(square(guess)-x) < .001) guess
        else sqrt-iter(x, (guess + x/guess) / 2) 

      }
    
     def sqrt(x:Double){
        sqrt-iter(x, 1.0)
      }
    
    
  }
}

*/