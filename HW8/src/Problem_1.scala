object Problem_1
{
  def main(args: Array[String])
  {
    def forloop(i: Int, cond: Int => Boolean, f:Int => Int)(b: => Unit) :Unit = {
      if(cond(i))
      {
          b
          forloop(f(i), cond, f)(b)
      }
    }
    
    forloop(0, x=>x < 5, x=>x + 1)(println(("Hello World")))
  }
}  