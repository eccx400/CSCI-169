object D2 {
  
def main(args: Array[String]) {


  def square(x:Int):Int = x*x
  println(square(5))
  //Write a recursive function sum which 
  //returns the sum of the integers from 1 to x 
  def sum(x:Int):Int = if(x==1) 1 else x+sum(x-1)
    
  //Write a recursive function sum_square which 
  //returns the sum of SQUARES of the integers from 1 to x 
  def sum_square(x:Int):Int = if(x==1) square(1) else square(x)+sum_square(x-1)
    
  //Write a recursive function sum_fun which 
  //returns the sum of the values acquired by applying f
  //to the integers from 1 to x 
  def sum_fun(f:Int=>Int, x:Int):Int = if(x==1) f(1) else f(x)+sum_fun(f, x-1)
  println(sum_fun(sum, 5))  //How to call it?
  println(sum_fun(square, 5))
  def sum_square2(x:Int):Int = sum_fun(square, x)//Define in terms of sum_fun
  
  //Anonymous functions
  println(sum_fun((x)=>x*x*x, 5))
  println(sum_fun(x=>x, 5))
  println(sum_fun((x:Int)=>x, 5))
  
  //Currying
  def sum_fun2(f:Int=>Int):Int=>Int =  //Return type
  {//Function with or without a name
    def retfun(x:Int):Int = if(x==1) f(1) else f(x)+retfun(x-1)
    retfun
  }
  println(sum_fun2(square)(5))
  def sum_square3(x:Int):Int = sum_fun2(square)(x)//Using sum_fun2
  def sum_square4:Int=>Int = sum_fun2(square)//This is the main point of currying
  sum_square3(5)
  sum_square4(5)
  def sum_fun3(f:Int=>Int):Int=>Int =  //Anonymous version
      (x)=> if(x==1) f(1) else f(x)+sum_fun3(f)(x-1) 
      

  //(x)=>x*x//Why does this cause an error
  4//when this doesn't
  
  (x:Int)=>x*x//We CAN put an anonymous function alone as a line of code; however since we aren't 
  //using it in conjunction with another function with defined types, Scala can't infer the type of 
  //the function/value - and all values in Scala must have a type.  So Scala needs us to explicitly 
  //define the type of the input; from there it can infer the full type of the function.
}
}