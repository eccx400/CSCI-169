object Problem_1
{
  def main(args: Array[String])
  {
    def add(x:Int, y:Int) :Int = x+y
    def square(x:Int):Int = x*x
    
    def mult(x:Int, y:Int) :Int = x*y
        
    def combine(f:Int => Int, x:Int, g:(Int, Int) => Int) :Int = if (x == 1) f(1) else g(combine (f, x-1, g), f(x))

    println(combine(square, 4, add))
    println(combine(x=>x, 4, mult))
  }
}