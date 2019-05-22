object Problem_3
{
  def main(args: Array[String])
  {
    def checkFunction(xs: List[Int], f:Int => Boolean) :List[Int] = {
      if(xs.isEmpty) Nil 
      else if(f(xs.head) == true) xs.head::checkFunction(xs.tail, f)
      else checkFunction(xs.tail, f)
    }
    
    def arr = List(1, 2, 4, 20, 5)
    println(checkFunction(arr, x=>x > 3))
  }
}