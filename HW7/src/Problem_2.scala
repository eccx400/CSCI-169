object Problem_2
{
  def main(args: Array[String])
  {
        
    def sum(x: Int, y: Int): Int = x+y 
    def yeet(x: Int, y: Int) :Int = x*x+y
    
    def newfunc(xs: List[Int], ys: List[Int], f: (Int, Int) => Int) :List[Int] = 
    {
      if ((xs.isEmpty) && (ys.isEmpty)) Nil
      else f(xs.head, ys.head)::newfunc(xs.tail, ys.tail, f)
    }
    
    def arr = List(1, 2, 3)
    def arr2 = List(4, 5, 6)
    
    println(newfunc(arr, arr2, ((x,y) => x+y)))
    println(newfunc(arr, arr2, ((x,y) => x*x+y)))
  }
}