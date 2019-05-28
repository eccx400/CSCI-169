object D3cbn {
  def main(args: Array[String]) { 
    
    def plus(x:Int, y:Int) = x+y
    def plus2(x:Int)(y:Int) = x+y
    println(plus(2, 3))
    println(plus2(2)(3))
    println(plus2(2)({println("Hello"); 3}))//Can give compound expression
    println(plus2(2){println("Hello"); 3})//Can leave off () 
    //def plus5 = plus2(5)//Doesn't work, can't do currying quite this easily
  
    def doTimes(i:Int)(body:Unit): Unit = {
      if(i>0) {
        body 
        doTimes(i-1)(body)
      }
    }
 
    
    
    //Print out Hello World 5 times
    doTimes(5){//It's a function call that looks like a loop!
      println("Hello World1")
      3
    }//Only prints once BECAUSE CBV
   def doTimes2(i:Int)(body: =>Unit): Unit = {//To make it CBN, and SPACE => to type
      if(i>0) {
        body 
        doTimes2(i-1)(body)
      }
    }
    //Print out Hello World 5 times
    doTimes2(5){
      println("Hello World2")
      //3
    }
    println()
    
    
   // def loop():Int = loop()
    def loop:Int = loop//Same thing as previous line - can leave off () on a function with no parameters
    var x:Int = 7//Do NOT use var in your code, just used here to illustrate the difference between def and val
    def y:Int = x+2//Like CBN, RHS is evaluated every time the name is used
    val y2 = x+2//Like CBV, RHS evaluated once when assigned
    println(y)
    println(y2)
    x=2
    println(y)//The value of y is computed from x+2 EVERY time y is used
    println(y2)
    println()
   
    def first(x:Int, y: =>Int) = x//If you want to be able to call a function it has to be a def
    println(first(3, loop))//This will terminate; wouldn't if second parameter to first wasn't CBN 
    def mostlyfirst(x:Int, y: =>Int) = if(x!=0) x else y
 /*   def sometimesfirst-sometimessecond(x: =>Int, y: =>Int){
      if(something) val x2 = x//This way we can get around all 20 occurrences of x needing to evaluate below
                something with 20 occurrences of x (change all x to x2)
      else  val y2 = y
          something with 10 occurrences of y (change all y to y2)
      
    }*/
    

    
    def fact(i:Int):Int = if(i==0) 1 else i*fact(i-1)//Doesn't terminate for negative i
    
    def evaluate(x:Int, expr: =>Int):Int = if(x>=0) expr else -1
                                             //More general condition
    //fact(-5)  //Doesn't terminate
    println(evaluate(-5, fact(-5)))
    
    def evaluateGeneral(x:Int, expr: =>Int, cond:Int=>Boolean, default:Int):Int = 
      if(cond(x)) expr else default//Why might returning -1 here not be the best idea?


    //I want evaluate2 to do the same thing as evaluate - how can I use 
    //evaluateGeneral to do that? 
    def evaluate2(x:Int, expr: =>Int):Int = evaluateGeneral(x, expr, a=>a>=0, -1)//using evaluateGeneral
    
    //Make this work for any function that takes a single parameter
    def evaluateGeneral2[A, B](x:A, expr: =>B, cond:A=>Boolean, default:B):B
                  = if(cond(x)) expr else default//Even more general with generics
     
                  
    println(evaluateGeneral2(-5, fact(-5), (x:Int)=>x>=0, -1))
      //Same thing as: evaluate(-5, fact(-5))

    /*
    def foo(x:Int) = {
      ....
      fact(x)//This is the way we would actually be using it, so we wouldn't know if the value we passed in was positive or negative.  :)
    }
    */

    
  }
  
  

    /*
    def mostlyfirst(x:Int, y: =>Int) = {
      if(thing that mostly happens)
        stuff in terms of x
      else{
        val y2 = y//Saves us from having to evaluate y a bunch here
        stuff in terms of x and y2
      }
    }
    * 
    */
}

