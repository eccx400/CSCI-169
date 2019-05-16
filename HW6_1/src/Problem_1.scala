object Problem_1
{
  def main(args: Array[String])
  {
    def combine(f:Int => Int, x:Int, g:Int => Int) :Int
    {
      
    }
    
    def add(x:Int, y:Int) :Int = x+y
    def square(x:Int):Int = x*x

    combine(square, 4, add)
  
    def mult(x:Int, y:Int) :Int = x*y
    combine(x=>x, 4, mult)
  }
}