object D3 {
def main(args: Array[String]) { 

  
  //for(int i =0; ...; ++i) if(x==xs[i]) i
  def l1 = List(1, 2, 4, 7,2, 5,2, 1,9,4,5)
  def find_index(xs:List[Int], x:Int):Int = {
    def find_iter(xs:List[Int], x:Int, i:Int):Int = {//"for loop" in fp
      if(xs.isEmpty) -1 //x isn't in xs
      if( xs.head ==x ) i 
      else find_iter(xs.tail, x, i+1)
    }
    find_iter(xs, x, 0)
  }
  println(find_index(l1, 7))//should be 3
  def find_index2(xs:List[Int], x:Int):Int = {
      if(xs.isEmpty) -(xs.size+1) //x isn't in xs
      if( xs.head ==x ) 0 
      else 1+find_index2(xs.tail, x)
   
  }

  println(find_index2(l1, 7))//should be 3
  
  def remove(xs:List[Int], x:Int):List[Int] = {//Create a copy of xs with all copies of x removed
    if(xs.isEmpty) Nil
    else if(xs.head!=x) xs.head::remove(xs.tail, x)//Construct a list to return - use cons
    else remove(xs.tail, x)
  }
  
  def l2 = List(1, 2, 4, 7,2, 5,2, 1,9,4,5)
  println(remove(l2, 2))
  def sum_f(f:Int=>Int, xs:List[Int]):Int = {
    //The result of adding all values obtained by applying f to elements of xs
    if(xs.isEmpty) 0
    else f(xs.head)+sum_f(f, xs.tail)
  }
  
 def list_f(f:Int=>Int, xs:List[Int]):List[Int] = {//Copy of xs with f applied to each item
   if(xs.isEmpty) Nil
   else f(xs.head)::list_f(f, xs.tail)
 }
 println(list_f(x=>x*x, l2))
 //Curried version
 def list_f2(f:Int=>Int): List[Int]=>List[Int]  = {//What is the type of the returned function?
   def ret(xs:List[Int]):List[Int] = {//Start with types
     if(xs.isEmpty) Nil
     else f(xs.head)::ret(xs.tail)
     //else f(xs.head)::list_f2(f)(xs.tail)//Would also work, because list_f2(f) IS ret
   }
   ret
 }
 def cube_list = list_f2(x=>x*x*x)//This is the point of currying - abstracting the idea of applying *some* function to each item of a list makes it easier to write functions apply a *specific* function to all elements of a list
 println(cube_list(l2))
 println(list_f2(x=>x*x*x)(l2))//Gives the same result as last line
 def list_f3(f:Int=>Int): List[Int]=>List[Int]  = {//What is the type of the returned function?
  xs=>
     if(xs.isEmpty) Nil
     else f(xs.head)::list_f3(f)(xs.tail)//list_f3(f) IS the anonymous function xs=>if ...
 
 }
 //Curried version of sum_f using anonymous function
 def sum_f2(f:Int=>Int):List[Int]=>Int = {
    xs=>if(xs.isEmpty) 0 else f(xs.head)+sum_f2(f)(xs.tail)
  }

 
 
}










/*//This is the code from the 1:00 class
 *   def remove(xs:List[Int], x:Int):List[Int] = {//Constructs a copy of xs without any occurrences of x
    def remove_iter(xs:List[Int], x:Int, outs:List[Int]):List[Int] = {
      if(xs.isEmpty) outs
      else if(xs.head==x) remove_iter(xs.tail, x, outs)
      else remove_iter(xs.tail, x, xs.head::outs)//List will be backwards
  }
  remove_iter(xs, x,  Nil)
  }
  
  def remove2(xs:List[Int], x:Int):List[Int] = {//Constructs a copy of xs without any occurrences of x
    if(xs.isEmpty) Nil
    else if(xs.head==x) remove2(xs.tail, x)
    else xs.head::remove2(xs.tail, x)//Something with xs.head
  }
  
  def l2 = List(1, 2, 4, 7,2, 5,2, 1,9,4,5)
  println(remove(l2, 2))
  println(remove2(l2, 2))
  def sum_f(xs:List[Int], f:Int=>Int):Int = {//should return f(xs[1])+f(xs[2])+...
    if(xs.isEmpty) 0
    else f(xs.head)+sum_f(xs.tail, f)
  }
  //Curried version of sum_f using anonymous function
  def sum_f2(f:Int=>Int):List[Int]=>Int = {
    xs=>if(xs.isEmpty) 0 else f(xs.head)+sum_f2(f)(xs.tail)
  }
 def apply_f(xs:List[Int], f:Int=>Int):List[Int] = {//Constructs a list with f applied to each element of xs  
    if (xs.isEmpty) Nil
    else f(xs.head)::apply_f(xs.tail, f)
 }
 //Curried version
 def apply_f2(f:Int=>Int):List[Int]=>List[Int] = {//returns a function: Named or anonymous
   def ret(xs:List[Int]):List[Int] = {//Start with types = can infer from apply_f2's return type
     if(xs.isEmpty) Nil
     else f(xs.head)::ret(xs.tail)
   }
   ret
 }
 def square_list = apply_f2(x=>x*x)
 println(square_list(l2))
println( apply_f2(x=>x*x)(l2))//Gives the same result as previous line
 def apply_f3(f:Int=>Int):List[Int]=>List[Int] = {//returns a function: Named or anonymous
   xs=> //Start with types = can infer from apply_f2's return type
     if(xs.isEmpty) Nil
     else {
       def recurse_fun = apply_f3(f)
       f(xs.head)::recurse_fun(xs.tail)//apply_f3(f)  IS xs=> if ....
     }
 }
 apply_f3(x=>x*x*x)(l2)
 */
}